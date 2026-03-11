import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queue1{
    public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Masukkan umur: ");
        String umur = input.nextLine();

            String[] parts = umur.split(" ");

            Queue<String> terima = new ArrayDeque<>();
            Queue<String> tolak = new ArrayDeque<>();
            Queue<Integer> umurQueue = new ArrayDeque<>();

        for (String part : parts) {
            umurQueue.add(Integer.valueOf(part));
        }

        while (!umurQueue.isEmpty()) {

            int age = umurQueue.remove();
                
                    if (age == 0 || age > 1000) {
                        return;
                    }

                    if (age >= 28 && age <= 118) {
                        terima.add(String.valueOf(age));
                    } else {
                        tolak.add(String.valueOf(age));
                    }
                }
                
                System.out.println("terima: " + terima);
                System.out.println("tolak: " + tolak);
            } 
        }
    }
