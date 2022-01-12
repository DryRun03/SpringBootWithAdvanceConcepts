package com.SpringBoot.AdvanceTutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.AdvanceTutorial.entity.Department;

@Repository 
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	public Department findByDepartmentName(String departmentname);
	
	public Department findByDepartmentNameIgnoreCase(String departmentname);

}
