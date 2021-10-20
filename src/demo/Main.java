package demo;

import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Write a number between 1-5");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(5);
        int userguess = scanner.nextInt();
        int inputs = 1;
        boolean stop = true;

        while (stop)
            if (userguess != number) {
                System.out.println("Try again");
                System.out.println(number);
                userguess = scanner.nextInt();
                inputs++;
            } else if (userguess == (number)) {
                System.out.println("Correct");
                stop = false;
            }
        System.out.println(inputs);
        try {
            FileWriter fw = new FileWriter("/Users/Ozcan/Desktop/DMI.txt");
            fw.write(inputs);
        } catch (Exception ex) {
            return;
        }

    }
}
