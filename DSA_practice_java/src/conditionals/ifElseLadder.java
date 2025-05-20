package conditionals;

import java.util.*;
public class ifElseLadder {
    public static void main (String args[]){

        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        if(button==1){
            System.out.println("Welcome");
        }else if(button == 2){
            System.out.println("Namaskar");
        }else if(button == 3){
            System.out.println("Swagat");
        }else {
            System.out.println("Invalid entry !");

        }
    }
}
