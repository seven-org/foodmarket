package code.seven.test.market.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_user_signin_award_goods_order database table.
 * 
 */
@Entity
@Table(name="t_user_signin_award_goods_order")
@NamedQuery(name="UserSigninAwardGoodsOrder.findAll", query="SELECT u FROM UserSigninAwardGoodsOrder u")
public class UserSigninAwardGoodsOrder extends code.seven.test.market.user.entity.template.DefaultEntity implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String consignee;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="goods_id")
	private Integer goodsId;

	@Column(name="receiver_address")
	private String receiverAddress;

	@Column(name="receiver_location")
	private String receiverLocation;

	@Column(name="receiver_phone")
	private String receiverPhone;

	@Column(name="take_delivery_id")
	private Integer takeDeliveryId;

	@Column(name="user_id")
	private Integer userId;

	public UserSigninAwardGoodsOrder() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverLocation() {
		return this.receiverLocation;
	}

	public void setReceiverLocation(String receiverLocation) {
		this.receiverLocation = receiverLocation;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public Integer getTakeDeliveryId() {
		return this.takeDeliveryId;
	}

	public void setTakeDeliveryId(Integer takeDeliveryId) {
		this.takeDeliveryId = takeDeliveryId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}