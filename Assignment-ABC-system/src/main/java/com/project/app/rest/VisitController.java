package com.project.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.app.model.Visit;
import com.project.app.service.IVisitService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class VisitController {

	// Get Instance --IoC
	@Autowired
	private IVisitService visitService;

	// Http Methods

	// Get All visit
	@GetMapping("/visits")
	public List<Visit> getAllVisit() {
		return visitService.getAllVisit();
	}

	// get Visit By Id
	@GetMapping("/visits/{id}")
	public Optional<Visit> getVisitById(@PathVariable Integer id) {
		return visitService.getVisitById(id);
	}

	// Post --Insert Visit
	@PostMapping("/visits")
	public void addVisit(@RequestBody Visit visit) {
		visitService.addVisit(visit);

	}

	// Put --Update Visit
	@PutMapping("/visits")
	public void updateVisit(@RequestBody Visit visit) {
		visitService.updateVisit(visit);
	}

	// Delete --Delete Visit
	@DeleteMapping("/visits/{id}")
	public void deleteUser(@PathVariable Integer id) {
		visitService.deleteById(id);

	}

}
