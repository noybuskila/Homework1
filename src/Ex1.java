import java.util.Scanner;

public class Ex1 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for a:");
        double a = scanner.nextDouble();
        System.out.println("Enter a value for b:");
        double b = scanner.nextDouble();
        System.out.println("Enter a value for c:");
        double c = scanner.nextDouble();
        double result = (b * b - 4.0 * a * c)/(2*a);
        double x1, x2;
        double rootCalc =(-b+Math.sqrt(result))/(2*a);
        if(a!=0)
        {
            if(result>0)
            {
                x1= rootCalc;
                x2= rootCalc;
                System.out.println("There are two different roots:" + x1 + " and:" + x2);
            }
            else if(result==0)
            {
                x1=rootCalc;
                x2=rootCalc;
                System.out.println("There is one rootCalc" + x1 + "" + x2);
            }
            else if(result<0)System.out.println("There are no roots");
        }
    }

}
