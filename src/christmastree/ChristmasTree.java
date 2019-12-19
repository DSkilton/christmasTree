/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmastree;

import java.util.Scanner;

/**
 *
 * @author MC03353
 */
public class ChristmasTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        christmasTree();
    }
    
    public static void christmasTree() {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("How big do you want your tree?: ");
        
        size = sc.nextInt();
        
        for (int i = 0; i < size; i++) { //rows
            for (int j = 0; j < size - i; j++) 
                System.out.print(" "); //spaces between asterix
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*"); //prints asterix
                System.out.println();
        }
    }
}
