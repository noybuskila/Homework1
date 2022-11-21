import java.util.Scanner;

public class Ex2 {
    public static void main(String []args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number of your arithmetic progression:");
        int a= scanner.nextInt();
        System.out.println("Enter the difference:");
        int d= scanner.nextInt();
        System.out.println("Enter the number of your arithmetic progression:");
        int n= scanner.nextInt();
        for(int i=1; i<=n;i++){
            System.out.print(a + (i - 1) * d + " ");
        }
    }

}
