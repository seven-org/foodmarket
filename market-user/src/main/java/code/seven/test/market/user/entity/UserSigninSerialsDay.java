package code.seven.test.market.user.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_user_signin_serials_day database table.
 * 
 */
@Entity
@Table(name="t_user_signin_serials_day")
@NamedQuery(name="UserSigninSerialsDay.findAll", query="SELECT u FROM UserSigninSerialsDay u")
public class UserSigninSerialsDay extends code.seven.test.market.user.entity.template.DefaultEntity implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="acquired_award_ids")
	private String acquiredAwardIds;

	private Integer days;

	@Column(name="user_id")
	private Integer userId;

	public UserSigninSerialsDay() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcquiredAwardIds() {
		return this.acquiredAwardIds;
	}

	public void setAcquiredAwardIds(String acquiredAwardIds) {
		this.acquiredAwardIds = acquiredAwardIds;
	}

	public Integer getDays() {
		return this.days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}