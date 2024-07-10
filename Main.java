import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        System.out.println("Please enter an integer: ");
        int value = scanner.nextInt();

        main.increment(value);
        System.out.println("original value in the main method: " + value);

    }

    public void increment(int integer) {
        System.out.println("original value in the increment method: " + integer);
        integer++;
        System.out.println("incremented value: " + integer);
    }
}
