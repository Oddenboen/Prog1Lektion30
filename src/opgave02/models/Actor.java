package opgave02.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Actor {
    private String name;
    private LocalDate birthday;

    public Actor(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Navn: " + name + " Fødselsdag: " + birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
