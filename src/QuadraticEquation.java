import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return b * b  - 4 * a * c;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a : ");
        double a = sc.nextDouble();

        System.out.println("Enter the b : ");
        double b = sc.nextDouble();

        System.out.println("Enter the c : ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta) / (2 * a));
            double x2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("The equation has two roots : " + x1 + " And " + x2 );

        }else if ( delta == 0  ){
            double x = -b / (2 * a);
            System.out.println("The equation has one roots : " + x);

        }else {
            System.out.println("The equation has no roots");
        }


    }
}
