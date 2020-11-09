package ch.java.interview.infrastructure;

import ch.java.interview.domain.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Simplistic in-memory Repository for Questions.
 */
@Repository
public class InMemoryQuestionRepository {

    private final ArrayList<Question> questions = new ArrayList<>();

    public void save(Question question) {
        questions.add(question);
    }

    public List<Question> getAllQuestions() {
        return questions;
    }
}
