/*	The Time in Words

	Given the time in numerals we may convert it into words, as shown below:

	At , use o' clock. For , use past, and for  use to. Note the space between the apostrophe and clock in o' clock. Write a program which prints the time in words for the input given in the format described.

	Input Format

	The first line contains , the hours portion The second line contains , the minutes portion

	Constraints

	Output Format

	Print the time in words as described.	*/
	
import java.util.Scanner;

public class Solution {
    
    static String convertToString(int num){
        switch(num){
            case 1:  return "one";
            case 2:  return "two";
            case 3:  return "three";
            case 4:  return "four";
            case 5:  return "five";
            case 6:  return "six";            
            case 7:  return "seven";
            case 8:  return "eight";            
            case 9:  return "nine";
            case 10:  return "ten";            
            case 11:  return "eleven";
            case 12:  return "twelve";            
            case 13:  return "thirteen";
            case 14:  return "fourteen";
            case 15:  return "quarter";
            case 16:  return "sixteen";            
            case 17:  return "seventeen";
            case 18:  return "eighteen";            
            case 19:  return "nineteen";            
            case 20:  return "twenty";
            case 30: return "half";
            default: return convertToString(20) + " " + convertToString(num-20);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        if (m == 0)
            System.out.print(convertToString(h) + " o' clock");
        if (m != 0 && m <=30 ) { 
            System.out.print(convertToString(m));
            if (m != 15 && m != 30) {
                System.out.print(" minute");
                if (m != 1)
                    System.out.print("s");
            }
            System.out.print(" past " + convertToString(h));
        }
        if (m > 30 && m < 60) {
            System.out.print(convertToString(60-m));
            if (m != 45 && m != 30) {
                System.out.print(" minute");
                if (m != 59)
                    System.out.print("s");
            }
            System.out.print(" to " + convertToString((h % 12) + 1));
        }    
        
        
    }
}