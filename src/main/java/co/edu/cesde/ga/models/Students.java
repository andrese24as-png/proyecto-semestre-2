package co.edu.cesde.ga.models;

public class Students extends Persons  {
    private String birthDate;

    public Students(long l, String number, String id, String camilo, String gonzalez, boolean b){
        super();
    }

    public Students(Long userId, String code, String documentNumber, String firstName, String lastName, Boolean status, String birthDate) {
        super(userId, code, documentNumber, firstName, lastName, status);
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "students = " +super.toString() +
                "birthDate = '" + birthDate + '\'';
    }

}

