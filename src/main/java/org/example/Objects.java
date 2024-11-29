package org.example;

public class Objects {
    public static class Cats {
        String Name;
        int Age;
        char Weight;
    }

    public static void main(String[] args) {
     Cats Hi = new Cats();
     Hi.Name="Hi";
     Hi.Age=5;
     Hi.Weight='@';
        System.out.println(Hi.Name+Hi.Age+Hi.Weight);
    }
}
