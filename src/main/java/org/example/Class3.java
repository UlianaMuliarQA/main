package org.example;

import java.sql.SQLOutput;

public class Class3 {
    public static class Countries{
        String Presedent;
        String Religia;
        int Age;
    }
    public static void main(String[] args) {
  // обєкт Країни, там буде президент, релігія країни, вік країни
        Countries Country1 = new Countries ();
        Country1.Presedent="Zelenski";
        Country1.Religia="Християнство";
        Country1.Age = 33;
        System.out.println(Country1.Presedent+" "+Country1.Religia+" "+Country1.Age);
    }
}
