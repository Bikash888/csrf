package com.csrfwork.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csrfwork.project.model.Questions;

public interface QuestionRepository extends JpaRepository<Questions, Long>{

}
