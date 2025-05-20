package conditionals;


import java.util.*;
public class EveneOdd {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A = > ");
        int a=sc.nextInt();
        System.out.println("Enter the value of B = > ");
        int b=sc.nextInt();
       if (a==b) {
           System.out.println("A ia equals to B");
       }else {
        if (a<b) {
            System.out.println("A is lesser then B ");
        }else {
            System.out.println("A is greater then B");
        }
       } 
    }


}