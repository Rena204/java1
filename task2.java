public class task2 {
    public class program {
        public static void main(String args[]) {
          numbers(1, 1000);
      
        }
        public static void numbers(int x, int y) {
          int counter = 0;
          while (counter < y) {
              if (simple(x)) {
                  System.out.println("i = " + x);
                  counter++;
              }
              x++;
          }
      }
      
      public static boolean simple(int num) {
          for (int x = 2; x < num; x++) {
              if (num % x == 0) {
                  return false;
              }
          }
          return true;
      }
      }
      
}
