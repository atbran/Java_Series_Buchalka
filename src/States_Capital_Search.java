import java.util.Scanner;

public class States_Capital_Search {


    public static void main(String[] args) {

        System.out.println("Option 1: Display the text");
        System.out.println("Option 2: Search");
        System.out.println("Option 3: Exit");
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        if(user_input == 1){
            System.out.println("Enter the text to display");
        }
        capitalSearch();
    }

    public static void capitalSearch() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What state or capital are you looking for?");
        String state_input = scanner.nextLine();


        char state_input_char = state_input.charAt(0);


        char[] state_input_char_array = { state_input_char };
        AWQ.search(state_input_char_array, state_input_char_array);

        String[][] stateCapitals = {{"Alabama","Montgomery"},{"Alaska","Juneau"},{"Arizona","Phoenix"},{"Arkansas","Little Rock"},
                {"California","Sacramento"},{"Colorado","Denver"},{"Connecticut","Hartford"},{"Delaware","Dover"},
                {"Florida","Tallahassee"},{"Georgia","Atlanta"},{"Hawaii","Honolulu"},{"Idaho","Boise"},
                {"Illinois","Springfield"},{"Indiana","Indianapolis"},{"Iowa","Des Moines"},{"Kansas","Topeka"},
                {"Kentucky","Frankfort"},{"Louisiana","Baton Rouge"},{"Maine","Augusta"},{"Maryland","Annapolis"},
                {"Massachusetts","Boston"},{"Michigan","Lansing"},{"Minnesota","St. Paul"},{"Mississippi","Jackson"},
                {"Missouri","Jefferson City"},{"Montana","Helena"},{"Nebraska","Lincoln"},{"Nevada","Carson City"},
                {"New Hampshire","Concord"},{"New Jersey","Trenton"},{"New Mexico","Santa Fe"},{"New York","Albany"},
                {"North Carolina","Raleigh"},{"North Dakota","Bismarck"},{"Ohio","Columbus"},{"Oklahoma","Oklahoma City"},
                {"Oregon","Salem"},{"Pennsylvania","Harrisburg"},{"Rhode Island","Providence"},{"South Carolina","Columbia"},
                {"South Dakota","Pierre"},{"Tennessee","Nashville"},{"Texas","Austin"},{"Utah","Salt Lake City"},
                {"Vermont","Montpelier"},{"Virginia","Richmond"},{"Washington","Olympia"},{"West Virginia","Charleston"},
                {"Wisconsin","Madison"},{"Wyoming","Cheyenne"}};

    }




    static class AWQ {

        static int NO_OF_CHARS = 256;

        // A utility function to get maximum of two integers
        static int max(int a, int b) { return (a > b) ? a : b; }

        // The preprocessing function for Boyer Moore's
        // bad character heuristic
        static void badCharHeuristic(char[] str, int size,
                                     int badchar[])
        {

            // Initialize all occurrences as -1
            for (int i = 0; i < NO_OF_CHARS; i++)
                badchar[i] = -1;

            // Fill the actual value of last occurrence
            // of a character (indices of table are ascii and
            // values are index of occurrence)
            for (int i = 0; i < size; i++)
                badchar[(int)str[i]] = i;
        }

        /* A pattern searching function that uses Bad
        Character Heuristic of Boyer Moore Algorithm */
        static void search(char txt[], char pat[])
        {
            int m = pat.length;
            int n = txt.length;

            int badchar[] = new int[NO_OF_CHARS];

        /* Fill the bad character array by calling
           the preprocessing function badCharHeuristic()
           for given pattern */
            badCharHeuristic(pat, m, badchar);

            int s = 0; // s is shift of the pattern with
            // respect to text
            // there are n-m+1 potential alignments
            while (s <= (n - m)) {
                int j = m - 1;

            /* Keep reducing index j of pattern while
               characters of pattern and text are
               matching at this shift s */
                while (j >= 0 && pat[j] == txt[s + j])
                    j--;

            /* If the pattern is present at current
               shift, then index j will become -1 after
               the above loop */
                if (j < 0) {
                    System.out.println(
                            "Patterns occur at shift = " + s);

                /* Shift the pattern so that the next
                   character in text aligns with the last
                   occurrence of it in pattern.
                   The condition s+m < n is necessary for
                   the case when pattern occurs at the end
                   of text */
                    // txt[s+m] is character after the pattern
                    // in text
                    s += (s + m < n) ? m - badchar[txt[s + m]]
                            : 1;
                }

                else
                /* Shift the pattern so that the bad
                   character in text aligns with the last
                   occurrence of it in pattern. The max
                   function is used to make sure that we get
                   a positive shift. We may get a negative
                   shift if the last occurrence  of bad
                   character in pattern is on the right side
                   of the current character. */
                    s += max(1, j - badchar[txt[s + j]]);
            }
        }



    }
}
