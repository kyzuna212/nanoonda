/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-11-24 13:53:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import report.model.vo.Report;
import member.model.vo.Member;
import member.model.vo.Member;

public final class reportAdminDetailView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/report/../../views/common/meta.jsp", Long.valueOf(1597472488000L));
    _jspx_dependants.put("/views/report/../common/adminheader.jsp", Long.valueOf(1597648123466L));
    _jspx_dependants.put("/views/report/../pro/proModalView.jsp", Long.valueOf(1597345956000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("report.model.vo.Report");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("  \r\n");

	Report report = (Report)request.getAttribute("report");

      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 관리자가 신고게시판에서 제목누르면 나오는 상세보기  -->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>NANOONDA REPORT</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>NANOONDA</title>\r\n");
      out.write("<link href=\"/nnd/resources/css/basic.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"/nnd/resources/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"/nnd/resources/css/diarystyle.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"/nnd/resources/css/poststyle.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"/nnd/resources/css/adminstyle.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"/nnd/resources/css/themify-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/nnd/resources/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/nnd/resources/js/script.js\"></script>\r\n");
      out.write("<!--탭:js-->\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 이거 있어야 됨 관리자 사이드바 두줄 -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("\r\n");
      out.write("</head>");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
      out.write(' ');
     
	Member loginMember = (Member)session.getAttribute("loginMember");
	                                  

      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the top navigation bar */\r\n");
      out.write(".topnav {\r\n");
      out.write("  \r\n");
      out.write("  /* overflow: hidden; */\r\n");
      out.write(" /*  background-color: #333; */\r\n");
      out.write(" background-color: #2a3954;\r\n");
      out.write("  text-align:center\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the topnav links */\r\n");
      out.write(".topnav a {\r\n");
      out.write("  /* float: left; */\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  width: 200px;\r\n");
      out.write("  margin-left: 600;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change color on hover */\r\n");
      out.write(".topnav a:hover {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav ul{\r\n");
      out.write("\t/* display:inline-block ; */\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the content */\r\n");
      out.write(".content {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  height: 400px; /* Should be removed. Only for demonstration */\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("</style>\r\n");
      out.write("<title>NANOONDA</title>\r\n");
      out.write("<script>\r\n");
      out.write("var ScrollTop = 0,\r\n");
      out.write("top = 15;\r\n");
      out.write("$(window).scroll(function(event) {\r\n");
      out.write("   var st = $(this).scrollTop();\r\n");
      out.write("   if (Math.abs(ScrollTop - st) <= top) return;\r\n");
      out.write("   if ((st > ScrollTop) && (ScrollTop > 0)) {\r\n");
      out.write("      $(\".topnav\").addClass(\"on\");\r\n");
      out.write("   } else {\r\n");
      out.write("      $(\".topnav\").removeClass(\"on\");\r\n");
      out.write("   }\r\n");
      out.write("   ScrollTop = st;\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"toplogo clear\">\r\n");
      out.write("\t<!-- 현재 로고만 넣어둔 상태, 이미지로 변경해야할지 결정할 것 -->\r\n");
      out.write("\t<!-- <h1 id=\"logo\">NANOONDA</h1> -->\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("\t<a href=\"/nnd/seinsert\" ><img src=\"/nnd/resources/images/admin_logo.png\" ></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 아이콘  -->\r\n");
      out.write("\t<div id=\"adminicon\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>");
      out.print(loginMember.getnName());
      out.write("님 환영합니다.</p>\r\n");
      out.write("\t\t<div id=\"logouticon\">\r\n");
      out.write("\t\t\t<a href=\"/nnd/logout\">로그아웃</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div id=\"adminmypage\">\r\n");
      out.write("\t\t\t<a href=\"/nnd/myinfo?id=");
      out.print(loginMember.getId());
      out.write("\">my page  |</a>\r\n");
      out.write("\t\t\t<a href=\"/nnd/calenderlist\">userpage</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> <!-- 로그인 완료후 값 가져온 걸로 바꾸기 -->\r\n");
      out.write("</div>\r\n");
      out.write("<!--top 메뉴바-->\r\n");
      out.write("<div class=\"topnav\">\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><a href=\"/nnd/mlist\">회원관리</a></li>\r\n");
      out.write("\t<li><a href=\"/nnd/rlist.ad?page=1\">신고관리</a></li>\r\n");
      out.write("\t<li><a href=\"/nnd/anlist?page=1\">공지사항관리</a></li>\r\n");
      out.write("\t<li><a href=\"/nnd/aqlist\">문의사항관리</a></li>\r\n");
      out.write("\t<!-- <li><a href=\"/nnd/seinsert\">통계관리</a></li> -->\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write(' ');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 신고하기 모달창 -->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"w3-container\">  \r\n");
      out.write("<div id=\"id01\" class=\"w3-modal\">\r\n");
      out.write("<div class=\"w3-modal-content w3-card-4 w3-animate-zoom\" style=\"max-width:600px\">\r\n");
      out.write("<div class=\"w3-center\">\r\n");
      out.write("  <br>\r\n");
      out.write("<span onclick=\"document.getElementById('id01').style.display='none'\" class=\"w3-button w3-xlarge w3-hover-red w3-display-topright\" title=\"Close Modal\">&times;</span>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <form class=\"w3-container\" action=\"/nnd/pinsert.ad\">\r\n");
      out.write("        <div class=\"w3-section\">\r\n");
      out.write("          <label><b>새로 등록할 금지어를 입력하세요</b></label>\r\n");
      out.write("          <input class=\"w3-input w3-border w3-margin-bottom\" type=\"text\" placeholder=\"금지어를 입력하세요\" name=\"procontent\" required>\r\n");
      out.write("          \r\n");
      out.write("          <br>\r\n");
      out.write("          <br>\r\n");
      out.write("        \r\n");
      out.write("          <button class=\"w3-button w3-block w3-green w3-section w3-padding\" type=\"submit\" onclick=\"javascript:location.href='/nnd/pinsert.ad'\" style=\" width : 30%;  float : right; \">등록하기</button>\r\n");
      out.write("          <button onclick=\"document.getElementById('id01').style.display='none'\" type=\"button\" class=\"w3-button w3-block w3-red w3-section w3-padding\" style=\" width : 30%;  float : left; \">취소</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div> \r\n");
      out.write("            \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"ad_listview\"> <!-- 전체 묶은 div : start -->\t\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"ad_pagetit\"><span>Report Management</span>신고내역 상세보기</h1>\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<table align=\"center\" class=\"w3-table-all w3-small serchlist\" >\r\n");
      out.write("\r\n");
      out.write("<tr><th>제목</th><td>");
      out.print( report.getReportTiltle() );
      out.write("</td></tr>\r\n");
      out.write("<tr><th>신고자</th><td>");
      out.print( report.getsenderNname() );
      out.write("</td></tr>\r\n");
      out.write("<tr><th>처리상태</th>\r\n");
      out.write("<td>\r\n");
if(Integer.parseInt(report.getReportStatus())==0){ 
      out.write("\r\n");
      out.write("미처리\r\n");
}else{ 
      out.write("\r\n");
      out.write("처리\r\n");
} 
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><th>신고받은자</th><td>");
      out.print( report.getreceiverNname() );
      out.write("</td></tr>\r\n");
      out.write("<tr><th>내용</th><td>");
      out.print( report.getReportContent() );
      out.write("</td></tr>\r\n");
      out.write("<tr><th>신고날짜</th><td>");
      out.print( report.getReportRegDate() );
      out.write("</td></tr>\r\n");
      out.write("<tr><th>처리완료날짜</th>\r\n");
      out.write("<td>\r\n");
if(report.getReportComDate()==null){ 
      out.write("\r\n");
      out.write("&nbsp;\r\n");
}else{ 
      out.write('\r');
      out.write('\n');
      out.print( report.getReportComDate() );
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<!-- 상세보기에서 목록으로 돌아가기 -->\r\n");
      out.write("<tr><th colspan=\"2\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"ad_detailbtn\">\r\n");
      out.write("<input type=\"button\" id=\"returnlist\" value=\"목록\" onclick=\"location.href='/nnd/rlist.ad?page=1'; return false;\" style=\"cursor:pointer; \">\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" id=\"reportyellow\" value=\"경고주기\" onclick=\"javascript:location.href='/nnd/rstcheck.ad?rno=");
      out.print(report.getReportNo() );
      out.write("&writer=");
      out.print(report.getreceiverNname() );
      out.write("'\" style=\"cursor:pointer; \">\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" id=\"addpro\" value=\"금지어로등록\" onclick=\"document.getElementById('id01').style.display='block'\" style=\"cursor:pointer; \">\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" id=\"reportdelete\" value=\"삭제\" onclick=\"javascript:location.href='/nnd/radonedelete.ad?rno=");
      out.print(report.getReportNo());
      out.write("'\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" id=\"reportcom\" value=\"처리완료\" onclick=\"javascript:location.href='/nnd/rsimplech?rno=");
      out.print(report.getReportNo() );
      out.write("'\" style=\"cursor:pointer; \">\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" id=\"reportcom\" value=\"해당 게시글로가기\" onclick=\"javascript:location.href='/nnd/rsimplech?rno=");
      out.print(report.getReportNo() );
      out.write("'\" style=\"cursor:pointer; \">\r\n");
      out.write("<input type=\"hidden\" value=\"\" name=\"writeno\">\r\n");
      out.write("</div>\r\n");
      out.write("</th></tr>\r\n");
      out.write("</table>\r\n");
      out.write("  \r\n");
      out.write("          \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
