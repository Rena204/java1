 import java.util.Scanner;

 /**
  * program
  */
 public class task1 {

   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
         System.out.print("Введите число: ");
         int start = in.nextInt();
    
     int count = 0;
     int sum = 0;
     int factorial = start;

     for (int i = 1; i <= start; i++) {
         count++;
         sum += i;
       }
   System.out.println("сумма чисел:" + sum);


     for(int i = (start - 1); i > 1; i--) {
       factorial = factorial * i;
    } 
   System.out.println("факториал чисел:" + factorial);

}
 }

