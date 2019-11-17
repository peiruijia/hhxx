package org.hhxx.ssm.entity;

public class Salary {

	private Integer id;
	private String empName;
	private Integer salaryYear;
	private Integer salaryMonth;
	private Double baseSalary;
	private Double insurance;
	private Double accumulationFund;
	private Double tax;
	private Double achievements;
	private Double reallySalary;
	private Integer empId;

	public Salary() {
		super();
	}

	public Salary(Integer id, String empName, Integer salaryYear, Integer salaryMonth, Double baseSalary,
			Double insurance, Double accumulationFund, Double tax, Double achievements, Double reallySalary,
			Integer empId) {
		super();
		this.id = id;
		this.empName = empName;
		this.salaryYear = salaryYear;
		this.salaryMonth = salaryMonth;
		this.baseSalary = baseSalary;
		this.insurance = insurance;
		this.accumulationFund = accumulationFund;
		this.tax = tax;
		this.achievements = achievements;
		this.reallySalary = reallySalary;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", empName=" + empName + ", salaryYear=" + salaryYear + ", salaryMonth="
				+ salaryMonth + ", baseSalary=" + baseSalary + ", insurance=" + insurance + ", accumulationFund="
				+ accumulationFund + ", tax=" + tax + ", achievements=" + achievements + ", reallySalary="
				+ reallySalary + ", empId=" + empId + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getSalaryYear() {
		return salaryYear;
	}

	public void setSalaryYear(Integer salaryYear) {
		this.salaryYear = salaryYear;
	}

	public Integer getSalaryMonth() {
		return salaryMonth;
	}

	public void setSalaryMonth(Integer salaryMonth) {
		this.salaryMonth = salaryMonth;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Double getInsurance() {
		return insurance;
	}

	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}

	public Double getAccumulationFund() {
		return accumulationFund;
	}

	public void setAccumulationFund(Double accumulationFund) {
		this.accumulationFund = accumulationFund;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getAchievements() {
		return achievements;
	}

	public void setAchievements(Double achievements) {
		this.achievements = achievements;
	}

	public Double getReallySalary() {
		return reallySalary;
	}

	public void setReallySalary(Double reallySalary) {
		this.reallySalary = reallySalary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}
