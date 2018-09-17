import q_dao.questionDao;
import Bean.question;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class exam_controller extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id = Integer.valueOf(request.getParameter("t_id"));
		question obj=new question();
		questionDao q = new questionDao();
		int[] qid=q.setDetails(obj);
		String[] questions=obj.getq();
		String[] answers=obj.geta();
		String[] A=obj.getA();
		String[] B=obj.getB();
		String[] C=obj.getC();
		String[] D=obj.getD();
		String[] q_id=new String[5];
		request.setAttribute("ID",String.valueOf(id));
		//request.setAttribute("QID",qid);
		request.setAttribute("q", questions);      
		request.setAttribute("a", answers);  
		request.setAttribute("A", A);
		request.setAttribute("B", B);  
		request.setAttribute("C", C);  
		request.setAttribute("D", D);  
		for(int i=0;i<5;i++)
		{
			q_id[i]=String.valueOf(qid[i]);
		}
		request.setAttribute("qid", q_id);
		request.getRequestDispatcher("exam.jsp").forward(request,response);
	}
}