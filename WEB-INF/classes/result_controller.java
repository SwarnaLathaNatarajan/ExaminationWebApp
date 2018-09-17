import q_dao.questionDao;
import s_dao.studentDao;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class result_controller extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		int m=0,i=0;
		PrintWriter out = response.getWriter();
		int id = Integer.valueOf(request.getParameter("t_id"));
		String[] quid= request.getParameterValues("qid");
		int[] qid=new int[quid.length];
		for(i=0;i<quid.length;i++){
        qid[i]=Integer.parseInt(quid[i]);
        System.out.println(qid[i]);
         System.out.println(quid[i]);
    }
		studentDao st=new studentDao();
		questionDao q = new questionDao();
		String[] answers=q.getAnswers(qid);
		for(i=0;i<answers.length;i++)
			System.out.println("---"+answers[i]);
		String[] details=st.getDetails(id);
		//Compute score
		String[] s=new String[5];
		s[0]=request.getParameter("0");System.out.println(s[0]);
		s[1]=request.getParameter("1");System.out.println(s[1]);
		s[2]=request.getParameter("2");System.out.println(s[2]);
		s[3]=request.getParameter("3");System.out.println(s[3]);
		s[4]=request.getParameter("4");System.out.println(s[4]);
		for(i=0;i<5;i++)
		{	
		if(s[i]!=null)
		{
		if(s[i].equals(answers[i]))
		{
			m++;
		}
	}
	}System.out.println(m);
		st.setScore(m,id);
		request.setAttribute("details", details);  
		request.setAttribute("id",id);
		request.setAttribute("score",m);
		request.getRequestDispatcher("result.jsp").forward(request,response);
	}
}