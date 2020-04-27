package co.cjpark.shop.shopManager.service;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("sysAdminVo")
public class SysAdminVo {
	private int sNum;					//일련번호
	private String mRegister;		//회원 사업자등록번호
	private String mAuthority;		//회원 권한(다중 or 싱글)
	private int mEmployeeNum;	//사용자수 (기본값 1)
	private Date startDate;			//가입일자
	private Date endDate;			//탈퇴일자
	
	private Date sysUpdate;		//변경일자
	private String upDateType;	//변경구분(권한, 사용자 수)
	
	public SysAdminVo() {
		// TODO Auto-generated constructor stub
	}

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public String getmRegister() {
		return mRegister;
	}

	public void setmRegister(String mRegister) {
		this.mRegister = mRegister;
	}

	public String getmAuthority() {
		return mAuthority;
	}

	public void setmAuthority(String mAuthority) {
		this.mAuthority = mAuthority;
	}

	public int getmEmployeeNum() {
		return mEmployeeNum;
	}

	public void setmEmployeeNum(int mEmployeeNum) {
		this.mEmployeeNum = mEmployeeNum;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getSysUpdate() {
		return sysUpdate;
	}

	public void setSysUpdate(Date sysUpdate) {
		this.sysUpdate = sysUpdate;
	}

	public String getUpDateType() {
		return upDateType;
	}

	public void setUpDateType(String upDateType) {
		this.upDateType = upDateType;
	}
	
}
