/*	Time Conversion

	Given a time in -hour AM/PM format, convert it to military (24-hour) time.

	Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

	Input Format

	A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

	Output Format

	Convert and print the given time in -hour format, where .	*/
	
import java.io.*;
import java.util.*;

public class Solution {

    static String timeConversion(String s) throws ParseException {
        SimpleDateFormat amPmFormat = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat militaryFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = amPmFormat.parse(s);
        return militaryFormat.format(date).toString();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ParseException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = scan.nextLine();
        String result = timeConversion(s);
        bw.write(result);
        bw.newLine();
        bw.close();
    }
}
