package inclassexerciseweek2;

/**
 *
 * Conor Griffin: x00111602
 */
public class QuestionClass 
{
        
        private String text;
        private String answer;
        
        public QuestionClass()
        {
            
            text = "";
            answer = "";
            
        }
        public QuestionClass(String questionText)
        {
            
            text = questionText;
            answer = "";
        }
        public void setAnswer(String correctAnswer)
        {
            
            answer = correctAnswer;
        }
        public boolean checkAnswer(String response)
        {
            //Long Version:
            boolean correct = false;
            if (response.equals(answer))
            {
                correct = true;
            }
            
            return correct;
            
            //Shorthand Version:
            //return response.equals(answer);
        }
        public void display()
        {
            System.out.println(answer);
        }
     
}
