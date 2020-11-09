package ch.java.interview;

import ch.java.interview.domain.Question;
import ch.java.interview.domain.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * SpringBoot application to be used as a sample app in job interview
 */
@SpringBootApplication
public class InterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}

    @Bean
    public CommandLineRunner interview(@Autowired QuestionService questionService) {
        return (args) -> {
            questionService.addQuestion(new Question("Can you spot the problem with layering?"));
            System.out.println(questionService.getQuestionsAsPlainText());
        };
    }
}
