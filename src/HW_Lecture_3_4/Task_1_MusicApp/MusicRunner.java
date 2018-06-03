package HW_Lecture_3_4.Task_1_MusicApp;

public class MusicRunner {
    public static void main(String[] args) {
        AudioContent content = new AudioContent(new byte[]{});
        Song song1 = new Song("song1", "author1", "Pop", 5, content);
        Song song2 = new Song("song2", "author2", "Rock", 6, content);
        Song song3 = new Song("MySong3", "author3", "Electro", 4, content);
        Song song4 = new Song("MySong4", "author1", "Rock", 5, content);

        User user = new User("User");
        user.createPlaylist("Favorite songs");
        user.addSongToPlaylist("favorite songs", song1);
        user.addSongToPlaylist("favorite songs", song2);

        System.out.println(user);

        user.createPlaylist("All my songs");
        user.addSongToPlaylist("all my songs", song1);
        user.addSongToPlaylist("all my songs", song2);
        user.addSongToPlaylist("all my songs", song3);
        user.addSongToPlaylist("all my songs", song4);

        System.out.println(user);

        System.out.println("Total length is "+user.findByTitle("all my songs").getTotalLength()); //20
        System.out.println("Songs by author is "+user.findByTitle("all my songs").findByAuthor("author1"));
        System.out.println("Songs by title part is "+user.findByTitle("all my songs").findByTitlePart("My"));

    }
}
