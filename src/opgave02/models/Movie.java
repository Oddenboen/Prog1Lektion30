package opgave02.models;

import java.util.ArrayList;

public class Movie extends Show{
    private int productionYear;
    private Director director;
    private double rating;

    public Movie(String title, int productionYear, Director director, Genre[] genres,
                 double rating, ArrayList<Actor> cast) {
        super(title,genres,cast);
        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        String retur = "";
        retur += "Titel: " + getTitle() + " Produktionsår: " + productionYear + " Instrutuktør: " + director + " Genre:";
        for (Genre genre : getGenres()) {
            retur += " " + genre;
        }
        retur+= " Rating: " + rating + " Skuespillere:";

        for (Actor actor : getCast()) {
            retur += " " + actor;
        }

        return retur;
    }
}