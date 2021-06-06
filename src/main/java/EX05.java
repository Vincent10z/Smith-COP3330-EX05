/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */


import java.util.Scanner;
public class EX05 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number?");
        String num = input.nextLine();
        int a = Integer.parseInt(num);

        System.out.println("What is the second number?");
        String num2 = input.nextLine();
        int b = Integer.parseInt(num2);

        System.out.println(num+ " + " +num2 +" = "+ (a+b) );
        System.out.println(num+ " - " +num2 +" = "+ (a-b) );
        System.out.println(num+ " * " +num2 +" = "+ (a*b) );
        System.out.println(num+ " / " +num2 +" = "+ (a/b) );

    }
}
