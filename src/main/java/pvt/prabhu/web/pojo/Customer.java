package pvt.prabhu.web.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Customers")
public class Customer extends BaseEntity {
	@Id
	@GeneratedValue
	@Column(name = "cid")
	private int cid;
	private String customerName;
	private String firstName;
	private String lastName;
	private int age;
	private int creditLimit;
	
	@Embedded
	private Address address;
	
	@Column(name = "EmpRepNumber")
	private int salesRepEmployNumber;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Order> orders; // has 0 or many orders

	
	public void addOrder(Order order) {
		this.orders.add(order);
	}

	public Customer(String lastUpdatedUser, String customerName, String firstName, String lastName, int age,
			int creditLimit, int salesRepEmployNumber) {
		super(lastUpdatedUser);
		this.customerName = customerName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.creditLimit = creditLimit;
		this.salesRepEmployNumber = salesRepEmployNumber;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return cid + " , " + customerName + " , " + firstName + " , " + age + " , " + salesRepEmployNumber;
	}

}
