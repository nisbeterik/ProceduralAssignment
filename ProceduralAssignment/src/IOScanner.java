import java.util.Scanner;

public class IOScanner {
    static Scanner input = new Scanner(System.in);

    public static String scanLine(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }

    public static int scanInt(String prompt) {
        System.out.print(prompt);
        int returnValue = input.nextInt();
        input.nextLine();
        return returnValue;
    }

    public static byte scanByte() {
        byte returnValue = input.nextByte();
        input.nextLine();
        return returnValue;
    }
}