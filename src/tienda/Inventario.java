/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;
import java.util.Scanner;
/**
 * Solicita la cantidad que se le va añadir al producto, y retorna 
 * @version 1.8.0_161,  27 de febrero del 2018
 * @author Johan Zambrano
 */
public class Inventario {
    int Inventario(int a){
        Scanner e=new Scanner(System.in);
        int añadir=0;
        System.out.println("La cantidad del producto es: "+a);
        do{
            System.out.println("ingrese la cantidad que desea añadir");
            añadir=e.nextInt();
            if(añadir<0){
                System.out.println("ERROR");
            }
        }while(añadir<0);
        a=a+añadir;
        System.out.println("La cantidad actual del producto es: "+a);
        return añadir;
    }
}