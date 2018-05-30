
package hw;



public class FizzBuzz {

    public static void fizzBuzz(int m) {


        for (int i = 1; i <= m; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else
                System.out.println(i);


        }
    }







//    public static String[] fizzBuzz(final int n) {
//        String[] myString = new String[n];
//        for (int i=1; i<=n; i++){
//            if ( i%3==0 && i%5==0){
//                myString[i-1]= "FizzBuzz";
//            }else if (i%3==0){
//                myString[i-1]= "Fizz";
//            }else if (i%5==0){
//                myString[i-1]="Buzz";
//            }else
//                myString[i-1]=String.valueOf(i);
//        }
//        return myString;
//    }





}
