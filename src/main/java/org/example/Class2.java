package org.example;
public class Class2 {
    public static class Salary {
        String TypeSalary;
        String Month;
        int Summ;
        char Valute;
    }
    public static void main (String[] args) {
        Salary Salary1 = new Salary();
        Salary1.TypeSalary = "Найвища";
        Salary1.Month = "Вересень";
        Salary1.Summ = 200000;
        Salary1.Valute = '$';
        System.out.println(Salary1.TypeSalary + " " + Salary1.Month + " " +  Salary1.Summ + " " + Salary1.Valute);
    }
}

