import java.util.Scanner; 

public class Fibonacci {
    public static void main(String[] args) {
    int FibLength; 
    Scanner sc = new Scanner (System.in); //creates object 
    
    
    System.out.println("Enter the length of Fibonacci series:");
    FibLength=sc.nextInt();//reads user input
    
    int[] num = new int[FibLength];
    //initalized first element to 0
    num[0] = 0;
    //initalized second element to 1 
    num[1] = 1; 


    //New number should be the sum of the last two in the series
    for (int i = 2; i < FibLength; i++ ) {
        num[i] = num[i - 1] + num[i - 2];
    }

    //prints Fibonacci series 
    System.out.println("Fibonacci Series: ");
        for (int i = 0; i < FibLength; i++) {
            System.out.println(num[i] + " ");

        }

        sc.close();

    }

   
    


    
}
