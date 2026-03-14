package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Persons;
import co.edu.cesde.ga.models.Students;
import co.edu.cesde.ga.models.Teachers;


public  class Main {
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

        Teachers teachers = new Teachers ();
        teachers.setFirstName("Juan");
        System.out.println(teachers.getFirstName());

        Students students2 = new Students (2L, "456", "9876543210", "camilo", "Gonzalez", true);
        System.out.println(students2.toString());

        Teachers teachers2 = new Teachers (3L, "74108529630", "Andres", "Escobar", true );
        System.out.println(teachers2.toString());

    }
}
