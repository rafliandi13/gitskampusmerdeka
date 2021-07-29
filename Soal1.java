
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
public class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Nilai Bilangan : ");
        int input = scan.nextInt();
        if (input % 3 == 0 ) {
            if (input % 3 == 0 && input % 5 ==0) {
                System.out.println("Hello World");
            }else{
                System.out.println("Hello");
            }
        }else if (input % 5 == 0) {
           if (input % 3 == 0 && input % 5 ==0) {
                System.out.println("Hello World");
            }else{
                System.out.println("World");
            }
        }
    }
}
