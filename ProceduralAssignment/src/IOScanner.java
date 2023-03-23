import java.util.Scanner;

public class IOScanner {
    static Scanner input = new Scanner(System.in);

    public static String scanLine() {
        return input.nextLine();
    }

    public static int scanInt() {
        int returnValue = input.nextInt();
        scanLine();
        return returnValue;

    }

    public static byte scanByte() {
        byte returnValue = input.nextByte();
        scanLine();
        return returnValue;
    }



}
