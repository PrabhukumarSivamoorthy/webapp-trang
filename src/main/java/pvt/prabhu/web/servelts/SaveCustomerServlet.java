package pvt.prabhu.web.servelts;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pvt.prabhu.web.pojo.Address;
import pvt.prabhu.web.pojo.ContactDetails;
import pvt.prabhu.web.pojo.Customer;
import pvt.prahbu.web.services.CustomerService;

/**
 * Servlet implementation class SaveCustomerServlet
 */
public class SaveCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerService customerService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveCustomerServlet() {
        super();
        this.customerService = new CustomerService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" heare you go");
		Customer customer = new Customer(request.getParameter("fname"), request.getParameter("fname"), request.getParameter("fname"), request.getParameter("LastName"), 
				18, Integer.parseInt(request.getParameter("creditlimit")), 1);
		ContactDetails phone = new ContactDetails(Long.parseLong(request.getParameter("phoneNumber")),request.getParameter("emailenterd"));
		Address address = new Address(request.getParameter("inputAddress"),request.getParameter("inputAddress2"),
				request.getParameter("inputCity"),"california","Usa",Integer.parseInt(request.getParameter("inputZip")),phone);
		customer.setAddress(address);
		customer.setCid(23);
			request.setAttribute("customer", customer);
			RequestDispatcher rd = request.getRequestDispatcher("/views/customerfulldetails.jsp");
			rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
