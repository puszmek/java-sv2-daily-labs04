package day01;

public class MovieMain {

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 1997);

        movie.addActor(new Actor("Leonardo DiCaprio", 1974));
        movie.addActor(new Actor("Kate Winslet", 1975));
        movie.addActor(new Actor("Kathy Bates", 1948));

        System.out.println("Színészek a huszas éveikben: " + movie.actorsInTheirTwenties()); // 2
    }
}
