package net.guides.springboot2.springboot2jpacrudexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import net.guides.springboot2.crud.Application;
import net.guides.springboot2.crud.model.Employee;

import java.sql.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerIntegrationTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}

	@Test
	public void contextLoads() {

	}

	@Test
	public void testGetAllEmployees() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/birthDay",
				HttpMethod.GET, entity, String.class);
		
		assertNotNull(response.getBody());
	}

//	@Test
//	public void testGetEmployeeById() {
//		Employee employee = restTemplate.getForObject(getRootUrl() + "/birthDay/1", Employee.class);
//		System.out.println(employee.getFirstName());
//		assertNotNull(employee);
//	}

	@Test
	public void testCreateEmployee() {
		Employee employee = new Employee();
		employee.setEmailId("admin@gmail.com");
		employee.setFirstName("admin");
		employee.setLastName("admin");
		employee.setAge(30);
		employee.setDate(Date.valueOf("1990-01-01"));
		ResponseEntity<Employee> postResponse = restTemplate.postForEntity(getRootUrl() + "/birthDay", employee, Employee.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());
	}

	@Test
	public void testUpdateEmployee() {
		int id = 1;
		Employee employee = restTemplate.getForObject(getRootUrl() + "/employees/" + id, Employee.class);
		employee.setFirstName("admin1");
		employee.setLastName("admin2");

		restTemplate.put(getRootUrl() + "/employees/" + id, employee);

		Employee updatedEmployee = restTemplate.getForObject(getRootUrl() + "/employees/" + id, Employee.class);
		assertNotNull(updatedEmployee);
	}

}