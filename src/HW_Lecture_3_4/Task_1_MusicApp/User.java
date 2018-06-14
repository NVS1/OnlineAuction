package HW_Lecture_3_4.Task_1_MusicApp;

import java.util.ArrayList;

public class User {
    private final String name;
    private final ArrayList<Playlist> playlists = new ArrayList();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Playlist createPlaylist(String title) {
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().equals(title)) {
                throw new IllegalArgumentException("Such title is already using");
            }
        }
        Playlist newPlaylist = new Playlist(title);
        playlists.add(newPlaylist);
        return newPlaylist;
    }

    public Playlist findByTitle(String title) {
        if (playlists.isEmpty()) {
            throw new IllegalStateException("List of playlist is empty");
        }
        Playlist playlistByTitle = null;
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().equalsIgnoreCase(title)) {
                playlistByTitle = playlist;
            }
        }
        return playlistByTitle;
    }

    public void addSongToPlaylist(String playlist, Song song) {
        Playlist playlistByTitle = findByTitle(playlist);
        if (playlistByTitle != null) {
            playlistByTitle.addSong(song);
        } else {
            throw new IllegalArgumentException("Playlist "+playlist+" not found");
        }
    }

    @Override
    public String toString() {
        return "OnlineAuction.User{" +
                "name='" + name + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}
