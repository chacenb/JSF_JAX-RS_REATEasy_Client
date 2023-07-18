/* USEFUL LINKS :
JAKARTA PERSISTENCE 3.1 DOC : https://jakarta.ee/specifications/persistence/3.1/
* Jakarta Persistence API CRUD EXAMPLE 1: https://www.mastertheboss.com/java-ee/jakarta-ee/jakarta-persistence-3-1-new-features/
* Jakarta Persistence API CRUD EXAMPLE 2: https://pramodshehan.medium.com/java-jakarta-persistence-api-jpa-6e94d0291c50
* https://blog.jetbrains.com/idea/2021/02/creating-a-simple-jakarta-persistence-application/
* */
package com.demojpaapp;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class DemoJpaJaxrsApi extends Application {

  /*  CHACE ADDED CODE : complete Exanple how to use entity manager   */
  /*
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		System.out.println("Starting Transaction");
		entityManager.getTransaction().begin();

		System.out.println("Saving Employee to Database");
		Employee employee = new Employee("Pankaj");
		entityManager.persist(employee);

		System.out.println("fetch the transaction & commit it i.e. commit all the changes to database.");
		entityManager.getTransaction().commit();

		System.out.println("Generated Employee ID = " + employee.getEmployeeId());

		// get an object using primary key.
		Employee emp = entityManager.find(Employee.class, employee.getEmployeeId());
		System.out.println("got object " + emp.getName() + " " + emp.getEmployeeId());

		// get all the objects from Employee table
		@SuppressWarnings("unchecked")
		List<Employee> listEmployee = entityManager.createQuery("SELECT e FROM Employee e").getResultList();

		// remove and entity
		entityManager.getTransaction().begin();
		System.out.println("Deleting Employee with ID = " + emp.getEmployeeId());
		entityManager.remove(emp);
		entityManager.getTransaction().commit();

		// close the entity manager
		entityManager.close();
		entityManagerFactory.close();
  */
}