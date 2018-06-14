package HW_Lesson_7.Task_3_Filter;

import java.util.function.Predicate;

public class RangePredicate implements Predicate<Integer> {
    private final int min;
    private final int max;

    public RangePredicate(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean test(Integer n) {
        return n >= min && n <= max;
    }
}

