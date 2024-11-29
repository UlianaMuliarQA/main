package org.example;
public class Objects2 {
    public static class Humster {
        String Name;
        int Age;
        double Weight;
        String Color;
    }
public static void main(String[] args) {
        Humster Humster1 = new Humster();
        Humster1.Name = "Горошок";
        Humster1.Weight =0.5;
        Humster1.Color = "Cshbq";
        System.out.println(Humster1.Name+Humster1.Age+Humster1.Color+Humster1.Weight);
    }
}
