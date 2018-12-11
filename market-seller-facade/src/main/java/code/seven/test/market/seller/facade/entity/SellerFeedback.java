package code.seven.test.market.seller.facade.entity;

import java.io.Serializable;
import java.util.Date;


public class SellerFeedback implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Date createTime;

	private Integer feedbackType;

	private String introduction;

	private String photo;

	private Integer sellerId;

	private Integer status;

	public SellerFeedback() {
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

	public Integer getFeedbackType() {
		return this.feedbackType;
	}

	public void setFeedbackType(Integer feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}