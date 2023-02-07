import java.util.Scanner;

public class Ejercicio4 {
    //Variable are declared to find the savings
    static double savings (double sl){

        double save = (int)(sl-(sl*0.55)/1.0);
        return save;
    }

    //Variable are declared to find the rental
    static double rental (double sl){

        double rent = (sl*0.40);
        return rent;
    }

    //Variable are declared to find the food
    static double food (double sl){

        double foo = (sl*0.15);
        return foo;
    }


    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        Double sl, save, rent, foo;

        //co Variable
        System.out.print("What is your salary? ");
        sl = teclado.nextDouble();

        save = savings(sl);
        rent = rental(sl);
        foo = food(sl);

        //Print
        System.out.println("Your Cost of the rental is: "+ rent);
        System.out.println("Your Cost of the food is: "+ foo);
        System.out.println("Your Saving is: "+ save);
    }
}

