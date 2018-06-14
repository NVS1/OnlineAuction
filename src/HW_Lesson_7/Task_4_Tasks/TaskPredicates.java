package HW_Lesson_7.Task_4_Tasks;

import java.time.LocalDateTime;
import java.util.function.Predicate;

public class TaskPredicates {
    public static Predicate<Task> nameContains(String substring){
        Predicate<Task> predicate = new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getName().startsWith(substring);
            }
        };
        return predicate;
    }
    public static Predicate<Task> hasExpiredDeadline (){
        Predicate<Task> predicate = new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getDeadline().isBefore(LocalDateTime.now());
            }
        };
        return predicate;
    }
    public static Predicate<Task> hasPriority(Priority priority){
        Predicate<Task> predicate = new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getPriority().equals(priority);
            }
        };
        return predicate;
    }
}
