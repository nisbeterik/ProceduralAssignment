public class GradeOperations {

    public static int findHighestScore(int[] scores) {
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }

    public static int findLowestScore(int[] scores) {
        int lowest = scores[0];
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        return lowest;
    }

    public static int findSecondHighestScore(int[] scores) {
        int highest = findHighestScore(scores);
        int secondHighest = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > secondHighest && score < highest) {
                secondHighest = score;
            }
        }
        return secondHighest;
    }

    public static int findSecondLowestScore(int[] scores) {
        int lowest = findLowestScore(scores);
        int secondLowest = Integer.MAX_VALUE;
        for (int score : scores) {
            if (score < secondLowest && score > lowest) {
                secondLowest = score;
            }
        }
        return secondLowest;
    }

    public static void printHighestScoreAndItsPosition(int[] scores) {
        int highest = findHighestScore(scores);
        int position = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == highest) {
                position = i + 1;
                break;
            }
        }
        System.out.printf("The highest score is %d and belongs to the %d%s student\n\n", highest, position, Menu.getOrdinalSuffix(position));
    }

    public static boolean isInvalidGrade(int scoreInput) {
        if (scoreInput < 0 || scoreInput > 100) {
            System.out.println("Error - Input out of bound. Score can only be between 0  and 100.");
            return true;
        }
        return false;
    }

    public static void printMean(int[] scores) {
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double mean = sum / scores.length;
        System.out.printf("The mean of the entered scores is: %.2f\n\n", mean);
    }

    public static void printTwoHighestAndTwoLowestScores(int[] scores) {
        int highest = findHighestScore(scores);
        int secondHighest = findSecondHighestScore(scores);
        int lowest = findLowestScore(scores);
        int secondLowest = findSecondLowestScore(scores);

        System.out.printf("Two highest scores: %d, %d\n", highest, secondHighest);
        System.out.printf("Two lowest scores: %d, %d\n\n", lowest, secondLowest);
    }
}