import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myInteger = getArray(5);
        int[] sorted = sortArray(myInteger);
        printArray(sorted);
    }
    public static int[] getArray(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter the " + capacity + " Integer values: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " content " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int[] sort = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sort[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sort.length - 1; i++) {
                if (sort[i] < sort[i + 1]) {
                    temp = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sort;
    }
}
