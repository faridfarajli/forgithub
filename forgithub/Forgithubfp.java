package forgithub;

import forgithub.Forgithubutil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Forgithubfp {
    public static void main(String[] args) {
        mtk();
    }
    public static void mtk() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter TE ID "+ "(TE)");
        String s = sc.nextLine();
        boolean f = s.equals("TE");
        {
            if (f) {
                System.out.println("Welcome System "+f);

            } else {
                System.out.println("Access Denied" + "Last 2 Chance");
                mtk2();
            }
            System.out.println("\n1 TE Arena " + "\n2 TE Private " + "\n3 Learn" + "\n4 System Exit");

            try {
                sc = new Scanner(System.in);
                int d = sc.nextInt();
                if (d == 1) {
                    Forgithubutil.arena();
                } else if (d == 2) {
                    Forgithubutil.tePrivate();
                } else if (d == 3) {
                    Forgithubutil.tolearn();
                }else if (d==4) {
                    System.exit(0);
                }else {
                    System.out.println("If there is no trouble, enter it properly");
                }
            }catch (InputMismatchException e){
                System.out.println("Enter Number");
                System.exit(0);
            }
        }
    }

    public static void mtk2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String s = sc.nextLine();
        boolean f = s.equals("TE");
        {
            if (f) {
                System.out.println("Welcome System  "+f);

            } else {
                System.out.println("Access denied" + "Last 1 chance");
                mtk3();
            }
            System.out.println("\n1 TE Arena " + "\n2 TE Private " + "\n3 Learn"+"\4System Exit");
            try {
                sc = new Scanner(System.in);
                int d = sc.nextInt();
                if (d == 1) {
                    Forgithubutil.arena();
                } else if (d == 2) {
                    Forgithubutil.tePrivate();
                } else if (d == 3) {
                    Forgithubutil.tolearn();
                }else if (d==4) {
                    System.exit(0);
                }else {
                    System.out.println("If there is no trouble, enter it properly");
                }
            }catch (InputMismatchException e){
                System.out.println("Enter Number");
                System.exit(0);
            }
        }
    }
    public static void mtk3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter TE ID");
        String s = sc.nextLine();
        boolean f = s.equals("TE");
        {
            if (f) {
                System.out.println("Welcome System"+f);
            } else {
                System.out.println("System Closed");
                security();
            }
            System.out.println("\n1 TE Arena " + "\n2 TE Private " + "\n3 Learn"+"\n4 System Exit" );

            try {
                sc = new Scanner(System.in);
                int d = sc.nextInt();
                if (d == 1) {
                    Forgithubutil.arena();
                    mtk();
                } else if (d == 2) {
                    Forgithubutil.tePrivate();
                    mtk();
                } else if (d == 3) {
                    Forgithubutil.tolearn();
                    mtk();
                }else if (d==4) {
                    System.exit(0);
                }else {
                    System.out.println("If there is no trouble, enter it properly");
                }
            }catch (InputMismatchException e) {
                System.out.println("Enter Number");
                System.exit(0);
            }
        }
    }
    public static void security(){
        try {
            System.out.println("System Closed");
            Scanner sl = new Scanner(System.in);
            System.out.println("Enter the security code to Boot the System");
            int a = sl.nextInt();
            if (a == 13) {
                mtk3();
            } else {
                System.out.println("All System Closed!");
                System.exit(0);
            }
        }catch (InputMismatchException e){
            System.out.println("Enter Number" );
            security();
        }
    }

}
