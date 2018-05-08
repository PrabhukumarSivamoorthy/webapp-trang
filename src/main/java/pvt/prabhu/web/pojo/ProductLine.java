package pvt.prabhu.web.pojo;



import lombok.Data;

@Data
public class ProductLine {
	
	private int productLine;
	private String textDescription;
	private String htmlDescription;
	private byte[] image;
	
	// contructor
	public ProductLine(int productLine, String textDescription, String htmlDescription, byte[] image) {
		super();
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
	}
	
	//List<Product> products;


	
}
