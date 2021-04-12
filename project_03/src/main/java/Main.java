import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input a number: ");
        float num = in.nextFloat();

        System.out.printf("Your number: %.2f \n", num);
        in.close();
    }
}
