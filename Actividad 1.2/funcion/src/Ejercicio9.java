import java.util.Scanner;

public class Ejercicio9 {
    //Variable are declared to find the number of student per floor
    static int maxi(int a, int b) {

        int maxim = Math.max(a,b);
        return maxim;
    }

    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        int a, b, maxim;

        //a Variable
        System.out.print("Enter a number ");
        a = teclado.nextInt();

        //b Variable
        System.out.print("Enter another number ");
        b = teclado.nextInt();

        //Function
        maxim = maxi(a,b);

        //Print
        System.out.println("The largest number between : "+ a + " and "+ b + " is: "+ maxim);
    }

}
