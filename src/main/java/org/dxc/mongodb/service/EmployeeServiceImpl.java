package org.dxc.mongodb.service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(List<Employee> employee) {
		employeeRepository.saveAll(employee);

	}

	@Override
	public Collection<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findEmployeeById(double employeeId) {
		return employeeRepository.findById(employeeId);
	}

	@Override
	public void deleteEmployeeById(double employeeId) {
		employeeRepository.deleteById(employeeId);

	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
}
