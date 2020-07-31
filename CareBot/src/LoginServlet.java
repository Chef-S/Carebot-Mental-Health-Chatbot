

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String email= request.getParameter("email");
	    String psw=request.getParameter("psw");
	    String psw_repeat=request.getParameter("psw_repeat");
	
	    MemberBean memberBean2 = new MemberBean(email,psw,psw_repeat);
	    LoginDao dao2= new LoginDao();
	    int result3;
	    result3=dao2.validate(memberBean2);
	    if(result3==1) {
	    	
	    response.sendRedirect("http://localhost:9002/CareBot/Chatpage.jsp");
	    	}
	    else if(result3==0){
	    	response.sendRedirect("http://localhost:9002/CareBot/LoginPage.jsp");
	    }
	}

}
