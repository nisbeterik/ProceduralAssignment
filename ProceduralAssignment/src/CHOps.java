import java.util.StringTokenizer;

public class CHOps {
    public static String[] convertStringInputToArray(String message) {

        int counter = 0;
        StringTokenizer messageToken = new StringTokenizer(message);
        String[] messageArray = new String[messageToken.countTokens()];
        while (messageToken.hasMoreTokens()) {
            messageArray[counter] = messageToken.nextToken();
            counter++;
        } return messageArray;
    }
    public static void parseAndPrintHashtagsFromArray (String[] messageArray) {
        boolean firstHashtagFound = false;
        for (int i = 0; i < messageArray.length; i++) {
            if (messageArray[i].startsWith("#")) {
                if (!firstHashtagFound) {
                    System.out.print("Hashtags found: ");
                    System.out.print(messageArray[i]);
                    firstHashtagFound = true;
                } else {
                    System.out.print(" " + messageArray[i]);
                }
            }
        }
        if (!firstHashtagFound) {
            System.out.print("No hashtags were typed");
        }
        System.out.println("\n");
    }

}
