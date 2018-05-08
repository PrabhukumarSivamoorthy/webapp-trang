package pvt.prabhu.web.pojo;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ContactDetails {

	private Long phoneNumber;
	private String email;

	public ContactDetails(Long phoneNumber, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public ContactDetails(String email) {
		super();
		this.email = email;
	}

	public ContactDetails(Long phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
