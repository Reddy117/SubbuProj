import java.util.Scanner;

public class Subbu1 {

	public static void main(String[] args) {
		int x, y;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	 
	      y = in.nextInt();
	      x = in.nextInt();
	 
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	 
	      y = x + y;
	      x = y - x;
	      y = y - x;
	 
	      
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
		
	}
}
