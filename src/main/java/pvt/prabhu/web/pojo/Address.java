package pvt.prabhu.web.pojo;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Embeddable
public class Address {

	@NotNull
	private String addressLine1;
	private String addressLine2;
	@NotNull
	private String city;
	@NotNull
	private String state;
	private String country;
	private int postalcode;
	@Embedded
	ContactDetails phone;

	// Constructor
	public Address(String addressLine1, String addressLine2, String city, String state, String country, int postalcode,
			ContactDetails phone) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalcode = postalcode;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return " AddressLine1 = " + addressLine1 + " AddressLine2 = " + addressLine2 + " City = " + city + " State ="
				+ state + " Country = " + country + " postalCode = " + postalcode + " phone = "
				+ this.phone.getPhoneNumber();
	}

	public Address() {
		super();
	}

}
