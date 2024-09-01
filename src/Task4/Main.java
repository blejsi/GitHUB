package Task4;

import  java.util.Map;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        MapImplement mapImplement = new MapImplement();

        mapImplement.addToStorage("Blejsi", "Mora");
        mapImplement.addToStorage("Marsi", "Mara");
        mapImplement.addToStorage("Dankan", "Bylyku");
        mapImplement.addToStorage("Amla", "Mora");



        mapImplement.printValues();
        System.out.println( mapImplement.findValues("Dankan"));

    }
}