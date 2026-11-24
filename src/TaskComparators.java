import java.util.Comparator;

public class TaskComparators {
    public static void main(String[] args) {

    }
    public static class byDifficulty implements Comparator<Task>{
        @Override
        public int compare(Task a, Task b){
            return a.getDifficulty().compareTo(b.getDifficulty());
        }
    }
    public static class byCompleted implements Comparator<Task>{
        @Override
        public int compare(Task a, Task b){
            return a.getCompleted().compareTo(b.getCompleted());
        }
    }
    public static class byDueTime implements Comparator<Task>{
        @Override
        public int compare(Task a, Task b){
            return a.getDueTime().compareTo(b.getDueTime());
        }
    }
}
