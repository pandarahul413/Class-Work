import java.util.Scanner;
public class CD {

  public static void main(String[] args) {

    int count = 0, num ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: "); 
    num = sc.nextInt(); 
    while (num != 0) {
      
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}