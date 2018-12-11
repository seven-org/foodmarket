package code.seven.test.market.user.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_user_signin_award_goods database table.
 * 
 */
@Entity
@Table(name="t_user_signin_award_goods")
@NamedQuery(name="UserSigninAwardGoods.findAll", query="SELECT u FROM UserSigninAwardGoods u")
public class UserSigninAwardGoods extends code.seven.test.market.user.entity.template.DefaultEntity implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String description;

	private String detail;

	private String image;

	private String name;

	public UserSigninAwardGoods() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}