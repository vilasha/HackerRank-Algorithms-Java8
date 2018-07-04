/*	Grading Students

	HackerLand University has the following grading policy:

	Every student receives a  in the inclusive range from  to .
	Any  less than  is a failing grade.
	Sam is a professor at the university and likes to round each student's  according to these rules:

	If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
	If the value of  is less than , no rounding occurs as the result will still be a failing grade.
	For example,  will be rounded to  but  will not be rounded because the rounding would result in a number that is less than .

	Given the initial value of  for each of Sam's  students, write code to automate the rounding process. Complete the function solve that takes an integer array of all grades, and return an integer array consisting of the rounded grades. For each , round it according to the rules above and print the result on a new line.

	Input Format

	The first line contains a single integer denoting  (the number of students). 
	Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.

	Constraints

	Output Format

	For each  of the  grades, print the rounded grade on a new line.	*/
	
import java.io.*;
import java.util.*;

public class Solution {

    static int[] gradingStudents(int[] grades) {
        for (int i = 0; i < grades.length; i++)
            if (grades[i] >= 38 && grades[i] % 5 >= 3)
                grades[i] = ((grades[i] / 5) + 1) * 5;
        return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
