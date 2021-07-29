
import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Soal3 {
     static void printJam24(String str)
{
    int h1 = (int)str.charAt(1) - '0';
    int h2 = (int)str.charAt(0) - '0';
    int hh = (h2 * 10 + h1 % 10);
 
    if (str.charAt(8) == 'A')
    {
        if (hh == 12)
        {
            System.out.print("00");
            for (int i = 2; i <= 4; i++)
                System.out.print(str.charAt(i));
        }
        else
        {
            for (int i = 0; i <= 4; i++)
                System.out.print(str.charAt(i));
        }
    }
 

    else
    {
        if (hh == 12)
        {
            System.out.print("12");
            for (int i = 2; i <= 4; i++)
                System.out.print(str.charAt(i));
        }
        else
        {
            hh = hh + 12;
            System.out.print(hh);
            for (int i = 2; i <= 4; i++)
                System.out.print(str.charAt(i));
        }
    }
}
 
public static void main (String[] args)
{
    String str = "12:00:00PM";
    printJam24(str);
}
}
