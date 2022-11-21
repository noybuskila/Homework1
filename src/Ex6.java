import java.util.Scanner;

public class Ex6 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int number;
        System.out.println("Enter a number:");
        number= scanner.nextInt();
        while (number>0){
            sum= sum+number%10;
            number=number/10;
        }
        System.out.println("Sum of number is:"+ sum);
    }

}
