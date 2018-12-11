package code.seven.test.market.user.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_user_signin_award database table.
 * 
 */
@Entity
@Table(name="t_user_signin_award")
@NamedQuery(name="UserSigninAward.findAll", query="SELECT u FROM UserSigninAward u")
public class UserSigninAward extends code.seven.test.market.user.entity.template.DefaultEntity implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer days;

	private String icon;

	private String name;

	private Integer type;

	@Column(name="type_id")
	private Integer typeId;

	public UserSigninAward() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDays() {
		return this.days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

}