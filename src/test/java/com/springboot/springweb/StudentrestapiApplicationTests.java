package com.springboot.springweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.springboot.springweb.entity.Student;

@SpringBootTest
class StudentrestapiApplicationTests {

	@Value("${studentrestapi.services.url}")
	private String baseURL;
	@Test
	public void testGetProduct() {
		System.out.println(baseURL);
		RestTemplate restTemp = new RestTemplate();
		Student student = restTemp.getForObject(baseURL+"7", Student.class);
		assertNotNull(student);
		assertEquals("devi",student.getName());
	}
	
	@Test
	public void testCreateProduct() {
		RestTemplate restTemp = new RestTemplate();
		Student student = new Student();
		student.setName("dhanalakshmi");
		student.setTestscore(96.90);
		Student newstudent = restTemp.postForObject(baseURL, student, Student.class);
		assertNotNull(newstudent);
		assertNotNull(newstudent.getId());
		assertEquals("dhanalakshmi",newstudent.getName());
	}
	
	@Test
	public void testUpdateProduct() {
		RestTemplate restTemp = new RestTemplate();
		Student student = restTemp.getForObject(baseURL+"7", Student.class);
		student.setTestscore(96.9);
		restTemp.put(baseURL, student);
	}
	

}
