package grades;

/**
 *
 * @author conorgriffin
 */
public class Grades
{
	public static void main(String[] args) {
		String grade = new String();                           //1
		int exam, ca;                                          //2

		exam = Integer.parseInt(args[0]);                      //3       
		ca = Integer.parseInt(args[1]);                        //4

		if (exam < 0 || exam > 100 || ca < 0 || ca > 100) {    //5
			grade = "Invalid input";                       //6
		} else if (exam < 40 || ca < 40) {                     //7
			grade = "Component Fail";                      //8
		} else {
			int combined = (60 * exam + 40 * ca) / 100;    //9
			if (combined < 60) {                           //10
				grade = "Fail";                        //11
			} else if (combined >= 60 && combined <= 80) { //12
				grade = "Pass";                        //13
			} else if (combined > 80 && combined <= 100) { //14
				grade = "Pass with distinction";       //15
			}
		}
		System.out.println(grade);                             //16
	}
        
        // CCN = E - N + 2
        // CCN = 20 - 16 + 2 = 6
        
        // # of branches <= CCN <= # test cases to obtain statement coverage
}


