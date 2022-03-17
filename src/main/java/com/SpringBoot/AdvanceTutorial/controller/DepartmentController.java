package com.SpringBoot.AdvanceTutorial.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBoot.AdvanceTutorial.entity.Department;
import com.SpringBoot.AdvanceTutorial.error.DepartmentNotFoundException;
import com.SpringBoot.AdvanceTutorial.service.DepartmentService;
import java.util.List;

import javax.validation.Valid;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	
	@RequestMapping(path = "/deparmtents", method = RequestMethod.GET)
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartmentList();	
	}

	@PostMapping("/departments")
	
    public Department saveDepartment(@Valid @RequestBody Department department) {
    LOGGER .info("Inside the saveDepartment of DepartmentController");
		return departmentService.saveDepartment(department);
    }
	
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId)  throws DepartmentNotFoundException{
	    LOGGER .info("Inside the fetchDepartmentById of DepartmentController");
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
	    LOGGER .info("Inside the deleteDepartmentById of DepartmentController");
		return "Department deleted Successfully";
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId,
									   @RequestBody Department department) {
	    LOGGER .info("Inside the updateDepartment of DepartmentController");
		return departmentService.updateDepartment(departmentId,department);
	}
	
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
	    LOGGER .info("Inside the fetchDepartmentByName of DepartmentController");
		return departmentService.fetchDepartmentByName(departmentName);
	}
}




