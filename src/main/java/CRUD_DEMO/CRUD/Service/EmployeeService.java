package CRUD_DEMO.CRUD.Service;

import java.util.List;


import CRUD_DEMO.CRUD.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	
	Employee save (Employee theEmployee);

	Employee findById (int theId);
	
	void deleteById (int theId);

}
