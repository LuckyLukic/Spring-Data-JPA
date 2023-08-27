package CRUD_DEMO.CRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import CRUD_DEMO.CRUD.Employee;
import CRUD_DEMO.CRUD.DAO.EmployeeRepo;




@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeRepo employeeRepo;
	
	@Autowired
	public  EmployeeServiceImpl (EmployeeRepo theEmployeeRepo) {
		
		employeeRepo = theEmployeeRepo;
	}
	
	@Override
	public List<Employee> findAll() {
	
		return employeeRepo.findAll();
	}

	@Override
    public Employee save(Employee theEmployee) {
		
		return employeeRepo.save(theEmployee);
	}

	@Override
	public Employee findById (int theId) {
		
	    Optional<Employee> result = employeeRepo.findById(theId);
	    
	    Employee theEmployee = null;
	    
	    if(result.isPresent()) {
	    	theEmployee = result.get();
	    }
	    return theEmployee;
	}

	@Override
	public void deleteById(int theId) {
		employeeRepo.deleteById(theId);
		
	}

	
	
	

}
