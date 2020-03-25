import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.regex.Pattern;


public class SolutionAssign2 {
    public static void main(String[] args) throws IOException {
        System.out.println(" “I affirm that I have not given or received any unauthorized help on this assignment, " +
                "and that this work is my own.” ");
        System.out.println(" My Name: Mustafa Al-kishtainy ");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name you want to output: ");
        String filename =input.nextLine();
        System.out.println("How many students you want to consider?");
        int count = input.nextInt();
        class Student{
            private String FirstName;
            private String LastName;
            private String PSID;
            int grade1;
            int grade2;
            int grade3;
            double gradepoint1;
            double gradepoint2;
            double gradepoint3;
            double GPA;
        }
        Student student[]=new Student[3];
        for (int i =0; i<count; i++)
        {
            System.out.println("Enter student details and grades:");
            student[i]=new Student();
        do{
            System.out.println("FirstName:");
            student[i].FirstName =input.next();
        }while(!Pattern.matches("[a-zA-Z]+", student[i].FirstName));
        do{
            System.out.println("LastName:");
                student[i].LastName =input.next();
            }while(!Pattern.matches("[a-zA-Z]+", student[i].LastName));
        do {
            System.out.println("Enter PSID: ");
            student[i].PSID=input.next();
        }while (!student[i].PSID.matches("^[0-9]+$")&&student[i].PSID.length()!=10);
        System.out.println("Enter grade 1: ");
        student[i].grade1 = input.nextInt();
        student[i].gradepoint1 = getGradePoint(student[i].grade1);
            System.out.println("Enter grade 2: ");
            student[i].grade1 = input.nextInt();
            student[i].gradepoint2 = getGradePoint(student[i].grade2);
            System.out.println("Enter grade 3: ");
            student[i].grade1 = input.nextInt();
            student[i].gradepoint3 = getGradePoint(student[i].grade3);
            student[i].GPA=(student[i].gradepoint1 *3+ student[i].gradepoint2*3 +student[i].gradepoint3)/9;
        }
        try{
            Writer w =new FileWriter(filename);
            for (int i =0; i <count; i++) {
           w.write((student[i].FirstName+ " "+student[i].LastName+" " + student[i].PSID+ " "+ "\n"));

            }
            w.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public static double getGradePoint(int x)
    {
        double gradePoint=0;
        if(x>=90 && x<=100)
        {
            gradePoint=4.00;
        }
        else if (x>=87 && x <=89)
        {
            gradePoint =3.33;
        }
        else if(x >=80 && x <=82)
        {
            gradePoint=2.67;
        }
        else if (x>=77&& x<=79 )
        {
            gradePoint=2.33;
        }
        else if (x>=73 && x <=76)
        {
            gradePoint=2.00;
        }
        else if (x>=70&& x<=72)
        {
            gradePoint=1.67;
        }
        else if (x>=67 && x <=69)
        {
            gradePoint=1.33;
        }
        else if (x>=60 && x <=62)
        {
            gradePoint=1.00;
        }
        else if (gradePoint < 60)
        {
            gradePoint=0.0;
        }
        return gradePoint;
    }
}
