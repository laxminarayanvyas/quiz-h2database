package com.test.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.test.bean.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
