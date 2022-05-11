package forgithub;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Forgithubutil {
    public static void arena(){
        System.out.println("Enter  your information");
        Scanner sc = new Scanner(System.in);
        System.out.println("FIN ");
        String id = sc.next();
        System.out.println("Name");
        String name = sc.next();
        System.out.println("SurName");
        String surName = sc.next();
        System.out.println("E-mail");
        String email = sc.next();
        System.out.println("Number");
        String number = sc.next();
        System.out.println("we will be back");
        System.out.println("Your Data");
        String[] array = {id,name,surName,email,number};
        for (int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void tePrivate(){
        System.out.println("Enter Private ID");
        Scanner sc  = new Scanner(System.in);
        String id =sc.next();
        if (id.equals("TEPRIVATE")){
            System.out.println("You are in the system");
            System.out.println("Your confidential information will be located here.");
        }
    }
    public static void tolearn() {
        System.out.println("What do you want to learn" + "\n1Program Languages,IT,Cyber Security and other" + "\n2Engilsh");
        try {
            Scanner sc = new Scanner(System.in);
            int p = sc.nextInt();

            if (p == 1) {
                System.out.println("Ingress Academy");
                System.out.println("Write your number to join");
                System.out.println("Number");
                int a = sc.nextInt();
                System.out.println("Your Data");
                int[] array = {a};
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            } else if (p == 2) {
                System.out.println("Teachers");
                System.out.println("Write your number to join");
                int a = sc.nextInt();
                System.out.println("Your Data");
                int[] array = {a};
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Enter Number");
            System.exit(0);
        }
    }
}

