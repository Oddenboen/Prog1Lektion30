package opgave02.models;

import java.util.ArrayList;

public class TVSerie extends Show{
    private int numberOfSeasons;

    public TVSerie(String title, int numberOfSeasons, Genre[] genres, ArrayList<Actor> cast) {
        super(title,genres,cast);
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public String toString() {
        String retur = "";
        retur += "Titel: " + getTitle() + " Antal sæsoner: " + numberOfSeasons + " Genre:";

        for (Genre genre : getGenres()) {
            retur+= " " + genre;
        }
        retur += " Skuespillere:";
        for (Actor actor : getCast()) {
            retur+= " " + actor;
        }
        return retur;
    }
}