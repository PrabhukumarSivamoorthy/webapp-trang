package pvt.prabhu.web.pojo;


import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payments extends BaseEntity{
	
	private int checkNo;
	private Date paymentDate;
	private double amount;
	
// constructor
	public Payments(int checkNo, Date paymentDate, double amount) {
		super();
		this.checkNo = checkNo;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}
	
}
