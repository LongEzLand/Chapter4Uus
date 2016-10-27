import java.util.Scanner;

/**
 * Created by Lazarus on 27.10.2016.
 */
public class PrintTime {

    public static void printTime(int hour, int minute){
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }
    public static void main(String[]args){
        int hour = 11;
        int minute = 59;
        //printTime(hour,minute);
        printTime(hour + 1, 0);

        String input = "1 kala 2 kala punane kala sinine kala";
        Scanner s = new Scanner(input);

    }
}
