import java.util.Scanner;
public class multiply {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter value for n1..:");
int i=scan.nextInt();
System.out.println("Enter value for n2...:");
int j=scan.nextInt();
int mul=i*j;
System.out.println("The Multiplication of " +i +" and "+ j+ " is..:"+mul);
}
}