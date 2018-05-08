package pvt.prabhu.web.servelts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pvt.prabhu.web.pojo.Customer;
import pvt.prahbu.web.services.CustomerService;

/**
 * Servlet implementation class CustomerSearchServlet
 */
public class CustomerSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerService customerService;
    
    public CustomerSearchServlet() {
        super();
        this.customerService = new CustomerService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId = Integer.parseInt(request.getParameter("cid"));
		Customer customer = customerService.getCustomer(customerId);
		if(customer !=null) {
			request.setAttribute("customer", customer);
			RequestDispatcher rd = request.getRequestDispatcher("/views/customer.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/views/home.jsp");
			rd.forward(request, response);
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
