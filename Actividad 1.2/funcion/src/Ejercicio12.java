import java.util.Scanner;

public class Ejercicio12 {
    //Variable are declared day week
    static String daysW(String dia) {


        if (dia.equals("LUNES")){

            String fin = "MARTES";
            return fin;

        } else if (dia.equals("MARTES")){

            String fin = "MIERCOLES";
            return fin;
        } else if (dia.equals("MIERCOLES") || dia.equals("MIÉRCOLES")){

            String fin = "JUEVES";
            return fin;
        } else if (dia.equals("JUEVES")){

            String fin = "VIERNES";
            return fin;
        } else if (dia.equals("VIERNES")){

            String fin = "SÁBADO";
            return fin;
        }else if (dia.equals("SABADO") || dia.equals("SÁBADO")){

            String fin = "DOMINGO";
            return fin;
        }else {
            String fin = "LUNES";
            return fin;
        }
    }

    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        String dayw, dia, valid;

        //a Variable
        System.out.print("Enter a day week ");
        dayw = teclado.next();
        valid = dayw.toUpperCase();

        if (valid.equals("LUNES")||valid.equals("MARTES") ||valid.equals("MIERCOLES")||valid.equals("MIÉRCOLES")||valid.equals("JUEVES")||valid.equals("VIERNES")||valid.equals("SÁBADO")||valid.equals("SABADO")||valid.equals("DOMINGO")){
            //Function
            dia = String.valueOf(daysW(valid));
            //Print
            System.out.println("The next day is: "+ dia);

        }else {
            //Print
            System.out.println("that's not a valid day of the week");

        }

    }

}

