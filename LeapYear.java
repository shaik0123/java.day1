package day1;

import java.util.Scanner;

//import java.util.Scanner;
//
//public class LeapYear {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter a year");
//        int year=s.nextInt();
//        System.out.println(year);
//        boolean flag=false;
//        if(year>=1582)
//        {
//            if(year % 4 == 0) {
//                flag=true;
//
//        }
//            else if(year % 400 == 0){
//                flag=true;
//        }
//        else if (year % 100 != 0){
//            flag=true;
//        }
//        else{
//            flag=false;
//        }
//        if(flag)
//        {
//                System.out.println(year + "is a leap year");
//            }
//            else{
//                System.out.println(year + "is not a leap year");
//            }
//        }
//
//    }
//}
class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year");
        int year = s.nextInt();
        boolean leap = false;

        if(year >= 1582){

            if (    (   (year % 4 == 0) && (year % 100!= 0)  ) || (year%400 == 0)   )
                System.out.println("Specified year is a leap year");
            else
                System.out.println("Specified year is not a leap year");
        }
        else {
            System.out.println("enter correct");
        }
    }
}