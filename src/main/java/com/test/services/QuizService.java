package com.test.services;

import org.springframework.stereotype.Service;

import com.test.bean.Question;
import com.test.bean.QuestionDTO;
import com.test.bean.Quiz;

@Service
public interface QuizService {
	
	Quiz startNewQuizSession(Long userId);
	QuestionDTO getRandomQuestion();
	Quiz submitAnswer(Long quizId, Long questionId, String answer);
	Quiz getQuizSessionStats(Long sessionId);

}
