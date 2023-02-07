import java.util.Scanner;

public class Ejercicio6 {
    //Variable are declared to find the Area
    static int functionsArea (int B, int C, int X){

        //Conditional
        if (X == 1){
            //Calculate Area --> Rectangule
            int areaRectangle = (B*C);
            return areaRectangle;

        } else if (X == 2) {
            //Calculate Area --> Triangle
            int areaTriangle = ((B*C)/2);
            return areaTriangle;
        }else{
            //Calculate Area --> Complete
            int areaComplete = ((B*C)+((B*C)/2));
            return areaComplete;
        }
    }

    //Variable are declared to find the Hypotenuse
    static int functionsHypotenuse(int B, int C){

        int hypote = (int) Math.sqrt((B*B)+(C*C));
        return hypote;

    }

    //Variable are declared to find the Perimeter
    static int functionsPerimeter(int B, int C, int X){

        //Conditional
        if (X == 1){
            //Calculate Perimeter --> Rectangule
            int perimRectangle = ((B*2)+(C*2));
            return perimRectangle;

        } else if (X == 2) {
            //Calculate Perimeter --> Triangle
            int perimTriangle = (int) (B+C+(Math.sqrt((B*B)+(C*C))));
            return perimTriangle;
        }else {
            //Calculate Area --> Complete
            int perimComplete = (((B*2)+(C*2)) + (int) (B+C+(Math.sqrt((B*B)+(C*C)))));
            return perimComplete;
        }
    }


    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        int B, C, X, area, perimeter, hypote;


        //Type Variable (X... Triangle, rectangule, complete)
        System.out.print("What type of land do you want to analyze? " + "\n" + " 1. Rectangle land " + "\n" + " 2. Triangle land " + "\n" + " 3. Complete land ");
        X = teclado.nextInt();

        if (X > 3) {
            //Print
            System.out.println("Value entered is invalid");
        } else {
            //Base Variable
            System.out.print("Indicate the base value ");
            B = teclado.nextInt();

            //Base Variable
            System.out.print("Indicate the height value ");
            C = teclado.nextInt();


            if (X == 1) {
                //Rectangule
                area = functionsArea(B, C, X);
                perimeter = functionsPerimeter(B, C, X);
                //Print
                System.out.println("The rectangular land has: " + "\n" + area + " Area and " + perimeter + " Perimeter");

            } else if (X == 2) {
                //Triangule
                area = functionsArea(B, C, X);
                perimeter = functionsPerimeter(B, C, X);
                hypote = functionsHypotenuse(B, C);
                //Print
                System.out.println("The Triangule land has: " + "\n" + area + " Area, " + perimeter + " Perimeter and " + hypote + " Hypotenuse");

            } else if (X == 3) {
                //Complete
                area = functionsArea(B, C, X);
                perimeter = functionsPerimeter(B, C, X);
                hypote = functionsHypotenuse(B, C);
                //Print
                System.out.println("The Complete land has: " + "\n" + area + " Area, " + perimeter + " Perimeter and " + hypote + " Hypotenuse");
            }
        }
    }
}

