package com.cts.iiht.iihttraining.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {



	@Id
	@Column(name="subject_id",unique=true, nullable=false)
	private long subjectId;
	
	@Column(name="subject_title")
	private String subtitle;
	
	@Column(name="subject_hours")
	private int durationInHours;
	
//	@OneToMany
//	@Column(name="subject_references_id")
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
 //   @JsonIgnore
	@OneToMany(
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	 
	@JoinColumn(name = "book_Id")
    private Set<Book> references = new HashSet<Book>(0);

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public int getDurationInHours() {
		return durationInHours;
	}

	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}

	
	
	public Set<Book> getReferences() {
		return references;
	}

	public void setReferences(Set<Book> references) {
		this.references = references;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(long subjectId, String subtitle, int durationInHours, Set<Book> references) {
		super();
		this.subjectId = subjectId;
		this.subtitle = subtitle;
		this.durationInHours = durationInHours;
		this.references = references;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subtitle=" + subtitle + ", durationInHours=" + durationInHours
				+ ", references=" + references + "]";
	}




}


	


	

