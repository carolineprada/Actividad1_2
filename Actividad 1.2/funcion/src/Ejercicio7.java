import java.util.Scanner;

public class Ejercicio7 {
    //Variable are declared to find the distance
    static double distance(double x1, double y1, double x2, double y2) {

        double var1 = (y2-y1);
        double var2 = (x2-x1);
        Double dist = Math.sqrt((var1*var1) + (var2*var2));
        return dist;
    }

    //Variable are declared to find the pending
    static double pending(double x1, double y1, double x2, double y2) {

        double pend = (double) ((y2-y1)/(x2-x1));
        return pend;
    }

    //Variable are declared to find the midpoint x
    static double midPointX(double x1, double x2) {

        double mid = ((x1+x2)/2);
        return mid;
    }

    //Variable are declared to find the midpoint y
    static double midPointY(double y1, double y2) {

        double mid = ((y1+y2)/2);
        return mid;
    }


    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        double x1, y1, x2, y2, midX, midY, dist, pend;

        //x1 Variable
        System.out.print("Enter point 1 in X ");
        x1 = teclado.nextDouble();

        //y1 Variable
        System.out.print("Enter point 1 in Y ");
        y1 = teclado.nextDouble();

        //x2 Variable
        System.out.print("Enter point 2 in X ");
        x2 = teclado.nextDouble();

        //y2 Variable
        System.out.print("Enter point 2 in Y ");
        y2 = teclado.nextDouble();

        //Function
        dist = distance(x1,y1,x2,y2);
        pend = pending(x1,y1,x2,y2);
        midX = midPointX(x1,x2);
        midY = midPointX(y1,y2);

        //Print
        System.out.println("The distance between the data points is : "+ dist);
        System.out.println("The slope between the data points is : "+ pend);
        System.out.println("The midpoint in X between the data points is : "+ midX);
        System.out.println("The midpoint in Y between the data points is : "+ midY);
    }

}
