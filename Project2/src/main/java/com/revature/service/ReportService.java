package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Report;
import com.revature.repository.ReportRepository;

@Service
public class ReportService {

	@Autowired
	ReportRepository reportRepo;
	
	public Report add(Report r) {
		return reportRepo.save(r);
	}
	
	public List<Report> getAll(){
		return reportRepo.findAll();
	}
}
