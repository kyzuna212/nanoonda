package statistics.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import statistics.model.vo.Statistics;

/**
 * Servlet implementation class ReasonQuitInsertServlet
 */
@WebServlet("/rqinsert")
public class ReasonQuitInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReasonQuitInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 탈퇴이유 등록
		Statistics statistics = new Statistics();
		//statistics.setReasonQuit(request.getParameter("reason_quit"));
		
		RequestDispatcher view = null;
		int result = 0;
		if(result > 0) {
			view = request.getRequestDispatcher("views/common/adminheader.jsp"); 
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "탈퇴이유 등록 실패");
			view.forward(request, response);
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
