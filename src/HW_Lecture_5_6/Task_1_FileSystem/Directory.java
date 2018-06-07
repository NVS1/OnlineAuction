package HW_Lecture_5_6.Task_1_FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends NamedFSItem{
    private final List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }
    public Directory add (FSItem fsItem)throws IllegalArgumentException{
        checkArg(fsItem);
        items.add(fsItem);
        return this;
    }

    private void checkArg(FSItem fsItem) {
        if (fsItem instanceof Directory) {
            Directory directory = (Directory) fsItem;
            for (FSItem item : directory.getItems()) {
                if (item==this){
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    private List<FSItem> getItems() {
        return items;
    }

    @Override
    public int getSize() {
        int sum = 0;
        for (FSItem item : items) {
            sum+=item.getSize();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "items=" + items +
                '}';
    }
}
