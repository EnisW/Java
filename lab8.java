public class lab8 {
    public static void main(String[] args) {

        Fan FAN1 = new Fan();
        Fan FAN2 = new Fan();
        Fan FAN3 = new Fan();

        FAN1.setSpeed(FAN1.SLOW);
        FAN2.setSpeed(FAN2.MEDIUM);
        FAN3.setSpeed(FAN3.FAST);

        FAN1.setRadius(10.0);
        FAN2.setRadius(7.5);
        FAN3.setRadius(5.0);

        FAN1.setOn(true);
        FAN2.setOn(true);
        FAN3.setOn(false);

        FAN1.setColor("Yellow");
        FAN2.setColor("Red");
        FAN3.setColor("Blue");

        System.out.println(FAN1.toString());
        System.out.println(FAN2.toString());
        System.out.println(FAN3.toString());


    }


}
class Fan {
   public final int SLOW = 1;


   public final int MEDIUM = 2;


   public final int FAST = 3;


   private int Speed = SLOW;

   private boolean On = false;

   private double Radius =5.0;

   private String Color = "blue";



   public void setSpeed(int speed){
       this.Speed = speed;
   }

    public void setOn (boolean on){
        this.On=on;
    }

   public void setRadius(double radius){
       this.Radius = radius;
    }

    public void setColor(String color){
       this.Color = color;
    }

    public int getSpeed(){
       return Speed;
    }
    public boolean getOn(){
       return On;
    }
    public double getRadius(){
       return Radius;
    }
    public String getColor(){
       return Color;
    }

    public Fan(){


    }
    public String toString(){
String str = "";
       if(On){
           str = "Fan speed: " + Speed + ", color: " + Color + ", radius: " + Radius;
       }
       else {
           return "Fan speed: " + Speed + ", color: " + Color + ", radius: " + Radius;
       }
return str;


    }

}
