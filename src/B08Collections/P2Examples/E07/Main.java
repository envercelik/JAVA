package B08Collections.P2Examples.E07;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {


        Queue<Patient> emergency = new PriorityQueue<>();

        emergency.offer(new Patient(1,"ahmet","headache"));
        emergency.offer(new Patient(2,"mehmet","ambustion"));
        emergency.offer(new Patient(3,"selim","headache"));
        emergency.offer(new Patient(4,"selda","ambustion"));
        emergency.offer(new Patient(5,"melda","appendicitis"));

        while (!emergency.isEmpty()) {
            System.out.println("Next patient : " + emergency.poll());
        }

    }
}
