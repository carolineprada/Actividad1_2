import java.util.Scanner;

public class Ejercicio2 {

    static int buses (int eg, int ef, int ns){

        int cntBus = (int) Math.ceil((eg*2+ef)/ (double) ns);
        return cntBus;
    }

    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        int eg, ef, ns, cntBus;

        //eg Variable (Fat student)
        System.out.print("How many fat student are there ");
        eg = teclado.nextInt();

        //ef Variable (Thin student )
        System.out.print("How many thin student are there ");
        ef = teclado.nextInt();

        //ns Variable (Chairs numbers in the bus)
        System.out.print("How many seat in the bus ");
        ns = teclado.nextInt();

        cntBus = buses(eg, ef, ns);

        //Exit
        System.out.println("Are needed: " + cntBus + " buses to transport all students");
    }
}
