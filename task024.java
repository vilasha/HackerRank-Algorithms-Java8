/*	Electronics Shop

	Monica wants to buy a keyboard and a USB drive from her favorite electronics store. The store has several models of each. Monica wants to spend as much as possible for the  items, given her budget.

	Given the price lists for the store's keyboards and USB drives, and Monica's budget, find and print the amount of money Monica will spend. If she doesn't have enough money to both a keyboard and a USB drive, print -1 instead. She will buy only the two required items.

	For example, suppose she has  to spend. Three types of keyboards cost . Two USB drives cost . She could purchase a , or a . She chooses the latter. She can't buy more than  items so she can't spend exactly .

	Input Format

	The first line contains three space-separated integers , , and , her budget, the number of keyboard models and the number of USB drive models. 
	The second line contains  space-separated integers , the prices of each keyboard model. 
	The third line contains  space-separated integers , the prices of the USB drives.

	Constraints

	The price of each item is in the inclusive range .
	Output Format

	Print a single integer denoting the amount of money Monica will spend. If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead.	*/
	
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class task024 {
    
    private static int getMoneySpent (
                        int b, 
                        ArrayList<Integer> keyboards, 
                        ArrayList<Integer> usbDrives) {
        int result = -1;
        for (int i : keyboards)
            for (int j : usbDrives)
                if (i + j <= b && result < i + j)
                    result = i + j;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        scanner.nextLine();
        Set keyboardsUnordered = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .filter(i -> i < b)
            .collect(Collectors.toSet());
        Set usbDrivesUnordered = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .filter(i -> i < b)
            .collect(Collectors.toSet());
        scanner.close();
        ArrayList<Integer> keyboards = new ArrayList<>(keyboardsUnordered);
        Collections.sort(keyboards, Collections.reverseOrder());
        ArrayList<Integer> usbDrives = new ArrayList<>(usbDrivesUnordered);
        Collections.sort(usbDrives, Collections.reverseOrder());
        System.out.println(getMoneySpent(b, keyboards, usbDrives));
    }
}