import java.util.Scanner;

public class Ejercicio3 {
    //Variable are declared to find the hypotenuse
    static double hipotenusa (double co, double ang){

        double hypote = (double)(co/Math.sin(ang));
        return hypote;
    }

    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        Double co, hypote;
        //Transform from angles to radians
        Double ang = Math.toRadians(27);

        //co Variable
        System.out.print("What is the height? ");
        co = teclado.nextDouble();

        hypote = hipotenusa(co, ang);

        //Print
        System.out.println("The length of the staircase is: "+ hypote);
    }
}
