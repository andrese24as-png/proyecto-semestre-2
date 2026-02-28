package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Persons;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Persons persons = new Persons ();
        Persons persons2 = new Persons ();
        Persons persons3 = new Persons ();

        persons.setFirstName("Andres");
        persons.getLastName();
        persons2.setFirstName("Camilo");
        persons2.getLastName();
        persons3.setFirstName("Juan");
        persons3.getLastName();

        Persons persons4 = new Persons ( 1L, "123", "1013339764", "Andres", "Escobar", true    );
        persons4.getFirstName();



    }
}
