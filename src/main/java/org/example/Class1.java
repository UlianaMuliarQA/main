package org.example;
public class Class1 {
    public static class Goods {
        String GoodName;
        int QTY;
        int Price;
    }
    public static void main (String[] args) {
        Goods Good1 = new Goods();
            Good1.GoodName = "Амортизатор";
            Good1.QTY = 100;
            Good1.Price = 50;
            System.out.println(Good1.GoodName + Good1.QTY + Good1.Price);
        }
        }
