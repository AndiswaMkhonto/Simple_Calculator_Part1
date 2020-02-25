import java.util.Scanner;

public class Calculator {
    public static int add(int...a){
        int sum=0;
        for(int i=0; i<a.length;i++){
            sum = sum+a[i];
        }
        return sum;
    }
    public static int multiply(int...a){
        int product =1;
        for(int j=0; j<a.length;j++){
            product = product*a[j];
        }
        return product;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to add or multiply");

        int size=sc.nextInt();

        int num[] = new int[size];

        System.out.println("Enter "+size+ " numbers");

        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Addition:");
        System.out.println("Sum: "+Calculator.add(num));
        System.out.println("Multiplication");
        System.out.println("Multiplication: "+Calculator.multiply(num));




    }
}
