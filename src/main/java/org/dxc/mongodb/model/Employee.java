package org.dxc.mongodb.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="employee1")
public class Employee {
	@Id
	@Field(name="employeeid")
	private double employeeId;
	@Field(name="firstname")
	private String firstName;
	@Field(name="lastname")
	private String lastName;
	@Field(name="jobtitle")
	private String jobTitle;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(double employeeId, String firstName, String lastName, String jobTitle, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	public double getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(double employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}
		
	}