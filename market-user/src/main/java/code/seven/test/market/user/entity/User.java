package code.seven.test.market.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_user database table.
 * 
 */
@Entity
@Table(name="t_user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User extends code.seven.test.market.user.entity.template.DefaultEntity implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="china_id")
	private String chinaId;

	@Column(name="client_id")
	private String clientId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String email;

	@Column(name="family_id")
	private Integer familyId;

	private Integer flag;

	@Column(name="freeze_money")
	private BigInteger freezeMoney;

	private Integer grade;

	private BigInteger integral;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_get_inner_mail_time")
	private Date lastGetInnerMailTime;

	@Column(name="microblog_unionid")
	private String microblog_unionId;

	private BigInteger money;

	private String name;

	private String password;

	@Column(name="payment_password")
	private String paymentPassword;

	private String phone;

	private String photo;

	@Column(name = "qq_unionid")
	private String qq_unionId;

	@Column(name="register_method")
	private Integer registerMethod;

	private Integer sex;

	private Integer status;

	@Column(name="template_name")
	private String templateName;

	private String token;

	@Column(name="user_label_id")
	private Integer userLabelId;

	@Column(name="wechat_open_id")
	private String wechatOpenId;

	@Column(name = "wechat_unionid")
	private String wechat_unionId;

	public User() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChinaId() {
		return this.chinaId;
	}

	public void setChinaId(String chinaId) {
		this.chinaId = chinaId;
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

	public Integer getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(Integer familyId) {
		this.familyId = familyId;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public BigInteger getFreezeMoney() {
		return this.freezeMoney;
	}

	public void setFreezeMoney(BigInteger freezeMoney) {
		this.freezeMoney = freezeMoney;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
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

	public String getMicroblog_unionId() {
		return this.microblog_unionId;
	}

	public void setMicroblog_unionId(String microblog_unionId) {
		this.microblog_unionId = microblog_unionId;
	}

	public BigInteger getMoney() {
		return this.money;
	}

	public void setMoney(BigInteger money) {
		this.money = money;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPaymentPassword() {
		return this.paymentPassword;
	}

	public void setPaymentPassword(String paymentPassword) {
		this.paymentPassword = paymentPassword;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getQq_unionId() {
		return this.qq_unionId;
	}

	public void setQq_unionId(String qq_unionId) {
		this.qq_unionId = qq_unionId;
	}

	public Integer getRegisterMethod() {
		return this.registerMethod;
	}

	public void setRegisterMethod(Integer registerMethod) {
		this.registerMethod = registerMethod;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getUserLabelId() {
		return this.userLabelId;
	}

	public void setUserLabelId(Integer userLabelId) {
		this.userLabelId = userLabelId;
	}

	public String getWechatOpenId() {
		return this.wechatOpenId;
	}

	public void setWechatOpenId(String wechatOpenId) {
		this.wechatOpenId = wechatOpenId;
	}

	public String getWechat_unionId() {
		return this.wechat_unionId;
	}

	public void setWechat_unionId(String wechat_unionId) {
		this.wechat_unionId = wechat_unionId;
	}

}