import java.util.Scanner;

public class Rabbit {
    private double length;
    private String name;
    private boolean softness;
   Rabbit(double length, String name, boolean softness){
        this.length=length;
        this.name=name;
        this.softness=softness;
   }
        //metoda dla ustawienia nowej nazwy krolika
   public void changeName (String name){
       this.name=name;


   }
   // metoda pokazującaa nowe imię
    public String vievname(){
       return name;
    }
public void changeSoftness(boolean softness){
       this.softness=softness;
}
    public boolean vievSoft(){
       return softness;
}
public void changeLength(double length){
       this.length=length;
}
public double vievLength(){
       return length;
}
public double changeLengthUnit(double length){
       double cale=length*2.54;
       this.length=cale;
       return cale;
}

}
