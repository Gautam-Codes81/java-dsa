
import java.util.*;

import javax.sound.sampled.SourceDataLine;

/*public class update_number_array {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 45, 46, 47, 48, 49 };
        update(marks);

        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}*/

// public package dsa_course.array;

class update_number_array {
    public static void update(int gautam[]) {
        for (int i = 0; i < gautam.length; i++) {
            gautam[i] = gautam[i] + 5;
        }
    }

    public static void main(String[] args) {
        int gautam[] = { 56, 57, 58, 59, 60 };
        update(gautam);
        for (int i = 0; i < gautam.length; i++) {
            System.out.println(gautam[i] + " ");
        }
        System.out.println();
    }
}
