package code.seven.test.market.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_user_signin database table.
 * 
 */
@Entity
@Table(name="t_user_signin")
@NamedQuery(name="UserSignin.findAll", query="SELECT u FROM UserSignin u")
public class UserSignin extends code.seven.test.market.user.entity.template.DefaultEntity implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="create_time_search_string")
	private String createTimeSearchString;

	@Column(name="user_id")
	private Integer userId;

	public UserSignin() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateTimeSearchString() {
		return this.createTimeSearchString;
	}

	public void setCreateTimeSearchString(String createTimeSearchString) {
		this.createTimeSearchString = createTimeSearchString;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}