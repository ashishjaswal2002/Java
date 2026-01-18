public class Car {

   private int speed;
   private String color;


   public Car(String color){
       this.color = color;
   }
    void drive(){
        System.out.println("Driving..");
    }

    void setSpeed(int speed){
       if(speed<0){
           System.out.println("Not possible !");
       }else{
           this.speed = speed;
           System.out.println("Car Driving at "+speed+"KM/H");
       }

    }
    void getSpeed(int speed){
        System.out.println(speed);
    }


}
