public class ProcessingArrays {
    public static int getArraySize() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        return size;
    }

    public static void getArrayValues(int[] arr) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + arr.length + " values: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static void randomArrayValues(int[] arr, int start, int end) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + (int)(Math.random() * end);
        }
    }

    public static void printArray(int[] myList, int numOfLines) {
        int count = 1;
        for (int i = 0; i < myList.length; i++) {
            if (i < myList.length - 1) {
                if (count % numOfLines == 0) {
                    System.out.print(myList[i] + ",\n");
                } else {
                    System.out.print(myList[i] + ", ");
                }
            } else {
                System.out.print(myList[i]);
            }
            count++;
        }
    }

    public static int sumOfArray(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static double maxOfArray(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static double minOfArray(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int[] randomShuffle(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Generate an index j randomly
            int j = (int)(Math.random() * arr.length);

            // Swap arr[i] with arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static int[] shiftArray(int[] arr) {
        int temp = arr[arr.length - 1];

        for (int i = arr.length, j = 1; i > j; i--) {
            arr[j] = arr[i - 1];
        }
        arr[0] = temp;

        return arr;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < arr[mid])
                high = mid - 1;
            else if (key == arr[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1; // Now high < low, key not found
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i...list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
