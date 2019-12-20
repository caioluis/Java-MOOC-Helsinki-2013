
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Caio
 */
public class GradeDistribution {

    private Scanner s = new Scanner(System.in);
    private int[] grades;

    public GradeDistribution() {
        this.grades = new int[6];
    }

    public void score() {
        System.out.println("Type exam scores, -1 completes");

        while (true) {
            int score = Integer.parseInt(s.nextLine());
            if (score == -1) {
                break;
            } else if (score >= 0 && score <= 60) {
                int grade = gradePoints(score);
                grades[grade]++;
            } else {

            }
        }
    }

    public int gradePoints(int score) {
        if (score < 30) {
            return 0;
        } else if (score < 35) {
            return 1;
        } else if (score < 40) {
            return 2;
        } else if (score < 45) {
            return 3;
        } else if (score < 50) {
            return 4;
        } else {
            return 5;
        }
    }

    public void printGrades() {
        System.out.println("Grade distribution: ");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printAcceptance() {
        double acceptPercent = 0, totalGrades = 0;
        for (int number : grades) {
            totalGrades += number;
        }

        acceptPercent = 100 * (totalGrades - grades[0]) / (double) totalGrades;

        System.out.println("Acceptance percentage: " + acceptPercent);
    }

}
