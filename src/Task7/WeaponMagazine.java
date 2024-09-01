package Task7;

import java.util.ArrayList;

public class WeaponMagazine {


     private ArrayList<String> weapon;

     public WeaponMagazine() {
         weapon = new ArrayList<String>();
    }

       public  void loadPistol(){
         weapon.add("Bullet 1");
          weapon.add("Bullet 2");
          weapon.add("Bullet 3");
          weapon.add("Bullet 4");
          weapon.add("Bullet 5");
          weapon.add("Bullet 6");
          weapon.add("Bullet 7");
          weapon.add("Bullet 8");
       }


     public void isLoaded(){
         if(weapon.contains("Bullet 7")){
             System.out.println("Bullet 7 is loaded");
         }else if(weapon.contains("Bullet 6")){
             System.out.println("Bullet 6 is loaded");
         }else if(weapon.contains("Bullet 5")){
             System.out.println("Bullet 5 is loaded");
         }else if(weapon.contains("Bullet 4")){
             System.out.println("Bullet 4 is loaded");
         }else if(weapon.contains("Bullet 3")){
             System.out.println("Bullet 3 is loaded");
         }else if(weapon.contains("Bullet 2")){
             System.out.println("Bullet 2 is loaded");
         }else if(weapon.contains("Bullet 1")){
             System.out.println("Bullet 1 is loaded");
         }else {
             System.out.println("Weapon is empty");
         }
     }


     public  void shot(){
         if (weapon.contains("Bullet 1")){
             System.out.println("One dog killed :(");
         }else{
             System.out.println("You hava no bullets idiot XD");
         }
     }


}
