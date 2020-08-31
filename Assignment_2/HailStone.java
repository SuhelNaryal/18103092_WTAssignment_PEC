/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


/**
 *
 * @author Suhel Naryal
 */
public class HailStone {
    
    public Integer[] hailstone(int n){
        if(n <= 0)
            throw new IllegalArgumentException("n should be a positive integer");
        
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 1){
            list.add(n);
            n = (n%2 == 0)? n/2: n*3+1;
        }
        list.add(1);
        return list.toArray(new Integer[list.size()]);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Programe to print Hailstone Sequence");
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Hailstone sequence for " + n +": ");
        System.out.println(Arrays.toString((new HailStone()).hailstone(n)));
    }
    
}
