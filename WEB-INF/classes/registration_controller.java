import s_dao.studentDao;
import Bean.student;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class registration_controller extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String	email = request.getParameter("email");
		student u = new student();
		u.setDetails(name,email);
		studentDao d = new studentDao();
		int id = d.enroll(u);
		request.setAttribute("ID",id);
		request.getRequestDispatcher("rules.jsp").forward(request,response);
	}
}