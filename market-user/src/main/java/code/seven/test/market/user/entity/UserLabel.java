package code.seven.test.market.user.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_user_label database table.
 * 
 */
@Entity
@Table(name="t_user_label")
@NamedQuery(name="UserLabel.findAll", query="SELECT u FROM UserLabel u")
public class UserLabel extends code.seven.test.market.user.entity.template.DefaultEntity implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String name;

	public UserLabel() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}