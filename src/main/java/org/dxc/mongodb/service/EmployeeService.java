package org.dxc.mongodb.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;

public interface EmployeeService {
	public void saveEmployee(List<Employee> employee);
	public Collection<Employee> getAllEmployee();
	public Optional<Employee> findEmployeeById(double employeeid);
	void deleteEmployeeById(double employeeid);
	void updateEmployee(Employee employee);
}
