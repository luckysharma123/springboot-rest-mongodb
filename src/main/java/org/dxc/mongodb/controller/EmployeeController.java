package org.dxc.mongodb.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mongo")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;

	@RequestMapping("/getall")
	public Collection<Employee> getAllEmployees() {
		Collection<Employee> employees = employeeservice.getAllEmployee();
		System.out.println("-----------" + employees);
		return employees;

	}

	@RequestMapping("/getbyid")
	public Optional<Employee> findEmployeeById(@RequestParam("employeeId") double employeeId) {
		Optional<Employee> result = employeeservice.findEmployeeById(employeeId);
		return result;

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveEmployee(@RequestBody List<Employee> employee) {
		employeeservice.saveEmployee(employee);

	}

	@DeleteMapping("/delete")
	public void deleteEmployeeById(@RequestParam("employeeId") double employeeId) {
		employeeservice.deleteEmployeeById(employeeId);
	}
	
	@PutMapping("/update/{id}")
	public void updateEmployeeById(@PathVariable double id, @RequestBody Employee employee) {
		
		employee.setEmployeeId(id);
		employeeservice.updateEmployee(employee);
		
	}
}
