public class HashtagOperations {
    public static String[] convertStringInputToArray(String message) {
        return message.split("\\s+");
    }

    public static void collectAndPrintHashtags() {
        String typedMessage = IOScanner.scanLine("Enter your message:");
        String[] messageArray = convertStringInputToArray(typedMessage);
        String[] hashtags = findHashtags(messageArray);
        printHashtags(hashtags);
    }

    private static String[] findHashtags(String[] messageArray) {
        String[] tempHashtags = new String[messageArray.length];
        int hashtagCount = 0;
        for (String word : messageArray) {
            if (word.startsWith("#")) {
                tempHashtags[hashtagCount++] = word;
            }
        }
        String[] hashtags = new String[hashtagCount];
        System.arraycopy(tempHashtags, 0, hashtags, 0, hashtagCount);
        return hashtags;
    }

    private static void printHashtags(String[] hashtags) {
        if (hashtags.length == 0) {
            System.out.println("No hashtags were typed");
        } else {
            System.out.print("Hashtags found: ");
            for (int i = 0; i < hashtags.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(hashtags[i]);
            }
            System.out.println();
        }
        System.out.println();
    }
}