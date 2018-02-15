package inclassexerciseweek2;
import java.util.Scanner;
/**
 *
 * @author x00111602
 */
public class TestQuestion {
    
    public static void main(String[] args)
    {
        QuestionClass[] quiz = new QuestionClass[2];
        
        
        quiz[0] = new QuestionClass ("Who was the inventor of the Java Language");
        quiz[0].setAnswer("James Gosling");
        
        ChoiceQuestion c1 = new ChoiceQuestion("In which country was the inventor of Java born?");
        c1.addChoice("Australia", false);
        c1.addChoice("Canada", true);
        c1.addChoice("Denmark", false);
        c1.addChoice("United States", false);
        quiz[1] = c1;
        
        Scanner in = new Scanner(System.in);
        
        for(int i =0; i < quiz.length; i++)
        {
            quiz[i].display();
            System.out.println("Your Answer:");
            String answer = in.nextLine();
            System.out.println(quiz[i].checkAnswer(answer));
        }
        
    }
    
}
