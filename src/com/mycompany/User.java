package com.mycompany;

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
            if (playlist.getTitle().equals(title) || title.isEmpty()) {
                throw new IllegalArgumentException("Incorrectly title or such title is already using");
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
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Incorrectly title");
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
        Playlist playlist1ByTitle = findByTitle(playlist);
        if (playlist1ByTitle != null) {
            playlist1ByTitle.addSong(song);
        } else {
            throw new IllegalArgumentException("Playlist not found");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}
