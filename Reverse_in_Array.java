/*public class Reverse_in_Array {
    public static void reverse(int number[]) {
        int first = 0, last = number.length - 1;
        while (first < last) {
            // swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };

        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}*/

// questin number 2

/*public class Reverse_in_Array {
    public static void reverse(int number[]) {
        int first = 0, last = number.length - 1;
        while (first < last) {
            // swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        int number[] = { 4, 8, 12, 16, 20 };

        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "  ");

        }
        System.out.println();

    }
}  */

/*public class Reverse_in_Array {
    public static void reverse(int number[]) {
        int first = 0, last = number.length - 1;
        while (first < last) {
            // Swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = { 10, 12, 14, 16, 18, 20, 22 };
        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "  ");
        }
        System.out.println();
    }
}  */

public class Reverse_in_Array {
    public static void reverse(int marks[]) {
        int first = 0, last = marks.length - 1;
        while (first < last) {
            // Swap
            int temp = marks[last];
            marks[last] = marks[first];
            marks[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 27, 26, 28, 56, 39, 79, 25, 45 };
        reverse(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + "  ");
        }
        System.out.println();
    }
}
