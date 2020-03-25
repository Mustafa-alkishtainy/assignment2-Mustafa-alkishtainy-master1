import java.util.Scanner;

public class SolutionAssign2 {
    public static void main(String[] args) {
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
        }

    }
}