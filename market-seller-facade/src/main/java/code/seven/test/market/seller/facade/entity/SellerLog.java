package code.seven.test.market.seller.facade.entity;

import java.io.Serializable;
import java.util.Date;


public class SellerLog implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Date createTime;

	private Integer sellerId;

	private Integer type;

	public SellerLog() {
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

	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}