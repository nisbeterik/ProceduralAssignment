import java.util.Locale;

public class Menu {
    private static final int[] studentScores = new int[7];
    private static byte option;

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        readGrades();
        mainMenuFlow();
    }

    private static void mainMenuFlow() {
        do {
            printMenu();
            option = IOScanner.scanByte();
            executeOption(option);
        } while (option != 6);
    }

    private static void printMenu() {
        System.out.print("Welcome to the menu. Choose one of the options below:\n" +
                "1. Register new scores for students.\n" +
                "2. Calculate the mean of the entered scores.\n" +
                "3. Find the two highest and two lowest scores.\n" +
                "4. Find the highest score and its position.\n" +
                "5. Collect hashtags from a post.\n" +
                "6. To exit.\n" +
                "\n" +
                "Type your option: ");
    }

    private static void readGrades() {
        for (int i = 0; i < studentScores.length; i++) {
            int score = IOScanner.scanInt(String.format("Enter the score for the %d%s student: ", i + 1, getOrdinalSuffix(i + 1)));
            if (GradeOperations.isInvalidGrade(score)) {
                i--;
            } else {
                studentScores[i] = score;
            }
        }
        printEnteredScores(studentScores);
    }

    public static String getOrdinalSuffix(int value) {
        int mod100 = value % 100;
        int mod10 = value % 10;
        if (mod100 >= 11 && mod100 <= 13) {
            return "th";
        }
        switch (mod10) {
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }

    private static void printEnteredScores(int[] scores) {
        System.out.println("Thank you for your input. Your entered scores are:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    private static void executeOption(int option) {
        switch (option) {
            case 1:
                readGrades();
                break;
            case 2:
                GradeOperations.printMean(studentScores);
                break;
            case 3:
                GradeOperations.printTwoHighestAndTwoLowestScores(studentScores);
                break;
            case 4:
                GradeOperations.printHighestScoreAndItsPosition(studentScores);
                break;
            case 5:
                HashtagOperations.collectAndPrintHashtags();
                break;
            case 6:
                System.out.println("Thank you for using our grading system. Have a nice day!");
                break;
            default:
                System.out.println("Error - Invalid value. Please type between 1 and 6");
                break;
        }
    }
}