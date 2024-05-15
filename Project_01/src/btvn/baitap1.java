/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn;

/**
 *
 * @author minhk
 */
public class baitap1 {
    static boolean soNguyenTo(int num1){
        if(num1<=1){
            return false;
        }
        for (int i=2;i<= Math.sqrt(num1);i++){
            if(num1 % i==0){
                return false;
            }
        }
        return true;
    }
    static boolean soLe(int num2){
        return num2 % 2!=0;
    }
    public static void main(String[] args) {
        boolean a= soNguyenTo(23);
        boolean b=soLe(13);
        System.out.println("a so nguyen to: "+a);
        System.out.println("b so le: "+b);
    }
    
}
