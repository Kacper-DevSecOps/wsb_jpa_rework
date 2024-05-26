package com.capgemini.wsb.persistence.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

	
	@ManyToOne
	@JoinColumn(name = "doctor_id", nullable = false)
	private DoctorEntity doctor;  // Relacja jednostronna od strony Visit (dziecko)

	@ManyToOne
	@JoinColumn(name = "patient_id", nullable = false)
	private PatientEntity patient;  // Relacja jednostronna od strony Visit (dziecko)


	@OneToMany(mappedBy = "visit", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<MedicalTreatmentEntity> treatments;  // Relacja dwustronna

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public void setDoctor(DoctorEntity mapToEntity) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setDoctor'");
	}

    public void setPatient(PatientEntity mapToEntity) {
			// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setPatient'");
    }

    public PatientEntity getPatient() {
		return patient;
    }

    public DoctorEntity getDoctor() {
		return doctor;
    }

}
