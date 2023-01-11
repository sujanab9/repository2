package com.code.crud;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.code.crud.model.Employee;
import com.code.crud.repository.EmployeeRepository;

@SpringBootApplication
public class CrudOperationsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationsApplication.class, args);}
		
		@Autowired 
		private EmployeeRepository employeeRepository;
		
		
	

	@Override
	public void run(String... args) throws Exception {
		
          Employee employee = new Employee();
           
          employee.setFirstName("Sujana");
          employee.setLastName("Bandari");
          employee.setEmailId("sujanabandari19@gmail.com");
          employeeRepository.save(employee);
          
          Employee employee1 = new Employee();
          
          employee1.setFirstName("Santhosh");
          employee1.setLastName("Boini");
          employee1.setEmailId("santhu538@gmail.com");
          employeeRepository.save(employee1);
          
          Employee employee2 = new Employee();
          employee2.setFirstName("Aarish");
          employee2.setLastName("Boini");
          employee2.setEmailId("Aarish9@gmail.com");
          employeeRepository.save(employee2);

          System.out.println("save employees");
           System.out.println(".......save employees");
          //new tab added today
		
	}
 
}
