package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.entities.Enrollment;
import com.devsuperior.dslearnbds.entities.EnrollmentPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPk> {
}
