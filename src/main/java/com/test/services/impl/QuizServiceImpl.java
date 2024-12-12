package com.test.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.Question;
import com.test.bean.QuestionDTO;
import com.test.bean.Quiz;
import com.test.bean.User;
import com.test.repositories.QuestionRepository;
import com.test.repositories.QuizRepository;
import com.test.repositories.UserRepository;
import com.test.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private QuizRepository quizSessionRepository;

	@Override
	public Quiz startNewQuizSession(Long userId) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
		Quiz test = new Quiz();
		test.setUser(user);
		test.setTotalQuestions(0);
		test.setCorrectAnswers(0);
		test.setIncorrectAnswers(0);
		return quizSessionRepository.save(test);
//        return null;
	}

	@Override
	public QuestionDTO getRandomQuestion() {
		// TODO Auto-generated method stub
//		return questionRepository.findRandomQuestion()
//				.orElseThrow(() -> new RuntimeException("No questions available"));
		Question question = questionRepository.findRandomQuestion()
				.orElseThrow(() -> new RuntimeException("No questions available"));

		// Convert to DTO to exclude the correct answer
		return new QuestionDTO(question.getId(), question.getQuestionText(), question.getOptionA(),
				question.getOptionB(), question.getOptionC(), question.getOptionD());

	}

	@Override
	public Quiz submitAnswer(Long quizId, Long questionId, String answer) {
		// TODO Auto-generated method stub
		Quiz session = quizSessionRepository.findById(quizId)
				.orElseThrow(() -> new RuntimeException("Session not found"));

		Question question = questionRepository.findById(questionId)
				.orElseThrow(() -> new RuntimeException("Question not found"));

		System.out.println(question.getCorrectAnswer());
		session.setTotalQuestions(session.getTotalQuestions() + 1);

		if (question.getCorrectAnswer().equalsIgnoreCase(answer)) {
			session.setCorrectAnswers(session.getCorrectAnswers() + 1);
		} else {
			session.setIncorrectAnswers(session.getIncorrectAnswers() + 1);
		}

		return quizSessionRepository.save(session);
	}

	@Override
	public Quiz getQuizSessionStats(Long sessionId) {
		return quizSessionRepository.findById(sessionId).orElseThrow(() -> new RuntimeException("Session not found"));
	}

}
