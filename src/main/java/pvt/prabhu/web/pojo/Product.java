package pvt.prabhu.web.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue
	@Column(name="employee_id")
	private int productID;
	private String productName;
	private String productVendor;
	private String productDescription;
	private int quantityInStock;
	private double buyPrice;
	private double _MSRP;
	private ProductLine productLine;
	
	// constructor
	public Product(int productID, String productName, String productVendor, String productDescription,
			int quantityInStock, double buyPrice, double _MSRP, ProductLine productLine) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this._MSRP = _MSRP;
		this.productLine = productLine;
	}
	
	
	

}
