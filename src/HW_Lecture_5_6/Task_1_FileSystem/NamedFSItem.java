package HW_Lecture_5_6.Task_1_FileSystem;

public abstract class NamedFSItem implements FSItem {
    private final String name;

    public NamedFSItem(String name) {
        this.name = name;
    }
    public  String getName(){
        return this.name;
    }
}
