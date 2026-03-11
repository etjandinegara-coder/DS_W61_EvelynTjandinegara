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


            for (String part : parts) {
            int age = Integer.parseInt(part);

                if (age >= 28 && age <= 118) {
                    terima.add(part);
                } else {
                    tolak.add(part);
                }
            }

                System.out.println("terima: " + terima);
                System.out.println("tolak: " + tolak);
        }
    }
}