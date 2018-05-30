package Task_1_MusicApp;

import java.util.ArrayList;

public class Playlist {
    private final String title;
    private final ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Incorrectly title");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public long getTotalLength() {
        long sum = 0;
        for (Song song : songs) {
            sum += song.getLength();
        }
        return sum;
    }

    public ArrayList<Song> findByAuthor(String author) {
        ArrayList<Song> songsByAuthor = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAuthor().equals(author)) {
                songsByAuthor.add(song);
            }
        }
        return songsByAuthor;
    }

    public ArrayList<Song> findByTitlePart(String titlePart) {
        ArrayList<Song> songsByTitlePart = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().startsWith(titlePart)) {
                songsByTitlePart.add(song);
            }
        }
        return songsByTitlePart;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }
}
