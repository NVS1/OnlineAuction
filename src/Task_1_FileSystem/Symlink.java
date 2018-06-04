package Task_1_FileSystem;

public class Symlink implements FSItem {
    private final String symlinkName;
    private final FSItem item;

    public Symlink(String symlinkName, FSItem item) {
        this.symlinkName = symlinkName;
        this.item = item;
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String getName() {
        return symlinkName+" -> "+item.getName();
    }

    @Override
    public String toString() {
        return "Symlink{" +
                "symlinkName='" + symlinkName + '\'' +
                ", item=" + item +
                '}';
    }
}
