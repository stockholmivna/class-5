import java.util.Scanner;
public class sumArrayExample {
    //sums-all-elements-in-an-int-array
    public static int sumArray(int[] arr) {
        int sum = 0;               //accumulator
        if (arr == null) return 0; //null-guard
        for (int v : arr) sum += v; //enhanced-for-loop
        return sum;                //return-total
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner-for-input
        String line;                         //raw-line
        while (true) {                       //repeat-until-valid
            System.out.println("enter integers separated by spaces or commas:");
            line = sc.nextLine().trim();     //read-line
            if (line.isEmpty()) {            //empty-check
                System.out.println("sum of elements: 0"); //empty-output
                return;
            }
            String[] tokens = line.split("[,\\s]+"); //split-by-commas-or-spaces
            int[] arr = new int[tokens.length];      //prepare-array
            try {                                     //parse-ints
                for (int i = 0; i < tokens.length; i++) {
                    arr[i] = Integer.parseInt(tokens[i]);
                }
                int sum = sumArray(arr);              //method-call
                System.out.println("sum of elements: " + sum); //output
                return;                               //done
            } catch (NumberFormatException e) {       //invalid-input
                System.out.println("invalid input, try again (examples: 1 2 3 4 5  or  1,2,3,4,5)");
            }
        }
    }
}
