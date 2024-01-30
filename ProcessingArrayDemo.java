import java.util.Scanner;

public class ProcessingArrayDemo {
    /** The Main Method */
    public static void main(String[] args) {
//        int arrSize = ProcessingArrays.getArraySize();
//
//        int[] myNumberList = new int[arrSize];
//
//        ProcessingArrays.getArrayValues(myNumberList);
//
//        System.out.println("\nBefore Shuffling the Array:");
//        ProcessingArrays.printArray(myNumberList, 10);
//
//        System.out.println("\n");
//
//        System.out.println("After Shifting the Array:");
//        ProcessingArrays.shiftArray(myNumberList);
//        ProcessingArrays.printArray(myNumberList, 10);

        Scanner input = new Scanner(System.in);

        String[] months = {
                "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"
        };

        System.out.print("Enter a month number (1 to 12): ");
        int monthNumber = input.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Sorry, wrong input given.");
            System.exit(1);
        } else {
            System.out.println("The month is " + months[monthNumber - 1]);
        }
    }
}
