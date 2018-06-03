package Task_1_FileSystem;

public class FileSystemRunner {
    public static void main(String[] args) {
        Directory d1 = new Directory("d1");
        Directory d2 = new Directory("d2");
        d1.add(d2);
        d2.add(d1);
    }
}
