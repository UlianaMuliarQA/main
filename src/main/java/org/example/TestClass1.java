package org.example;

public class TestClass1 {
    public static void main(String[] args) {
        int intnumber1=4;
        boolean boolenA=intnumber1!=4;
        String text1="A";
        String text2="B";
        boolean boolenB=text1==text2;
        if (boolenA){
            System.out.println("intnumber1=4");
        }else{
            System.out.println("true");
        }
        if (boolenB){
            System.out.println("diferent");
        }else {
            System.out.println("other");
        }
        if (intnumber1==5){
            System.out.println("t");
        }else{
            System.out.println("t1");
        }
        boolean c = 4==4;
        System.out.println(!c);
//String1.equals(Stringn2)
    }
}