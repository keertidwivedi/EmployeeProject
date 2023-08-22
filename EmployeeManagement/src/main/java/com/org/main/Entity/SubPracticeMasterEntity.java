package com.org.main.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubPracticeMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int practiceID;

	@Column(name="subpracticename")
	private String subPracticeName;

	@Column(name="subpracticeid")
	private String subPracticeID;

	@Column(name="hrbpid")
	private String hrbpID;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="idid")
	private String idId;

}
