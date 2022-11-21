import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int number;
        int i;
        int j;
        int count;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number bigger than three and odd:");
        number=scanner.nextInt();
        count= number-1;
        if((number>3)&&(number%2==1)){
            for(j=1;j<=number;j++){
                for(i=1;i<=count;i++){
                    System.out.print("");
                }
                count--;
                for(i=1;i<=2*j-1;i++){
                    System.out.print("*");
                }
                System.out.println("Enter a number bigger than three and odd:");
            }
            count=1;
            for(j=1;j<number-1;j++) {
                for (i = 1; i <= count; i++) {
                    System.out.print("");
                }
                count++;
                for (i = 1; i <= 2 * (number - j) - 1; i++) {
                    System.out.print("*");
                }
            }
        }else{
            System.out.println("Number must be bigger than three odd, please try again");
        }

    }
}
