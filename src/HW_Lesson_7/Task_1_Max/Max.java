package HW_Lesson_7.Task_1_Max;

import java.util.Comparator;
import java.util.List;

public class Max  {
    public static <T> T max(List<T> list, Comparator<T> comparator) throws IllegalArgumentException{
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        T max = list.get(0);
        for (T elem : list) {
            if (comparator.compare(elem, max)>0){
                max=elem;
            }
        }
        return max;
    }
}
