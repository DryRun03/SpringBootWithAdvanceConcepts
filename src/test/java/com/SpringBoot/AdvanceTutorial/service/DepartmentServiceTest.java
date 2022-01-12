package com.SpringBoot.AdvanceTutorial.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.SpringBoot.AdvanceTutorial.entity.Department;
import com.SpringBoot.AdvanceTutorial.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	@BeforeEach
	void setUp() throws Exception {
	}

	@MockBean
	private DepartmentRepository departmentRepository;
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@BeforeAll
	void setup() {
		Department department = Department.builder()
				.departmentName("IT")
				.departmentAddress("Banglore")
				.departmentCode("IT-01")
				.departmentId(1L)
				.build();
			Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
			.thenReturn(department);
	}
	
	@Test
	public void whenValidDepartmentName_thenDepartmentShouldFound() {
		String departmentName = "IT";
		Department found = 
				departmentService.fetchDepartmentByName(departmentName);
		assertEquals(departmentName, found);
	}

}
