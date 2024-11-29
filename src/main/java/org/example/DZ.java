package org.example;

public class DZ {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        boolean result1 = a<b;
        boolean result2 = a>b;
        boolean result3 = a<=4;
        boolean result4 = a==b;
        // resalt5 - написала без boolean
        boolean result6 =  a != b;
        // resalt7, resalt8, resalt9 - написала без boolean
        String text1="Правда";
        String text2="Фальш";
// ---1. result = a < b;  // истина --------------
        if (result1){
            System.out.println("1."+text1);
        }else{
            System.out.println(text2);
        }
// ---2. result = a > b;  // ложь --------------
        if (result1) {
            System.out.println("2."+text2);
        }
// ---3. result = a <= 4; // меньше или равно - истина--------------
        if (result3) {
            System.out.println("3."+text1);
        }
// ---4. result = b >= 6;  // больше или равно - ложь--------------
        if (result4) {
            System.out.println("4."+text1);
        }else {
            System.out.println("4."+text2);
        }
// ---5. result = a == b;  // равно - ложь--------------
        if (a==b) {
            System.out.println("5."+text1);
        }else {
            System.out.println("5."+text2);
        }
// ---6. result = a != b;  // неравно - истина--------------
        if (result6) {
            System.out.println("6."+text1);
        }else {
            System.out.println("6."+text2);
        }
// ---7. result = a > b || a < b;  // логическое ИЛИ - истина--------------
        if (result2 || result1) {
            System.out.println("7."+text1);
        }else {
            System.out.println("7."+text2);
        }
// ---8. result = 3 < a && a < 6;  // логическое И - истина--------------
        if (3<a && a<6) {
            System.out.println("8."+text1);
        }else {
            System.out.println("8."+text2);
        }
// ---9. result = !result;  // Логическое НЕ - ложь--------------
        if (result1 = ! result1) {
            System.out.println("9."+text1);
        }else {
            System.out.println("9."+text2);
        }
     //    int value = 5;
    //    if (value<6 && value>7 ||){

     //   }
    }
}