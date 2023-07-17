package com.springProject_ms.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springProject_ms.Model.DoctorList;
import com.springProject_ms.Repo.DoctorList_repo;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {
	@Autowired
	private DoctorList_repo doc;
//	@PostMapping("savedoc")
//	public DoctorList saveAlldoc(@RequestBody DoctorList regdoct) {
//		doc.setId(regdoct.getId());
//		doc.setName(regdoct.getName());
//		doc.setDepart(regdoct.getDepart());
//		doc.setImgUr(regdoct.getImgUr());
//		return docrep.save(regdoct);
//	}
	@GetMapping("doctList")
	public List<DoctorList> getAllDoctor(){
		return doc.findAll();
		
	}
	
	

}
