import java.util.Scanner;

public class LabProgram {

   /* TODO: Write recursive reverseString() method here. */
   
   public static String reverseString(String input){
     if(input.isEmpty()){
        return input;}
        else {
           return reverseString(input.substring(1)) + input.charAt(0);
	   }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input, result;
      
		input = scnr.nextLine();
		result = reverseString(input);	  
		System.out.printf("Reverse of \"%s\" is \"%s\".", input, result);
   }
}

