import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    double [] number = new double [10];

    for(int i = 0; i < number.length;i++){
    System.out.println("Please enter in 10 integers to put into the array " + (i+1));
    number[i] = input.nextDouble();
    }
    System.out.println("Please enter a number to find");
    int num = input.nextInt();
    
    for (int i = 0; i < number.length; i++){
    if(num ==number[i]) System.out.println(num  +" is located at array " + i);
    }
  }
}
