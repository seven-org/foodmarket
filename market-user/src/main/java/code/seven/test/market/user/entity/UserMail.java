package code.seven.test.market.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_user_mail database table.
 * 
 */
@Entity
@Table(name="t_user_mail")
@NamedQuery(name="UserMail.findAll", query="SELECT u FROM UserMail u")
public class UserMail extends code.seven.test.market.user.entity.template.DefaultEntity implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="expired_time")
	private Date expiredTime;

	private String from;

	@Column(name="from_type")
	private Integer fromType;

	@Column(name="is_readed")
	private Integer isReaded;

	private String to;

	@Column(name="to_type")
	private Integer toType;

	private Integer type;

	private String value;

	public UserMail() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Integer getFromType() {
		return this.fromType;
	}

	public void setFromType(Integer fromType) {
		this.fromType = fromType;
	}

	public Integer getIsReaded() {
		return this.isReaded;
	}

	public void setIsReaded(Integer isReaded) {
		this.isReaded = isReaded;
	}

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Integer getToType() {
		return this.toType;
	}

	public void setToType(Integer toType) {
		this.toType = toType;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}