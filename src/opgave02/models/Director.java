package opgave02.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Director {
    private String name;
    private LocalDate birthday;

    public Director(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Navn: " + name + " Fødselsdag: " + birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}