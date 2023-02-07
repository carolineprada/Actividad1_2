import javax.swing.*;
import java.util.Scanner;

public class Ejercicio10 {
    //Variable are declared to find the operation
    static int operator(int a, int b, String j) {

        //conditional
        if (j.equals("+") ){

            int oper = (a+b);
            return oper;

        } else if (j.equals("-") ) {
            int oper = (a-b);
            return oper;
        } else if (j.equals("*") ) {
            int oper = (a*b);
            return oper;
        } else if (j.equals("/") ) {
            int oper = (a/b);
            return oper;
        } else if (j.equals("%") ) {
            int oper = (a%b);
            return oper;
        } else {
            int oper = (int) Math.pow(a,b);
            return oper;
        }


    }

    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        int a, b, resul;
        String j;

        //a Variable
        System.out.print("Enter a number ");
        a = teclado.nextInt();

        //b Variable
        System.out.print("Enter another number ");
        b = teclado.nextInt();

        //operator Variable
        System.out.print("Enter the operator [+, -, *, /, %, **] ");
        j = teclado.next();

        resul = operator(a, b, j);

        if (!j.equals("+") && !j.equals("-") && !j.equals("*") && !j.equals("/") && !j.equals("%") && !j.equals("**") ) {
            //Function
            System.out.println("Invalid Operator");
        }else
            //Print
            System.out.println("resul is: " + resul);
        }

    }



