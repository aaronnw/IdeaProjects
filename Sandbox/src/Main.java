import java.util.Scanner;

/**
 * Created by Aaron on 7/31/2014.
 */
public class Main{
    public static void main(String[] args) {
        String binary;
        int digits;
        Scanner input = new Scanner(System.in);
        String[] places;


        System.out.println("Enter a binary number");

        binary = input.nextLine();
        digits = String.valueOf(binary).length();
        System.out.println(digits);

    }

}
