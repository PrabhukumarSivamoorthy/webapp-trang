package pvt.prabhu.web.pojo;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity {

	private String lastUpdatedUser;
	private Date timeStamp = new Date();

	public BaseEntity(String lastUpdatedUser) {
		super();
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public BaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
