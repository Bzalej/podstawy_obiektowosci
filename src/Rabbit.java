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

}
