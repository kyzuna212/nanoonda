package pro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.model.service.ProService;
import pro.model.vo.Pro;
import report.model.service.ReportService;
import report.model.vo.Report;

/**
 * Servlet implementation class ProAdminListServlet
 */
@WebServlet("/plist.ad")
public class ProAdminListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProAdminListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한 페이지 당 10개 씩  출력되는 금지어 목록전체 조회 

				// 페이지 기본 값 지정
				int currentPage = 1;
				// 전송 온 페이지값 추출
				if (request.getParameter("page") != null) {
					currentPage = Integer.parseInt(request.getParameter("page"));
				}

				// 한 페이지당 출력할 목록 갯수 지정
				int limit = 10;

				ProService pservice = new ProService();

				// 전체 목록 갯수 조회
				int listCount = pservice.proGetListCount();

				// 현재 페이지에 출력할 게시글 목록 조회
				ArrayList<Pro> list = pservice.proSelectList(currentPage, limit);

				// 밑에 나올 페이지 숫자를 계산해야 함
				int maxPage = (int) ((double) listCount / limit + 0.9);
				// 현재 페이지가 속한 그룹의 시작 페이지 수 지정
				int startPage = ((int) ((double) currentPage / limit + 0.9) - 1) * limit + 1;
				int endPage = startPage + limit - 1;

				if (maxPage < endPage) {
					endPage = maxPage;
				}
				
				
				// 뷰 지정해서 내보내기
				RequestDispatcher view = null;
				if (list.size() > 0) {
					view = request.getRequestDispatcher("views/pro/proListView.jsp");
					request.setAttribute("list", list);
					request.setAttribute("currentPage", currentPage);
					request.setAttribute("maxPage", maxPage);
					request.setAttribute("startPage", startPage);
					request.setAttribute("endPage", endPage);
					request.setAttribute("listCount", listCount);
					
					view.forward(request, response);
				} else {
					 response.setContentType("text/html; charset=UTF-8");
			           PrintWriter out = response.getWriter();
			           out.println("<script>alert('금지어 목록이 존재하지 않습니다.'); location.href='/nnd/plist.ad?page=1;</script>");
			           out.flush();
			           out.close();
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
