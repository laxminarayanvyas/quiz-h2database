package com.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.bean.Question;
import com.test.bean.QuestionDTO;
import com.test.bean.Quiz;
import com.test.services.QuizService;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

	@Autowired
    private QuizService quizService;

    // 1. Start a new quiz session
    @PostMapping("/start/{userId}")
    public Quiz startQuiz(@PathVariable Long userId) {
        return quizService.startNewQuizSession(userId);
    }

    // 2. Get a random multiple-choice question
    @GetMapping("/question")
    public QuestionDTO getRandomQuestion() {
        return quizService.getRandomQuestion();
    }

    // 3. Submit an answer
    @PostMapping("/submit/{sessionId}/{questionId}")
    public Quiz submitAnswer(@PathVariable Long sessionId, 
                                    @PathVariable Long questionId, 
                                    @RequestParam String answer) {
        return quizService.submitAnswer(sessionId, questionId, answer);
    }

    // 4. Get quiz session statistics
    @GetMapping("/stats/{sessionId}")
    public Quiz getResult(@PathVariable Long sessionId) {
        return quizService.getQuizSessionStats(sessionId);
    }
}
