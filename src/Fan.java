import java.awt.*;

public class Fan {
    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;

    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }


    public void setSpeed(int speed) {
       this.speed = speed;
    }

    public  void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
       this.color = color;
    }

    public String toString() {
        if(on){
            return " Speed : " + speed + " Color : " + color + " Radius : " + radius + " fan is on";
        }else {
            return " Color : " + color + " radius :" + radius + " fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.setSpeed(fan.Fast);
        fan.setOn(true);
        fan.setRadius(10);
        fan.setColor("yellow");

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.Medium);
        fan1.setRadius(5);
        fan1.setColor("blue");

        System.out.println(fan.toString());
        System.out.println(fan1.toString());
    }
}


