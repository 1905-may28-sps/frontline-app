package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="F_REPORTTYPE")
public class ReportType {
	@Id
	private int reportTypeId;
	@Column(nullable=false)
	private int reportType;
	public ReportType() {}
	public ReportType(int reportTypeId, int reportType) {
		super();
		this.reportTypeId = reportTypeId;
		this.reportType = reportType;
	}
	public int getReportTypeId() {
		return reportTypeId;
	}
	public void setReportTypeId(int reportTypeId) {
		this.reportTypeId = reportTypeId;
	}
	public int getReportType() {
		return reportType;
	}
	public void setReportType(int reportType) {
		this.reportType = reportType;
	}
	
	

}