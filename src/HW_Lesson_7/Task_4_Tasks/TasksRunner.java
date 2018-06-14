package HW_Lesson_7.Task_4_Tasks;

import java.time.LocalDateTime;

public class TasksRunner {
    public static void main(String[] args) {
        Task task1 = new Task(01,"HW", "task 1-4", LocalDateTime.of(2018,6,16, 15,0), Priority.MAJOR);
        Task task2 = new Task(02,"course project", "Part 1",LocalDateTime.of(2018,6,9, 15,0), Priority.NORMAL);
        Task task3 = new Task(03,"pass course project", "Full",LocalDateTime.of(2018,6,30, 15,0), Priority.MINOR);
        Task task4 = new Task(04,"feed the cat", "meow meow",LocalDateTime.of(2018,6,14, 15,0), Priority.MAJOR);

        Tasks myTasks = new Tasks();
        myTasks.addTask(task2);
        myTasks.addTask(task1);
        myTasks.addTask(task3);
        myTasks.addTask(task4);

        System.out.println(myTasks.filter(TaskPredicates.hasPriority(Priority.MAJOR))); //"HW", "feed the cat"
        System.out.println(myTasks.filter(TaskPredicates.hasExpiredDeadline())); //"course project"
        System.out.println(myTasks.filter(TaskPredicates.nameContains("course"))); //"course project"

        myTasks.sort(TaskComparators.byDeadline());
        System.out.println("Sort by deadline");
        System.out.println(myTasks);
        myTasks.sort(TaskComparators.byName());
        System.out.println("Sort by names");
        System.out.println(myTasks);
        myTasks.sort(TaskComparators.byPriority());
        System.out.println("sort by priority");
        System.out.println(myTasks);
    }
}
