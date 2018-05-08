package pvt.prabhu.web.pojo;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "orderDetails")
public class OrderDetails extends BaseEntity {

	
	private int orderNumber;
	private int orderLineNumber;
	private String productCode;
	private int quantity;
	private double priceEach;
	
	public OrderDetails(int orderNumber, int orderLineNumber, String productCode, int quantity, double priceEach) {
		super();
		this.orderNumber = orderNumber;
		this.orderLineNumber = orderLineNumber;
		this.productCode = productCode;
		this.quantity = quantity;
		this.priceEach = priceEach;
	}
	

	
	
}
