package Manager;

public class MovieManager {
    private MovieManager[] movies;
    private int limitMovie = 5;
    private int resultLength;

    public MovieManager() {
        this.limitMovie = limitMovie;
        this.movies = new MovieManager[0];
    }

    public MovieManager(int size) {
        limitMovie = size;
        this.movies = new MovieManager[0];
    }

    public int getLimitMovie() {
        return limitMovie;
    }

    public MovieManager[] findAll() {
        return movies;
    }

    public void addMovies(MovieManager item) {
        MovieManager[] tmp = new MovieManager[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }

    public MovieManager[] findLast() {
        if (limitMovie > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limitMovie;
        }
        MovieManager[] result = new MovieManager[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}