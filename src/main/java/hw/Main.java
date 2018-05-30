
package hw;


public class Main {




  public static void main(final String[] args) {
    int max=0;
    if (args.length > 0) {
      try {
        max = Integer.parseInt(args[0]);
        if (max<0){
          System.out.println("Enter a positive integer");
        }

      } catch (NumberFormatException e) {
        System.out.println("The argument entered must be an integer ");
        //In our case, you can use System.out.println.
        System.exit(1);
      }
      /* Since you are trapping the error, you can exit with a 0 instead of
       *1.  By convention, a 0 means a normal exit (no error), and a non-*zero value means some type of error.  But it still ends the program
       *and returns to the OS.  So it’s more of a status message to you.
       */
    }

    for (int i=1; i<=max; i++){
      if ( i%3==0 && i%5==0) {
        System.out.println("Fizz Buzz");
      } else if (i%5==0) {
        System.out.println("Buzz");
      } else if (i%3==0) {
        System.out.println("Fizz");
      } else
        System.out.println(i);


    }




  }




}



