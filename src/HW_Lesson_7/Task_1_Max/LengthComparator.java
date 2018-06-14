package HW_Lesson_7.Task_1_Max;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

