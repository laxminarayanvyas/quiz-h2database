package com.test.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.bean.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {


	@Query(value = "SELECT * FROM question ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Optional<Question> findRandomQuestion();
}
