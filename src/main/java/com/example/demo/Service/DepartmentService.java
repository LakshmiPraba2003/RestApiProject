package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Department;
import com.example.demo.Repo.DepartmentRepo;


@Service
public class DepartmentService {
	@Autowired
    DepartmentRepo rep;
    public Department saveDetails(Department dep) {
 	   return rep.save(dep);
    }
    public List<Department> getDetails(){
 	   return rep.findAll();
    }
    public Department updateDetails(Department dep) {
 	   return rep.saveAndFlush(dep);
    }
    public void deleteDetails(int id) {
 	   System.out.print("Id is deleted");
 	   rep.deleteById(id);
    }
    public Optional<Department> getbyid(int id) {
		return rep.findById(id);
	}

}
