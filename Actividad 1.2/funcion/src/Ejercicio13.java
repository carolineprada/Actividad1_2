import java.util.Scanner;

public class Ejercicio13 {
    //Variable are declared to find increase and new salary
    static double salary(double sal) {

        if (sal <= 800000){

            double aum = (sal*0.10);
            return aum;
        } else if (sal > 800000 && sal <1200000) {
            double aum = (sal*0.08);
            return aum;
        }else {
            double aum = (sal*0.05);
            return aum;
        }

    }

    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        double sal, aum, newsal;

        //a Variable
        System.out.print("Enter your salary: ");
        sal = teclado.nextInt();


        //Function
        aum = salary(sal);
        newsal = (aum + sal);


        //Print
        System.out.println("Your Increase is: "+aum + " and your new salary is: "+newsal);
    }

}

