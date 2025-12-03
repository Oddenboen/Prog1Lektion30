package opgave02.storage;

import opgave02.models.*;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<TVSerie> series = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    private ArrayList<Director> directors = new ArrayList<>();

  /*  public Director getDirector(String navn) {

        return directors.get(directors.indexOf(director));
    }

    public void addDirector(Director director) {
        if (!directors.contains(director)) {
            directors.add(director);
        }
    } */

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addTVSerie(TVSerie serie) {
        series.add(serie);
    }

    public void printAllMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public void printAllSeries() {
        for (TVSerie serie : series) {
            System.out.println(serie);
        }
    }

    public ArrayList<Movie> getMoviesOfDirector(String name) {
        ArrayList<Movie> movies = new ArrayList<>();
        for (Movie movie : this.movies) {
            if (movie.getDirector().getName() == name) {
                movies.add(movie);
            }
        }
        return movies;
    }

    public ArrayList<TVSerie> getSeriesOfGenre(Genre genre) {
        ArrayList<TVSerie> series = new ArrayList<>();
        for (TVSerie serie : this.series) {
            for (Genre genres : serie.getGenres()) {
                if (genres == genre) {
                    series.add(serie);
                }
            }
        }
        return series;
    }

    public ArrayList<TVSerie> getSeriesOfGenre(Genre[] genres) {
        ArrayList<TVSerie> series = new ArrayList<>();
        for (TVSerie serie : this.series) {
            for (int i = 0; i < genres.length; i++) {
                for (int j = 0; j < serie.getGenres().length; j++) {
                    if (genres[i] == serie.getGenres()[j] && !series.contains(serie)) {
                        series.add(serie);
                    }
                }

            }
        }
        return series;
    }

    public ArrayList<Show> getShowsOfGenre(Genre genre) {
        ArrayList<Show> shows = new ArrayList<>();
        for (TVSerie serie : this.series) {
            for (Genre genres : serie.getGenres()) {
                if (genres == genre) {
                    shows.add(serie);
                }
            }
        }
        for (Movie movie : this.movies) {
            for (Genre genres : movie.getGenres()) {
                if (genres == genre) {
                    shows.add(movie);
                }
            }
        }
        return shows;
    }
}
