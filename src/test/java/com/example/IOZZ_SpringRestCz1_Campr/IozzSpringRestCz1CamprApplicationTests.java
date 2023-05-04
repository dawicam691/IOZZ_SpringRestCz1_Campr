package com.example.IOZZ_SpringRestCz1_Campr;

import com.example.IOZZ_SpringRestCz1_Campr.DataModels.MainModels.Student;
import com.example.IOZZ_SpringRestCz1_Campr.Servises.StudentService;
import io.vavr.collection.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

//import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class IozzSpringRestCz1CamprApplicationTests {

	@Test
	public void getEmptyList() {
		final StudentService service = new StudentService();
		List<Student> students = service.getAllStudenst();
		assertTrue(students.isEmpty());
	}

}
