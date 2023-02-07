import java.util.Scanner;

public class Ejercicio1 {
    //Function Variables
    static int funcion (int x, int y){

        int f = (x*x)+2*x*y+(y*y);
        return f;

    }

    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        int x, y, f;

        //X Variable
        System.out.print("Ingrese el valor de x ");
        x = teclado.nextInt();

        //Y Variable
        System.out.print("Ingrese el valor de y ");
        y = teclado.nextInt();

        //Function is called (line5)
        f = funcion(x,y);

        //Imprimir Salida
        System.out.println("El resultado es: " + f);

    }
}
