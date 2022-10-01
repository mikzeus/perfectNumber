import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {

       int n, total = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("please Enter a number:");
        n = inp.nextInt();

        for (int i = 1; i < n; i++) {

                if (n % i == 0) {

                    total += i;
                }


                }  if (total == 1) {
                    System.out.println(n + " is not perfect nuber!!!");

                } else if (total == n) {
                    System.out.println(n + " is perfect number");
                }else{
            System.out.println(n + " is not perfect number");
        }
    }
}


