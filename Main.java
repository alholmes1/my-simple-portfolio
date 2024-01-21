// Arthur Holmes
// JAVA Programming (2024SP.CSC.151.0003)
// 1/21/24

import java.util.*;

public class Main {

    public static void main(String[] args){


        // Establish the grade weights according to the course CSC 151 spring syllabus

        double lab_weight = 0.20;
        double reading_weight = 0.10;
        double revel_weight = 0.15;
        double midterm_weight = 0.20;
        double project_weight = 0.15;
        double final_exam_weight = 0.20;


        // Create a new Scanner object

        Scanner input = new Scanner(System.in);

        // Prompt user for grades/data

        /*
        The program should
        Use the correct grading weights for each grading element from Course Resources or the syllabus
        Ask for and use user input for the percentage score for each grading element
        Correctly calculate the grading average
        Correctly display the average in percent
        */

        System.out.println("Enter Labs average in percent: ");
        double labs_percent = input.nextDouble();

        System.out.println("Enter Reading average in percent: ");
        double reading_quizzes_percent = input.nextDouble();

        System.out.println("Enter Revel average in percent: ");
        double revel_percent = input.nextDouble();

        System.out.println("Enter Midterm average in percent: ");
        double midterm_percent = input.nextDouble();

        System.out.println("Enter Project average in percent: ");
        double project_percent = input.nextDouble();

        System.out.println("Enter Final Exam average in percent: ");
        double final_exam_percent = input.nextDouble();

        double calc_average = (labs_percent * (lab_weight)) + (reading_quizzes_percent * (reading_weight)) + (revel_percent * (revel_weight)) + (midterm_percent * (midterm_weight)) + (project_percent * (project_weight)) + (final_exam_percent * (final_exam_weight));
        System.out.println("Your average is " + calc_average + "%");


    }


}