/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author ANDROID 1
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
    
        int a;
       
        System.out.println("Nhap vao thang ");
        a=input.nextInt();
        int s;
        System.out.println("nhap vao nam ");
        s=input.nextInt();
        switch(a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 ngay");
                break;
            case 2:
                if(((s%4==0)&&!(s%100==0)||s%400==0)){
                    System.out.println("29 ngay");
                }
                else{
            System.out.println("28 ngay");}
                break;
            case 4: case 6:
            case 9:case 11:
                System.out.println("30 ngay");
                break;
             default:;
                
        }
    }
}
