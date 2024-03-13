package com.hackerearth.fullstack.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hackerearth.fullstack.backend.model.School;

public interface SchoolRepository extends JpaRepository<School, Long> {

}
