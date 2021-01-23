import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

/**
 * Servlet implementation class UserLoginCheck
 */
@WebServlet("/UserLoginCheck")
public class UserLoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginCheck() {
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
		try{
		response.setContentType("text/html");
		String un= request.getParameter("uname");
		String pwd= request.getParameter("password");
		String destPage ="";
		if(un.equals("ravi") && pwd.equals("kumar")) {
			
			HttpSession session = request.getSession();
		    session.setAttribute("user", un);
		    destPage = "simplelogin.jsp";
			response.sendRedirect("success.jsp");
		}
		
		else {
			response.sendRedirect("failure.jsp");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
