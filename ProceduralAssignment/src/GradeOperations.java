public class GradeOperations {
    public static int isHighestScore(int [] scores) {
        int highest = scores[0];
        for (int h = 0; h < scores.length; h++) {
            if (scores[h] > highest) {
                highest = scores[h];
            }
        }
        return highest;
    }



    public static int isSecondLowestScore(int [] scores) {
        int temp;
        for (int a = 0; a < scores.length; a++) {                      //loop to find second lowest value
            for (int b = (a + 1); b < scores.length; b++) {     //compares two values and sorts them based on condition
                if (scores[a] < scores[b]) {                            // source: https://www.javatpoint.com/java-program-to-find-second-smallest-number-in-an-array
                    temp = scores[a];
                    scores[a] = scores[b];
                    scores[b] = temp;
                }
            }
        }
        return scores[scores.length-2];
    }

    public static int isSecondHighestScore(int [] scores) {
        int temp;
        for (int i = 0; i < scores.length; i++) {
            for (int j = (i + 1); j < scores.length; j++) {
                if (scores[i] > scores[j]) {                            //inversed greater than operator from lowest
                    temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        } return scores[scores.length-2];
    }

    public static int isLowestScore(int [] scores) {
        int lowest= scores[0];
        for (int y = 0; y < scores.length; y++) {      //loop to find lowest value
            if (scores[y] < lowest) {                   //if current value in array is lower than value stored in lowest
                lowest = scores[y];                     //then replace value in lowest with current value checked in array
            }

        } return lowest;
    }
    public static void highestScoreAndItsPosition(int[] scores) {
        int highest = isHighestScore(scores);
        int position = 0;
        for (int i = 0; i < scores.length; i++) { //loop finding the index for the largest number
            if (scores[i] == highest) {              //if current value in array is equal to largest
                position = (i + 1);             //then assign array position +1 because array starts at 0
                break;
            }
        }
        switch (position) {         //switch to print proper ordinal indicators
            case 1:
                System.out.printf("The highest score is " + highest + " and belongs to the %dst student", position);
                break;
            case 2:
                System.out.printf("The highest score is " + highest + " and belongs to the %dnd student", position);
                break;

            case 3:
                System.out.printf("The highest score is " + highest + " and belongs to the %drd student", position);
                break;

            case 4:
            case 5:
            case 6:
            case 7:
                System.out.printf("The highest score is " + highest + " and belongs to the %dth student", position);
                break;


        }
        System.out.println("\n");

    }
    public static boolean wrongGradeInput(int scoreInput) {
        if(scoreInput<0 || scoreInput>100) {
            System.out.println("Error - Input out of bound. Score can only be between 0  and 100.");
            return true;
        } return false;
    }
}
