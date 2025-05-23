package com.finsol.entity;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name = "employee_salary_details")
public class EmployeeSalaryDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer eCode;

	private String eName;
	private Integer deptCode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer geteCode() {
		return eCode;
	}
	public void seteCode(Integer eCode) {
		this.eCode = eCode;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(Integer deptCode) {
		this.deptCode = deptCode;
	}
	public Integer getDesigno() {
		return designo;
	}
	public void setDesigno(Integer designo) {
		this.designo = designo;
	}
	public Integer getgCode() {
		return gCode;
	}
	public void setgCode(Integer gCode) {
		this.gCode = gCode;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getVpfType() {
		return vpfType;
	}
	public void setVpfType(Integer vpfType) {
		this.vpfType = vpfType;
	}
	public String getPfCode() {
		return pfCode;
	}
	public void setPfCode(String pfCode) {
		this.pfCode = pfCode;
	}
	public String getQtr() {
		return qtr;
	}
	public void setQtr(String qtr) {
		this.qtr = qtr;
	}
	public String geteTan() {
		return eTan;
	}
	public void seteTan(String eTan) {
		this.eTan = eTan;
	}
	public BigDecimal getArrears() {
		return arrears;
	}
	public void setArrears(BigDecimal arrears) {
		this.arrears = arrears;
	}
	public BigDecimal getApf() {
		return apf;
	}
	public void setApf(BigDecimal apf) {
		this.apf = apf;
	}
	public BigDecimal getAppf() {
		return appf;
	}
	public void setAppf(BigDecimal appf) {
		this.appf = appf;
	}
	public BigDecimal getAhra() {
		return ahra;
	}
	public void setAhra(BigDecimal ahra) {
		this.ahra = ahra;
	}
	public BigDecimal getHralo() {
		return hralo;
	}
	public void setHralo(BigDecimal hralo) {
		this.hralo = hralo;
	}
	public BigDecimal getObRate() {
		return obRate;
	}
	public void setObRate(BigDecimal obRate) {
		this.obRate = obRate;
	}
	public BigDecimal getIncre() {
		return incre;
	}
	public void setIncre(BigDecimal incre) {
		this.incre = incre;
	}
	public BigDecimal getbRate() {
		return bRate;
	}
	public void setbRate(BigDecimal bRate) {
		this.bRate = bRate;
	}
	public BigDecimal getEls() {
		return els;
	}
	public void setEls(BigDecimal els) {
		this.els = els;
	}
	public BigDecimal getEarn() {
		return earn;
	}
	public void setEarn(BigDecimal earn) {
		this.earn = earn;
	}
	public BigDecimal getBonus() {
		return bonus;
	}
	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}
	public BigDecimal getOnemth() {
		return onemth;
	}
	public void setOnemth(BigDecimal onemth) {
		this.onemth = onemth;
	}
	public BigDecimal getOt() {
		return ot;
	}
	public void setOt(BigDecimal ot) {
		this.ot = ot;
	}
	public BigDecimal getMgr() {
		return mgr;
	}
	public void setMgr(BigDecimal mgr) {
		this.mgr = mgr;
	}
	public BigDecimal getUniform() {
		return uniform;
	}
	public void setUniform(BigDecimal uniform) {
		this.uniform = uniform;
	}
	public BigDecimal getMedical() {
		return medical;
	}
	public void setMedical(BigDecimal medical) {
		this.medical = medical;
	}
	public BigDecimal getLta() {
		return lta;
	}
	public void setLta(BigDecimal lta) {
		this.lta = lta;
	}
	public String getLtano() {
		return ltano;
	}
	public void setLtano(String ltano) {
		this.ltano = ltano;
	}
	public BigDecimal getOlic() {
		return olic;
	}
	public void setOlic(BigDecimal olic) {
		this.olic = olic;
	}
	public BigDecimal getNsc() {
		return nsc;
	}
	public void setNsc(BigDecimal nsc) {
		this.nsc = nsc;
	}
	public BigDecimal getNscInt() {
		return nscInt;
	}
	public void setNscInt(BigDecimal nscInt) {
		this.nscInt = nscInt;
	}
	public BigDecimal getMfs() {
		return mfs;
	}
	public void setMfs(BigDecimal mfs) {
		this.mfs = mfs;
	}
	public BigDecimal getUlip() {
		return ulip;
	}
	public void setUlip(BigDecimal ulip) {
		this.ulip = ulip;
	}
	public BigDecimal getHla() {
		return hla;
	}
	public void setHla(BigDecimal hla) {
		this.hla = hla;
	}
	public BigDecimal getHlaPrl() {
		return hlaPrl;
	}
	public void setHlaPrl(BigDecimal hlaPrl) {
		this.hlaPrl = hlaPrl;
	}
	public BigDecimal getInfraBond() {
		return infraBond;
	}
	public void setInfraBond(BigDecimal infraBond) {
		this.infraBond = infraBond;
	}
	public BigDecimal getChild1Fee() {
		return child1Fee;
	}
	public void setChild1Fee(BigDecimal child1Fee) {
		this.child1Fee = child1Fee;
	}
	public BigDecimal getChild2Fee() {
		return child2Fee;
	}
	public void setChild2Fee(BigDecimal child2Fee) {
		this.child2Fee = child2Fee;
	}
	public BigDecimal getgSalary() {
		return gSalary;
	}
	public void setgSalary(BigDecimal gSalary) {
		this.gSalary = gSalary;
	}
	public BigDecimal getLtaDedu() {
		return ltaDedu;
	}
	public void setLtaDedu(BigDecimal ltaDedu) {
		this.ltaDedu = ltaDedu;
	}
	public BigDecimal getTrptDedu() {
		return trptDedu;
	}
	public void setTrptDedu(BigDecimal trptDedu) {
		this.trptDedu = trptDedu;
	}
	public BigDecimal getStdDedu() {
		return stdDedu;
	}
	public void setStdDedu(BigDecimal stdDedu) {
		this.stdDedu = stdDedu;
	}
	public BigDecimal getPtxDedu() {
		return ptxDedu;
	}
	public void setPtxDedu(BigDecimal ptxDedu) {
		this.ptxDedu = ptxDedu;
	}
	public BigDecimal getDedu80() {
		return dedu80;
	}
	public void setDedu80(BigDecimal dedu80) {
		this.dedu80 = dedu80;
	}
	public BigDecimal getnSalary() {
		return nSalary;
	}
	public void setnSalary(BigDecimal nSalary) {
		this.nSalary = nSalary;
	}
	public BigDecimal getUs80ccc() {
		return us80ccc;
	}
	public void setUs80ccc(BigDecimal us80ccc) {
		this.us80ccc = us80ccc;
	}
	public BigDecimal getUs80ccf() {
		return us80ccf;
	}
	public void setUs80ccf(BigDecimal us80ccf) {
		this.us80ccf = us80ccf;
	}
	public BigDecimal getUs80d() {
		return us80d;
	}
	public void setUs80d(BigDecimal us80d) {
		this.us80d = us80d;
	}
	public BigDecimal getUs80ddb() {
		return us80ddb;
	}
	public void setUs80ddb(BigDecimal us80ddb) {
		this.us80ddb = us80ddb;
	}
	public BigDecimal getUs80e() {
		return us80e;
	}
	public void setUs80e(BigDecimal us80e) {
		this.us80e = us80e;
	}
	public BigDecimal getUs80g() {
		return us80g;
	}
	public void setUs80g(BigDecimal us80g) {
		this.us80g = us80g;
	}
	public BigDecimal getUs80u() {
		return us80u;
	}
	public void setUs80u(BigDecimal us80u) {
		this.us80u = us80u;
	}
	public BigDecimal getUs1922b() {
		return us1922b;
	}
	public void setUs1922b(BigDecimal us1922b) {
		this.us1922b = us1922b;
	}
	public BigDecimal gettTax() {
		return tTax;
	}
	public void settTax(BigDecimal tTax) {
		this.tTax = tTax;
	}
	public BigDecimal getSav88() {
		return sav88;
	}
	public void setSav88(BigDecimal sav88) {
		this.sav88 = sav88;
	}
	public BigDecimal gettReba() {
		return tReba;
	}
	public void settReba(BigDecimal tReba) {
		this.tReba = tReba;
	}
	public BigDecimal gettRebab() {
		return tRebab;
	}
	public void settRebab(BigDecimal tRebab) {
		this.tRebab = tRebab;
	}
	public BigDecimal gettPay() {
		return tPay;
	}
	public void settPay(BigDecimal tPay) {
		this.tPay = tPay;
	}
	public BigDecimal gettSc() {
		return tSc;
	}
	public void settSc(BigDecimal tSc) {
		this.tSc = tSc;
	}
	public BigDecimal gettEc() {
		return tEc;
	}
	public void settEc(BigDecimal tEc) {
		this.tEc = tEc;
	}
	public BigDecimal gettShec() {
		return tShec;
	}
	public void settShec(BigDecimal tShec) {
		this.tShec = tShec;
	}
	public BigDecimal gettPaid() {
		return tPaid;
	}
	public void settPaid(BigDecimal tPaid) {
		this.tPaid = tPaid;
	}
	public BigDecimal gettBala() {
		return tBala;
	}
	public void settBala(BigDecimal tBala) {
		this.tBala = tBala;
	}
	public LocalDate getUpdtOn() {
		return updtOn;
	}
	public void setUpdtOn(LocalDate updtOn) {
		this.updtOn = updtOn;
	}
	public LocalDate getReliDat() {
		return reliDat;
	}
	public void setReliDat(LocalDate reliDat) {
		this.reliDat = reliDat;
	}
	private Integer designo;
	private Integer gCode;

	private LocalDate birth;
	private String sex;
	private Integer vpfType;
	private String pfCode;
	private String qtr;
	private String eTan;

	@Column(precision = 14, scale = 4)
	private BigDecimal arrears;

	@Column(precision = 14, scale = 4)
	private BigDecimal apf;

	@Column(precision = 14, scale = 4)
	private BigDecimal appf;

	@Column(precision = 14, scale = 4)
	private BigDecimal ahra;

	@Column(precision = 14, scale = 4)
	private BigDecimal hralo;

	@Column(precision = 14, scale = 4)
	private BigDecimal obRate;

	@Column(precision = 14, scale = 4)
	private BigDecimal incre;

	@Column(precision = 14, scale = 4)
	private BigDecimal bRate;

	@Column(precision = 14, scale = 4)
	private BigDecimal els;

	@Column(precision = 14, scale = 4)
	private BigDecimal earn;

	@Column(precision = 14, scale = 4)
	private BigDecimal bonus;

	@Column(precision = 14, scale = 4)
	private BigDecimal onemth;

	@Column(precision = 14, scale = 4)
	private BigDecimal ot;

	@Column(precision = 14, scale = 4)
	private BigDecimal mgr;

	@Column(precision = 14, scale = 4)
	private BigDecimal uniform;

	@Column(precision = 14, scale = 4)
	private BigDecimal medical;

	@Column(precision = 14, scale = 4)
	private BigDecimal lta;

	private String ltano;

	@Column(precision = 14, scale = 4)
	private BigDecimal olic;

	@Column(precision = 14, scale = 4)
	private BigDecimal nsc;

	@Column(precision = 14, scale = 4)
	private BigDecimal nscInt;

	@Column(precision = 14, scale = 4)
	private BigDecimal mfs;

	@Column(precision = 14, scale = 4)
	private BigDecimal ulip;

	@Column(precision = 14, scale = 4)
	private BigDecimal hla;

	@Column(precision = 14, scale = 4)
	private BigDecimal hlaPrl;

	@Column(precision = 14, scale = 4)
	private BigDecimal infraBond;

	@Column(precision = 14, scale = 4)
	private BigDecimal child1Fee;

	@Column(precision = 14, scale = 4)
	private BigDecimal child2Fee;

	@Column(precision = 14, scale = 4)
	private BigDecimal gSalary;

	@Column(precision = 14, scale = 4)
	private BigDecimal ltaDedu;

	@Column(precision = 14, scale = 4)
	private BigDecimal trptDedu;

	@Column(precision = 14, scale = 4)
	private BigDecimal stdDedu;

	@Column(precision = 14, scale = 4)
	private BigDecimal ptxDedu;

	@Column(precision = 14, scale = 4)
	private BigDecimal dedu80;

	@Column(precision = 14, scale = 4)
	private BigDecimal nSalary;

	@Column(precision = 14, scale = 4)
	private BigDecimal us80ccc;

	@Column(precision = 14, scale = 4)
	private BigDecimal us80ccf;

	@Column(precision = 14, scale = 4)
	private BigDecimal us80d;

	@Column(precision = 14, scale = 4)
	private BigDecimal us80ddb;

	@Column(precision = 14, scale = 4)
	private BigDecimal us80e;

	@Column(precision = 14, scale = 4)
	private BigDecimal us80g;

	@Column(precision = 14, scale = 4)
	private BigDecimal us80u;

	@Column(precision = 14, scale = 4)
	private BigDecimal us1922b;

	@Column(precision = 14, scale = 4)
	private BigDecimal tTax;

	@Column(precision = 14, scale = 4)
	private BigDecimal sav88;

	@Column(precision = 14, scale = 4)
	private BigDecimal tReba;

	@Column(precision = 14, scale = 4)
	private BigDecimal tRebab;

	@Column(precision = 14, scale = 4)
	private BigDecimal tPay;

	@Column(precision = 14, scale = 4)
	private BigDecimal tSc;

	@Column(precision = 14, scale = 4)
	private BigDecimal tEc;

	@Column(precision = 14, scale = 4)
	private BigDecimal tShec;

	@Column(precision = 14, scale = 4)
	private BigDecimal tPaid;

	@Column(precision = 14, scale = 4)
	private BigDecimal tBala;

	private LocalDate updtOn;
	private LocalDate reliDat;

	
}
