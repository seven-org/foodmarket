package code.seven.test.market.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_user_coupon database table.
 * 
 */
@Entity
@Table(name="t_user_coupon")
@NamedQuery(name="UserCoupon.findAll", query="SELECT u FROM UserCoupon u")
public class UserCoupon extends code.seven.test.market.user.entity.template.DefaultEntity implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="coupon_code")
	private String couponCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String reason;

	private Integer status;

	@Column(name="user_id")
	private Integer userId;

	public UserCoupon() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}