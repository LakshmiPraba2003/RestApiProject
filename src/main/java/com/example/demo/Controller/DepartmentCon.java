package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Department;
import com.example.demo.Service.DepartmentService;
@RestController
@CrossOrigin("*")
public class DepartmentCon {
	@Autowired
    DepartmentService s;
    @PostMapping("/saveDept")
    public Department savecontrol(@RequestBody Department dep) {
    	return s.saveDetails(dep);
    }
    @GetMapping("/getmapDept")
    public List<Department> getcontrol(){
    	return s.getDetails();
    }
    @GetMapping("getbyidDept/{id}")
	public java.util.Optional<Department> getbyid(@PathVariable int id) {
		return s.getbyid(id);
	}
    @PutMapping("/updateDept")
    public Department updatecontrol(@RequestBody Department dep) {
    	return s.updateDetails(dep);
    }
    @DeleteMapping("/deleteDeptby/{id}")
    public String removeid(@PathVariable ("id") int id) {
    	s.deleteDetails(id);
    	return "Batch Id"+id+" is deleted";
    }
    //update
    @PutMapping("updateDeptbyid/{id}")
    public String updatebyid(@RequestBody Department aa, @PathVariable int id) {
		java.util.Optional<Department> temp = s.getbyid(id);
		if(temp.isPresent()) {
			s.updateDetails(aa);
			return "Object updated successfully!";
		}
		return "Enter a valid id!";
	}
}
