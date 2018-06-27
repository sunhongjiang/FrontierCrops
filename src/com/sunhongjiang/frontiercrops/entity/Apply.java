package com.sunhongjiang.frontiercrops.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "tbl_apply")
public class Apply {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@GeneratedValue(generator = "uuid")
	private String id;
	// 船名
	@Column
	private String shipName;
	// 船籍港
	@Column
	private String shipPort;
	// 船主
	@Column
	private String shipOwner;
	// 航行区域
	@Column
	private String navigationArea;
	// 船上负责人
	@Column
	private String captain;
	// 负责人现住址
	@Column
	private String captainAddress;
	// 船舶所属单位
	@Column
	private String shipInstitute;
	// 委托单位
	@Column
	private String entrustUnit;
	// 负责人联系方式
	@Column
	private String captainTel;
	// 船质
	@Column
	private String shipQuality;
	// 作业类型
	@Column
	private String jobType;
	// 船主身份证号码
	@Column
	private String ownerId;
	// 常住地泊点
	@Column
	private String stopArea;
	// 船上负责人身份证号码
	@Column
	private String captainId;
	// 是否通过
	@Column
	private String pass;
	// 审核意见
	@Column
	private String coment;
	// 申请人
	@Column
	private String applier;
	// 标题
	@Column
	private String title;

	public String getId() {
		return id;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipPort() {
		return shipPort;
	}

	public void setShipPort(String shipPort) {
		this.shipPort = shipPort;
	}

	public String getShipOwner() {
		return shipOwner;
	}

	public void setShipOwner(String shipOwner) {
		this.shipOwner = shipOwner;
	}

	public String getNavigationArea() {
		return navigationArea;
	}

	public void setNavigationArea(String navigationArea) {
		this.navigationArea = navigationArea;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public String getCaptainAddress() {
		return captainAddress;
	}

	public void setCaptainAddress(String captainAddress) {
		this.captainAddress = captainAddress;
	}

	public String getShipInstitute() {
		return shipInstitute;
	}

	public void setShipInstitute(String shipInstitute) {
		this.shipInstitute = shipInstitute;
	}

	public String getEntrustUnit() {
		return entrustUnit;
	}

	public void setEntrustUnit(String entrustUnit) {
		this.entrustUnit = entrustUnit;
	}

	public String getCaptainTel() {
		return captainTel;
	}

	public void setCaptainTel(String captainTel) {
		this.captainTel = captainTel;
	}

	public String getShipQuality() {
		return shipQuality;
	}

	public void setShipQuality(String shipQuality) {
		this.shipQuality = shipQuality;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getStopArea() {
		return stopArea;
	}

	public void setStopArea(String stopArea) {
		this.stopArea = stopArea;
	}

	public String getCaptainId() {
		return captainId;
	}

	public void setCaptainId(String captainId) {
		this.captainId = captainId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}

	public String getApplier() {
		return applier;
	}

	public void setApplier(String applier) {
		this.applier = applier;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
