import java.util.Scanner;

public class Ejercicio5 {
    //Variable are declared to find the area of the radius of a circular crown
    static double radcrown (Double r, Double R){

        Double crown = (Double) Math.PI*((R*R)-(r*r));
        return crown;
    }

    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        Double r, R, crown;

        //large circle radius Variable
        System.out.print("What is the large circle radius? ");
        R = teclado.nextDouble();

        //Small circle radius Variable
        System.out.print("What is the Small circle radius? ");
        r = teclado.nextDouble();

        crown = radcrown(r, R);

        //Print
        System.out.println("The radius of the circular crown is: "+ crown);
    }
}
