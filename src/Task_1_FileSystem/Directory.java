package Task_1_FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends NamedFSItem{
    private final List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }
    public void add (FSItem fsItem)throws IllegalArgumentException{
        items.add(fsItem);
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
