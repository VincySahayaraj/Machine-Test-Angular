package com.project.app.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.app.model.Visit;
import com.project.app.repository.IVisitRepository;

@Service
public class VisitServiceImplemenatation implements IVisitService {

	// IoC
	@Autowired
	private IVisitRepository visitRepository;

	@Override
	public List<Visit> getAllVisit() {
		return (List<Visit>) visitRepository.findAll();
	}

	@Override
	public Optional<Visit> getVisitById(Integer id) {
		return visitRepository.findById(id);
	}

	@Override
	public void addVisit(Visit visit) {
		visitRepository.save(visit);

	}

	@Override
	public void updateVisit(Visit visit) {
		visitRepository.save(visit);

	}

	@Override
	public void deleteById(Integer id) {
		visitRepository.deleteById(id);

	}

}
