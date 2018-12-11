package code.seven.test.market.seller.facade.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;


public class Seller implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String account;

	private Integer adminId;

	private String checkoutCard;

	private String checkoutDate;

	private Integer checkoutType;

	private String clientId;

	private Date createTime;

	private String email;

	private Integer foodMarketId;

	private String idCard;

	private Date idCardEndDate;

	private String idCardPhotoFront;

	private String idCardPhotoOpposite;

	private Date idCardStartDate;

	private BigInteger integral;

	private Date lastGetInnerMailTime;

	private Date lastLogin;

	private String lastLoginIp;

	private BigInteger money;

	private String password;

	private String phone;

	private String rate;

	private String sellerName;

	private Integer stallId;

	private String stallName;

	private String stallNo;

	private Integer stallTypeId;

	private Integer status;

	private String token;

	public Seller() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getCheckoutCard() {
		return this.checkoutCard;
	}

	public void setCheckoutCard(String checkoutCard) {
		this.checkoutCard = checkoutCard;
	}

	public String getCheckoutDate() {
		return this.checkoutDate;
	}

	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Integer getCheckoutType() {
		return this.checkoutType;
	}

	public void setCheckoutType(Integer checkoutType) {
		this.checkoutType = checkoutType;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(Integer foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getIdCardEndDate() {
		return this.idCardEndDate;
	}

	public void setIdCardEndDate(Date idCardEndDate) {
		this.idCardEndDate = idCardEndDate;
	}

	public String getIdCardPhotoFront() {
		return this.idCardPhotoFront;
	}

	public void setIdCardPhotoFront(String idCardPhotoFront) {
		this.idCardPhotoFront = idCardPhotoFront;
	}

	public String getIdCardPhotoOpposite() {
		return this.idCardPhotoOpposite;
	}

	public void setIdCardPhotoOpposite(String idCardPhotoOpposite) {
		this.idCardPhotoOpposite = idCardPhotoOpposite;
	}

	public Date getIdCardStartDate() {
		return this.idCardStartDate;
	}

	public void setIdCardStartDate(Date idCardStartDate) {
		this.idCardStartDate = idCardStartDate;
	}

	public BigInteger getIntegral() {
		return this.integral;
	}

	public void setIntegral(BigInteger integral) {
		this.integral = integral;
	}

	public Date getLastGetInnerMailTime() {
		return this.lastGetInnerMailTime;
	}

	public void setLastGetInnerMailTime(Date lastGetInnerMailTime) {
		this.lastGetInnerMailTime = lastGetInnerMailTime;
	}

	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public BigInteger getMoney() {
		return this.money;
	}

	public void setMoney(BigInteger money) {
		this.money = money;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Integer getStallId() {
		return this.stallId;
	}

	public void setStallId(Integer stallId) {
		this.stallId = stallId;
	}

	public String getStallName() {
		return this.stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public String getStallNo() {
		return this.stallNo;
	}

	public void setStallNo(String stallNo) {
		this.stallNo = stallNo;
	}

	public Integer getStallTypeId() {
		return this.stallTypeId;
	}

	public void setStallTypeId(Integer stallTypeId) {
		this.stallTypeId = stallTypeId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}