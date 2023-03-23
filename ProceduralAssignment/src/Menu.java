
import java.util.Locale;

public class Menu {
    static int[] studentScores = new int[7];
    static byte option;

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        readGrade(studentScores);
        mainMenuFlow();
    }

    public static void mainMenuFlow() {
        do {
            menuPrint();
            option = IOScanner.scanByte();
            switch (option) {
                case 1:
                    //method call for registering new scores, then return to menu
                    readGrade(studentScores);
                    break;
                case 2:
                    //method call for calculating mean, then return to menu
                    printMean(studentScores);
                    break;

                case 3:
                    //method call for finding two highest and two lowest scores, then return to menu
                    twoHighestTwoLowestScores(studentScores);
                    break;

                case 4:
                    //method call for finding highest score and its position, then return to menu
                    GradeOperations.highestScoreAndItsPosition(studentScores);
                    break;

                case 5:
                    //method call for collecting hashtags from a post, then return to menu
                    collectHashtags();
                    break;
                case 6:
                    // Exits application
                    System.out.println("Thank you for using our grading system. Have a nice day!");
                    break;
                default:
                    System.out.println("Error - Invalid value. Please type between 1 and 6");
                    break;


            }


        } while (option != 6);
    }
    public static void menuPrint() {
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
    public static void readGrade(int[] scores) {
        int counter = 0;
        while (counter < scores.length) {

            switch (counter) {
                case 0:
                    System.out.printf("Enter the score for the %dst student ", counter + 1);
                    scores[counter] = IOScanner.scanInt();
                    if (GradeOperations.wrongGradeInput(scores[counter])) {
                        continue;
                    }
                    break;

                case 1:
                    System.out.printf("Enter the score for the %dnd student ", counter + 1);
                    scores[counter] = IOScanner.scanInt();
                    if (GradeOperations.wrongGradeInput(scores[counter])) {
                        continue;
                    }
                    break;

                case 2:
                    System.out.printf("Enter the score for the %drd student ", counter + 1);
                    scores[counter] = IOScanner.scanInt();
                    if (GradeOperations.wrongGradeInput(scores[counter])) {
                        continue;
                    }
                    break;

                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.printf("Enter the score for the %dth student ", counter + 1);
                    scores[counter] = IOScanner.scanInt();
                    if (GradeOperations.wrongGradeInput(scores[counter])) {
                        continue;
                    }
                    break;
            }
            counter++;  //increments counter after valid input checked in switch


        }
        System.out.println("Thank you for your input. Your entered scores are:");
        System.out.print(scores[0]); //prints the first value

        for (int x = 1; x < scores.length; x++) { //for loop that prints the rest of the values with commas, x starts at 1 because scores[0] is already printed
            System.out.print(", " + scores[x]);
        }
        System.out.println("\n");                      //empty line to make program look right


    }

    public static void printMean(int[] scores) {
        double total = 0.0;                                         //variable storing the total
        for (int i = 0; i < scores.length; i++) {                   //for loop adding all the values together
            total += scores[i];                                     //storing the added values in variable total
        }
        total = (total / 7.0d);                                        //calculates mean
        System.out.printf("The mean of the numbers is %.2f", total); //prints mean with 2 decimal digits
        System.out.println("\n");


    }

    public static void twoHighestTwoLowestScores(int[] scores) {

        System.out.println("The two lowest scores provided are " + GradeOperations.isLowestScore(scores) +
                ", and " + GradeOperations.isSecondLowestScore(scores));
        System.out.println("The two highest scores provided are " + GradeOperations.isHighestScore(scores) +
                ", and " + GradeOperations.isSecondHighestScore(scores) + "\n");

    }




    public static void collectHashtags() {
        System.out.println("Enter your message:");
        String typedMessage = IOScanner.scanLine();
        CHOps.parseAndPrintHashtagsFromArray(CHOps.convertStringInputToArray(typedMessage));
    }


}


