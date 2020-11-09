package ch.java.interview.domain;

import ch.java.interview.infrastructure.InMemoryQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service to add and retrieve questions
 */
@Service
public class QuestionService {

    private final InMemoryQuestionRepository repository;

    public QuestionService(@Autowired InMemoryQuestionRepository repository) {
        this.repository = repository;
    }

    public void addQuestion(Question question) {
        repository.save(question);
    }

    public Object getQuestionsAsPlainText() {
        return repository.getAllQuestions().stream().map(Question::getQuestion);
    }
}
