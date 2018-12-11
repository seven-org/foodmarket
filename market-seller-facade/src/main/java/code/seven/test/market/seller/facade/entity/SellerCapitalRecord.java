package code.seven.test.market.seller.facade.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.math.BigInteger;


public class SellerCapitalRecord implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private BigInteger capitalIntegral;

	private Integer capitalType;

	private BigInteger count;

	private Timestamp createTime;

	private Integer foodMarketId;

	private Integer operation;

	private String operationNumber;

	private String remark;

	private Integer sellerId;

	public SellerCapitalRecord() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigInteger getCapitalIntegral() {
		return this.capitalIntegral;
	}

	public void setCapitalIntegral(BigInteger capitalIntegral) {
		this.capitalIntegral = capitalIntegral;
	}

	public Integer getCapitalType() {
		return this.capitalType;
	}

	public void setCapitalType(Integer capitalType) {
		this.capitalType = capitalType;
	}

	public BigInteger getCount() {
		return this.count;
	}

	public void setCount(BigInteger count) {
		this.count = count;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Integer getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(Integer foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public Integer getOperation() {
		return this.operation;
	}

	public void setOperation(Integer operation) {
		this.operation = operation;
	}

	public String getOperationNumber() {
		return this.operationNumber;
	}

	public void setOperationNumber(String operationNumber) {
		this.operationNumber = operationNumber;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

}