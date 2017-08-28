import java.io.Console;
// Class to check if number is even or odd
public class EvenNumber {
     public static void main(String[] args) {
       Console myConsole = System.console();
       System.out.println("Enter a value to check whether its even or not");
       String input = myConsole.readLine();
       Integer value = Integer.parseInt(input);

       if(value%2 == 0){
         System.out.println("You have entered an even number");
       }else{
         System.out.println("You have entered an odd number");
       }
     }
  }
