package CRUD_DEMO.CRUD.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import CRUD_DEMO.CRUD.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
