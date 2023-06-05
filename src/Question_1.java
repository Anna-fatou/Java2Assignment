import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args){
        boolean run = true;
        while (run){
            System.out.println("Please Enter Student Name");
            Scanner input1 = new Scanner(System.in);
            String name = input1.next();
            System.out.println("Please Enter hourly wage.");
            Scanner input2 = new Scanner(System.in);
            double hourly_wage = input2.nextDouble();
            System.out.println("Please Enter total hours worked.");
            Scanner input3 = new Scanner(System.in);
            double hours_worked= input3.nextDouble();

            Student student = new Student(name, hourly_wage, hours_worked);
            student.printPaycheck();

            System.out.println("Do you want to calculate another students paycheck");
            System.out.println("Enter y for yes and any other key for no");
            Scanner input4 = new Scanner(System.in);
            String option = input4.next();
            if(!option.equals("y")){
                System.out.println("Thank you for choosing our service.");
                System.out.println("Ending Program....");
                run = false;
            }
        }
    }
}