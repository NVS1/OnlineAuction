package Task_2_CinemaApp;

public class Movie {
    private final String name;
    private final int year;
    private final int length;
    private final String description;

    public Movie(String name, int year, int length, String description) {
        this.name = name;
        this.year = year;
        this.length = length;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task_2_CinemaApp.Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", description='" + description + '\'' +
                '}';
    }
}
