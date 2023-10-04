import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);

        System.out.println("Enter a starting string: ");
        String startingString = string.nextLine();

        System.out.println("Current string: " + startingString);


        boolean optionChoice = true;
        while(optionChoice) {

            System.out.println("Pick an option: ");
            System.out.println("(1)Add content ");
            System.out.println("(2)Check if string contains substring ");
            System.out.println("(3)Output length ");
            System.out.println("(4)Output substring after prefix ");
            System.out.println("(5)Output substring after suffix ");
            System.out.println("(6)Output substring between prefix and suffix ");
            System.out.println("(7)Exit");

            int inputOptionChoice = string.nextInt();
            String currentString;

            if (inputOptionChoice == 1) {

                currentString = addContent(startingString);
                System.out.println("Current string: " + currentString);
                startingString = currentString;
            }
            else if (inputOptionChoice == 2) {

                System.out.println(checkSubstring (startingString));
            }
            else if (inputOptionChoice == 3) {

                System.out.println("The length of your string is: " + checkLength (startingString));

            }
            else if (inputOptionChoice == 4) {

                System.out.println("Substring: " + substringPrefix (startingString));

            }
            else if (inputOptionChoice == 5) {

                System.out.println("Substring: " + substringSuffix (startingString));

            }
            else if (inputOptionChoice == 6) {

                System.out.println("Substring: " + substringPrefixAndSuffix (startingString));
            }
            else if (inputOptionChoice == 7) {

                System.out.println("Have a nice day!");
                break;
            }
        }

    }

    public static String addContent (String startingString) {

        Scanner string = new Scanner(System.in);

        System.out.println("What would you like to add to your string?");
        String addString = string.nextLine();

        return startingString + addString;
    }
    public static String checkSubstring (String startingString){

        Scanner string = new Scanner(System.in);

        System.out.println("Enter a substring you would like to check within your string: ");
        String substring = string.nextLine();

        if (startingString.contains(substring)){
            return ("This is a substring within you string.");
        }
        else{
            return ("This is not a substring within your string.");
        }
    }
    public static int checkLength (String string){

        return string.length();
    }
    public static String substringPrefix (String startingString){

        Scanner string = new Scanner(System.in);

        System.out.println("Enter a prefix: ");
        String prefix = string.nextLine();

        int index = startingString.indexOf(prefix);

        return startingString.substring(index);

    }
    public static String substringSuffix (String startingString){

        Scanner string = new Scanner(System.in);

        System.out.println("Enter a suffix: ");
        String suffix = string.nextLine();

        int index = startingString.indexOf(suffix);

        return startingString.substring(0, index + suffix.length());
    }
    public static String substringPrefixAndSuffix (String startingString){

        Scanner string = new Scanner(System.in);

        System.out.println("Enter a prefix: ");
        String prefix = string.nextLine();

        System.out.println("Enter a suffix: ");
        String suffix = string.nextLine();

        int index1 = startingString.indexOf(prefix);
        int index2 = startingString.indexOf(suffix);

        return startingString.substring(index1, index2 + suffix.length());
    }
}