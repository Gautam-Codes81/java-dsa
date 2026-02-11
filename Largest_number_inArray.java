import java.util.*;

/*public class Largest_number_inArray {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity aur jo int largest hum variable banaye hai
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 20, 15, 25, 50, 67, 55 };
        System.out.println("largest value is " + getlargest(numbers));

    }
}*/

/*public class Largest_number_inArray {
    public static int largestnumber(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 59, 57, 87, 67, 99, 55, 45 };
        System.out.println("largest value is " + largestnumber(number));
    }
}*/

public class Largest_number_inArray {
    public static int largestnumber(int siddarth[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < siddarth.length; i++) {
            if (largest < siddarth[i]) {
                largest = siddarth[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int siddarth[] = { 500, 759, 6778, 767, 78647, 673, 50000, 10000000 };
        System.out.println("largest value is " + largestnumber(siddarth));
    }
}