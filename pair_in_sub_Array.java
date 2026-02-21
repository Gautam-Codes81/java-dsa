// package dsa_course.array;

/*public class pair_in_sub_Array {
    public static void printSubArrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();

            }

            System.out.println();
        }
        System.out.println("total subarray" + ts);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }
}*/
public class pair_in_sub_Array {
    public static void printSubArrays2(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("total subArray " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 4, 8, 12, 16, 20, 24, 28 };
        printSubArrays2(numbers);
    }
}
