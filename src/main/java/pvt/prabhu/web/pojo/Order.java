package pvt.prabhu.web.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

	@Id
	@GeneratedValue
	@Column(name = "OrderNumber")
	private int orderNumber;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedData;
	private Status status;
	private String comments;

	@ManyToOne
	@JoinColumn(name = "customerNumber")
	private Customer customer;

	// constructor
	public Order() {
		super();
	}

	public Order(String lastUpdatedUser, Date timeStamp, Date orderDate, Date requiredDate, Date shippedData,
			Status status, String comments) {
		super(lastUpdatedUser);
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedData = shippedData;
		this.status = status;
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "{" + orderDate + " , " + orderNumber + " , " + comments + " , " + requiredDate + " , " + shippedData
				+ " , " + status + " , " + customer.getCid() + "}";
	}

}
