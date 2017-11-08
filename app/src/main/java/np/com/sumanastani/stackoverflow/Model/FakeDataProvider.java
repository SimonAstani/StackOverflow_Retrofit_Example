package np.com.sumanastani.stackoverflow.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 11/7/2017.
 */

public class FakeDataProvider {
    public static List<Question> getQuestions(){
        List<Question> questions = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            Question question = new Question();
            question.questionId = String.valueOf(i);
            question.title = String.valueOf(i);
            question.body = String.valueOf(i) + "Body";
            questions.add(question);
        }
        return questions;
    }
    public static List<Answer> getAnswers(){
        List<Answer> answers = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            Answer answer = new Answer();
            answer.answerId = i;
            answer.accepted = false;
            answer.score = i;
            answers.add(answer);
        }
        return answers;
    }

}
