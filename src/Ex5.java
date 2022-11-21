import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        boolean isFibonacci = false;
        if (number == 0 || number == 1) {
            isFibonacci = true;
        } else {
            int firstNumber = 0;
            int secondNumber = 1;
            int sum = 0;
            for (int i = 1; i < number; i++) {
                sum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sum;
                if (sum == number) {
                    isFibonacci = true;
                    break;
                }
            }
        }
        if (isFibonacci) {
            System.out.println("The number you chose is a fibonacci number");
        } else {
            System.out.println("The number you chose isn't a fibonacci number");
        }
    }
}
