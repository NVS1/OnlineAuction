package HW_Lesson_7.Task_4_Tasks;

import java.util.Comparator;

public class TaskComparators {
    public static Comparator<Task> byName(){
       Comparator<Task> comparator = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
       return comparator;
    }
    public static Comparator<Task> byDeadline(){
        Comparator<Task> comparator = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getDeadline().compareTo(o2.getDeadline());
            }
        };
        return comparator;
    }
    public static Comparator<Task> byPriority(){
        Comparator<Task> comparator = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o2.getPriority().compareTo(o1.getPriority());
            }
        };
        return comparator;
    }

}
