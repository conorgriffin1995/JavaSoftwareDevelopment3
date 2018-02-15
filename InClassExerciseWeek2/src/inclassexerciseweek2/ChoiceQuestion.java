/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inclassexerciseweek2;

import java.util.ArrayList;

/**
 *
 * @author x00111602
 */
public class ChoiceQuestion extends QuestionClass
{
    
    private ArrayList<String> choices;
    
    public ChoiceQuestion(String questionText)
    {
        super(questionText);
        choices = new ArrayList<String>();
        
    }
    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice);
        
        if(correct)
        {
            String correctAnswer = Integer.toString(choices.size());
            setAnswer(correctAnswer);
            
          //Different way of writing line 32 of code.  
          //String correctAnswer = ""+choices.size();
            
            
        }
    }
    public void display()
    {
        super.display();
        for(int i = 0; i < choices.size(); i++)
        {
            int temp = i+1;
            System.out.println(temp+ "): "+choices.get(i));
        }
    }
}
