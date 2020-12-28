/***********************************
 ***************@MUSTAFA************
 **********************************/

package com.company;

//Importing Scanner
import java.util.Scanner;

public class Java_04 {

    public static void main(String[] args) {

        //Making Scanner for Keyboard
        Scanner sc = new Scanner(System.in);

        //Marks of all subject 1
        System.out.println("Enter Subject 1(Total Marks=100)");
        //Subject 1 Input from user
        int Subject1 = sc.nextInt();
        //Marks of all subject 2
        System.out.println("Enter Subject 2(Total Marks=100)");
        //Subject 2 Input from user
        int Subject2 = sc.nextInt();
        //Marks of all subject 3
        System.out.println("Enter Subject 3(Total Marks=100)");
        //Subject 3 Input from user
        int Subject3 = sc.nextInt();
        //Marks of all subject 4
        System.out.println("Enter Subject 4(Total Marks=100)");
        //Subject 4 Input from user
        int Subject4 = sc.nextInt();
        //Marks of all subject 5
        System.out.println("Enter Subject 5(Total Marks=100)");
        //Subject 5 Input from user
        int Subject5 = sc.nextInt();
        //Marks of all subject 6
        System.out.println("Enter Subject 6(Total Marks=100)");
        //Subject 6 Input from user
        int Subject6 = sc.nextInt();
        //Marks of all subject 7
        System.out.println("Enter Subject 7(Total Marks=100)");
        //Subject 7 Input from user
        int Subject7 = sc.nextInt();
        //Marks of all subject 8
        System.out.println("Enter Subject 8(Total Marks=100)");
        //Subject 8 Input from user
        int Subject8 = sc.nextInt();
        //Marks of all subject 9
        System.out.println("Enter Subject 9(Total Marks=100)");
        //Subject 9 Input from user
        int Subject9 = sc.nextInt();
        //Marks of all subject 10
        System.out.println("Enter Subject 10(Total Marks=100)");
        //Subject 10 Input from user
        int Subject10 = sc.nextInt();

        // variables for totaling all marks
        int TotalMarks =Subject1+Subject2+Subject3+Subject4+Subject5+Subject6
                                        +Subject7+Subject8+Subject9+Subject10;

        // Declaring Total Marks
        System.out.println("TotalMarks:"+TotalMarks);

        //Formula for taking out percentage(%) in Java
        System.out.println("Percentage:"+TotalMarks*100/1000+"%");
    }
}