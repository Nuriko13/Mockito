import Manager.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMovieManager {

    MovieManager movie = new MovieManager();
    MovieManager film1 = new MovieManager();
    MovieManager film2 = new MovieManager();
    MovieManager film3 = new MovieManager();
    MovieManager film4 = new MovieManager();
    MovieManager film5 = new MovieManager();
    MovieManager film6 = new MovieManager();
    MovieManager film7 = new MovieManager();

    @Test
    public void testLimitMovie() {
        Assertions.assertEquals(5, movie.getLimitMovie());
    }

    @Test
    public void testLimitMovieBig() {
        MovieManager movie = new MovieManager(7);
        Assertions.assertEquals(7, movie.getLimitMovie());
    }

    @Test
    public void test() {
        movie.addMovies(film1);
        movie.addMovies(film2);
        movie.addMovies(film3);

        MovieManager[] expected = {film1, film2, film3};
        MovieManager[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastTest() {
        movie.addMovies(film1);
        movie.addMovies(film2);
        movie.addMovies(film3);

        MovieManager[] expected = {film3, film2, film1};
        MovieManager[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLast() {
        MovieManager movie = new MovieManager(4);
        movie.addMovies(film1);
        movie.addMovies(film2);
        movie.addMovies(film3);
        movie.addMovies(film4);
        movie.addMovies(film5);
        movie.addMovies(film6);
        movie.addMovies(film7);

        MovieManager[] expected = {film7, film6, film5, film4};
        MovieManager[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastLimit() {
        movie.addMovies(film1);
        movie.addMovies(film2);
        movie.addMovies(film3);
        movie.addMovies(film4);
        movie.addMovies(film5);
        movie.addMovies(film6);
        movie.addMovies(film7);

        MovieManager[] expected = {film7, film6, film5, film4, film3};
        MovieManager[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}