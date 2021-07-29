
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
public class Soal4 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String reverse = "";
        System.out.println("Masukan Kata : ");
        String input = scan.nextLine();
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        System.out.println("Hasil Reverse : ");
        System.out.println(reverse);
       
        
    }
}
