
// package dsa_course.array;
import java.util.*;

/*public class linear_search {
    public static int linerSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 14;
        int index = linerSearch(number, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index" + index);
        }
    }
}*/

/*public class linear_search {
    public static int linearsearch(int gautam[], int key) {
        for (int i = 0; i < gautam.length; i++) {
            if (gautam[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int gautam[] = { 4, 8, 12, 16, 20, 24, 28 };
        int key = 28;

        int index = linearsearch(gautam, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index " + index);
        }
    }
} */

public class linear_search {
    public static int linear_search2(int gk[], int key) {
        for (int i = 0; i < gk.length; i++) {
            if (gk[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int gk[] = { 10, 20, 30, 40, 50, 60, 70, 80, };
        int key = 50;

        int index = linear_search2(gk, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index" + index);
        }
    }
}
