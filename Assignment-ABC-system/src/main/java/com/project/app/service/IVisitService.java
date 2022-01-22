package com.project.app.service;

import java.util.List;
import java.util.Optional;
import com.project.app.model.Visit;

public interface IVisitService {

	// Get All Visits
	public List<Visit> getAllVisit();

	// Get visit By Id
	public Optional<Visit> getVisitById(Integer id);

	// Insert
	public void addVisit(Visit visit);

	// Update
	public void updateVisit(Visit visit);

	// Delete User
	public void deleteById(Integer id);

}
