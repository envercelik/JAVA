package B08Collections.P2Examples.E07;

public class Patient implements Comparable<Patient>{

    private int id;
    private String name;
    private String illness;
    private int illnessPriority;


    public Patient(int id, String name, String illness ) {
        this.id = id;
        this.name = name;
        this.illness = illness;

        if (illness.equals("appendicitis")) {
            this.illnessPriority = 1;
        } else if (illness.equals("ambustion")) {
            this.illnessPriority = 2;
        } else  if (illness.equals("headache")) {
            this.illnessPriority = 3;
        } else {
            System.out.println("invalid illness");
            this.illnessPriority = 1000;
        }


    }

    @Override
    public int compareTo(Patient patient) {
        if (this.illnessPriority < patient.illnessPriority) {
            return -1;
        } else if (this.illnessPriority > patient.illnessPriority) {
            return 1;
        } else {
            return 0;
        }


    }


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", illness='" + illness + '\'' +
                ", illnessPriority=" + illnessPriority +
                '}';
    }
}
