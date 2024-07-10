import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        System.out.println("Please enter an integer: ");
        int value = scanner.nextInt();

        main.increment(value);
        System.out.println("original value: " + value);

    }

    public void increment(int integer) {
        integer++;
        System.out.println("incremented value: " + integer);
    }
}
