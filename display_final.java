import java.util.Scanner;
public class display_final {
  public static void main(String[] args) {
    int value, result;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a value");
    value = input.nextInt();
    result = (value+5)*2-7;
    System.out.println("Result is " +result);
  }
}
