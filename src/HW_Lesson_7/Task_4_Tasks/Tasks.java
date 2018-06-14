package HW_Lesson_7.Task_4_Tasks;

import HW_Lesson_7.Task_3_Filter.Filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Tasks {
    private final List<Task> tasks;

    public Tasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Tasks() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }
    public void sort(Comparator<Task> comparator){
        tasks.sort(comparator);
    }
    public Tasks filter (Predicate<Task> predicate){
        Tasks filtered = new Tasks(Filter.filter(tasks,predicate));
        return filtered;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "tasks=" + tasks +
                '}';
    }
}
