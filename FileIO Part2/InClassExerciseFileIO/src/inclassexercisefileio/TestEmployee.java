package inclassexercisefileio;

import java.util.ArrayList;
import java.io.*;

public class TestEmployee {
    public static void main(String[] args) throws IOException {
    ArrayList<Employee> persons = new ArrayList<>();
    
    String lName;
    String fName;
    String s;
    int age;
    
    File myDir = new File("Files");
    File myFile = new File(myDir,"Employees.txt");
    
    try (BufferedReader in = new BufferedReader(new FileReader(myFile)))
    {
        while((s = in.readLine()) != null)
        {
            lName = s;
            fName = in.readLine();
            age = Integer.parseInt(in.readLine());
            
            
            persons.add(new Employee(lName,fName,age));
        }
    }

//    persons.add(new Employee("Collins","Tony",18));
//    persons.add(new Employee("Greally","Jim ",16));
//    persons.add(new Employee("Brady","Noel",69));     

    for (int i=0;i<persons.size();i++)
    {
        System.out.println(persons.get(i));
    }
    }
    
}
