import java.util.Scanner;

public class StatesCapitalSearch {
    // this contains the list of states
    static String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
            "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho",
            "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana",
            "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
            "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada",
            "New Hampshire", "New Jersey", "New Mexico", "New York",
            "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
            "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
            "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
            "West Virginia", "Wisconsin", "Wyoming"};

    public static void main(String[] args) {
        // this initializes the scanner, which we will use to get user input
        Scanner sc = new Scanner(System.in);
        //initialize choice to zero
        int choice = 0;

        //this directs the user input into the desired option.
        while (choice != 3) {
            System.out.println("Menu:");
            System.out.println("1) Display the text");
            System.out.println("2) Search");
            System.out.println("3) Exit Program");
            System.out.print("Pick: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                if (choice == 1) {
                    showStates();
                } else if (choice == 2) {
                    findPattern(sc);
                } else if (choice == 3) {
                    System.out.println("Goodbye.");
                } else {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                sc.next(); // consume the invalid input
            }
        }
    }

    public static void showStates() {
        System.out.println("States:");
        for(int i = 0; i < states.length; i++){
            System.out.println(states[i]);
        }
    }

    public static void findPattern(Scanner sc) {
        System.out.print("Pattern: ");
        String pattern = sc.nextLine().toLowerCase(); // Convert input pattern to lowercase
        char[] pat = pattern.toCharArray();
        boolean f = false;

        System.out.println("Finding: " + pattern);
        for (int i = 0; i < states.length; i++) {
            String stateLower = states[i].toLowerCase(); // Convert state name to lowercase
            char[] txt = stateLower.toCharArray();
            int index = SearchEngine.search(txt, pat);
            if (index != -1) {
                f = true;
                System.out.println("Found in " + states[i] + " at index " + index);
            }
        }

        if (!f) {
            System.out.println("No match.");
        }
    }

    //Uses Boyer-Moore algorithm
    static class SearchEngine {
        // initialize int char_count to 256
        static int CHAR_COUNT = 256;

        //This creates the bad char table, which is used to optimize the search algorithm.
        //This is used to skip over text that can not possibly match the input
        static void buildBadCharTable(char[] str, int size, int[] badchar) {
            //fills the table with -1 to start
            for (int i = 0; i < CHAR_COUNT; i++)
                badchar[i] = -1;

            for (int i = 0; i < size; i++)
                badchar[(int)str[i]] = i;
        }

        //takes two arguments, char set of text and char set of the pattern to search
        static int search(char txt[], char pat[]) {
            // initialize m to be the pattern's length
            int m = pat.length;
            // initialize n to be the text's length
            int n = txt.length;

            int badchar[] = new int[CHAR_COUNT];
            buildBadCharTable(pat, m, badchar);
            // the actual search process begins here
            int s = 0;
            //loop continues as long as the pattern can fit in the remaining text
            while (s <= (n - m)) {
                //start comparing from the last character of the pattern
                int j = m - 1;

                //this compares the chars from the last char of the pattern
                while (j >= 0 && pat[j] == txt[s + j])
                    j--;
                //If entire pattern is found return index
                if (j < 0) {
                    return s;
                    // if a mismatch ( j > 0 )has been found, then it figures out how far to shift the pattern to the right
                } else {
                    s += Math.max(1, j - badchar[txt[s + j]]);
                }
            }
            //if nothing is found, return false (-1)
            return -1;
        }
    }
}
