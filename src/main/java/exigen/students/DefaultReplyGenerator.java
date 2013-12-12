package exigen.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Generates reply based on random selection from the initial list of replies
 *
 * @author Anna Khasanova
 */
public class DefaultReplyGenerator implements ReplyGenerator {
    
    private List<String> answers = new ArrayList<String>();
    
    public DefaultReplyGenerator() {
        answers.add("Ans1");
        answers.add("Ans2");
        answers.add("Ans3");
        answers.add("Ans4");
        answers.add("Ans5");
        answers.add("Ans6");
    }
    
    @Override
    public String generate() {
        Random random = new Random();
        int selected = random.nextInt(answers.size());
        return answers.get(selected);
    }
}
