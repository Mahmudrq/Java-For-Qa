package day4;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Age");
        int person_age= input.nextInt();
        String res = (person_age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(res);
    }
}
