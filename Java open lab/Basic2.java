import java.util.Scanner;

public class Basic2 {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter a valur for i...");
	int i=reader.nextInt();
	System.out.println("Enter a value for j...");
	int j=reader.nextInt();
	int k=i*j;
	System.out.println("The Multiplication of i and j is "+k);
}
}
