/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;

/**
 *
 * @author hilalkhan
 */
public class Assignment01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num =100;  //this will determine what the last number will be.
        for (int i = 0; i <= num; i++){ //this for loop will go from 0 to num which is 100.
            if (i % 2 ==0){ //the i %2 ==0 will only print the even
                System.out.println(i + " "); // this is where the program will be printed and the println will make a new line.
            }
        }
    }
    
}
