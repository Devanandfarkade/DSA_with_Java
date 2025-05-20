package conditionals;

import java.util.Scanner;

public class SwitchCaseEx {

    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number -> ");
        int button=sc.nextInt();
        switch (button){
            case 1:
                System.err.println("Hello");
                break;
            case 2:
                System.out.println("Welcome");
                break;
            case 3 :
                System.out.println("Namaskar");
                break;
            case 4:
                System.out.println("Swagat");
                break;
            case 5:
                System.out.println("Bonjour");
                break;
            default:
            System.out.println("Invalid Button");
        }
    }
}