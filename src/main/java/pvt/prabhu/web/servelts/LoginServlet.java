package pvt.prabhu.web.servelts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int hitCount = 0;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
		System.out.println("init called");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("total hits are: " + ++hitCount);
		String userId = request.getParameter("inputEmail");
		String password = request.getParameter("inputPassword");
		
		if("prabhu".equalsIgnoreCase(userId) && "imcs".equals(password)) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/home.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("here is there the pror");
			RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
			rd.forward(request, response);
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
