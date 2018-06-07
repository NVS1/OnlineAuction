package HW_Lecture_5_6.Task_1_FileSystem;

public class File extends NamedFSItem {
    private final int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                '}';
    }
}
