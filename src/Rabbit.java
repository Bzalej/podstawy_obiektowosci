import java.util.Scanner;

public class Rabbit {
    private int length;
    private String name;
    private boolean softness;
   Rabbit(int length, String name, boolean softness){
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
public void changeLength(int length){
       this.length=length;
}
public int vievLength(){
       return length;
}
public double changeLengthUnit(int length){
       double cale=length*2.54;
       return cale;


}

}
