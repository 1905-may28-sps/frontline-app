package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Report {
	@Id
	@SequenceGenerator(name="REPORT_SEQ_GEN", sequenceName="REPORT_SEQ", allocationSize=1)
	@GeneratedValue(generator="REPORT_SEQ_GEN", strategy=GenerationType.SEQUENCE)
	private int reportId;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reportTypeId", referencedColumnName = "reportTypeId")
	private ReportType reportType;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="postId", nullable=false)
	private Post post;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="reporterId", nullable=false)
	private FUser reporter;
	
	public Report() {}

	public Report(int reportId, ReportType reportType, Post post, FUser reporter) {
		super();
		this.reportId = reportId;
		this.reportType = reportType;
		this.post = post;
		this.reporter = reporter;
	}

	public int getReportId() {
		return reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public ReportType getReportType() {
		return reportType;
	}

	public void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public FUser getReporter() {
		return reporter;
	}

	public void setReporter(FUser reporter) {
		this.reporter = reporter;
	}
	
	
	

}
