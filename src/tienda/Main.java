/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;
import java.util.Scanner;
/**
 * Programa que permite la venta de cuatro productos, papas margarita, chocorramo, galletas, chitos, permite al Administrador del sistemas añadir la cantidad que desea a los productos-
 * @version 1.8.0_161,  27 de febrero del 2018
 * @author Johan Zambrano
 */
public class Main {
    /** 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //le va asignar la cantidad y el valor por unidad de cada uno de los productos
    int cantMargarita=20, valorMargarita=2000; 
    int cantGalletas=10, valorGalletas=1000;
    int cantChitos=10, valorChitos=2000;
    int cantChocorramo=20, valorChocorramo=1500;
    int cantPonque=12, valorPonque=1200;
    int cantChocolatina=0, valorChocolatina=500;
    //variable utilizada para contar el total de la cantidad de todos los productos
    int cantTotal=cantMargarita+cantGalletas+cantChitos+cantChocorramo+cantPonque+cantChocolatina;
    //variable utilizada para sacar el total del valor de los productos
    double valorTotal=valorMargarita+valorGalletas+valorChitos+valorChocorramo+valorPonque+valorChocolatina;
    //son acumuladores, para ir acumulando las ventas que haga el usuario, y la cantidad de ganancias
    int cantVentas=0, cantGanancias=0;
    //son contadores para ir contando cuantas se vendieron de cada producto
    int ventasMargarita=0,ventasGalletas=0,ventasChitos=0,ventasChocorramo=0,ventasPonque=0,ventasChocolatina=0;
    int producto=0;
    Scanner a=new Scanner(System.in);
    int desea,pro,deseam;
        do{
            do{
                System.out.println("\tTIENDA");
                System.out.println("Seleccione la opcion que desea:\n1-Administrador\n2-Cliente\n3-salir");
                deseam=a.nextInt();
                if(deseam<1 || deseam>3){
                    System.out.println("ERROR\n");
                }
            }while(deseam<1 || deseam>3);
            switch(deseam){
                case 1:
                    do{
                        System.out.println("BIENVENIDO ADMINISTRADOR");
                        System.out.println("1-Administrar inventario.\n2-Visualizar la cantidad de ventas.\n3-Visualizar las ganancias.\n4-Porcentaje de ventas.\n5-Porcentaje de ganancias.\n6-Volver");
                        desea=a.nextInt();
                        if(desea>6 || desea<1){
                            System.out.println("Error\n");
                        }
                    }while(desea>6 || desea<1);
                    switch(desea){
                    case 1: 
                            System.out.println("\tADMINISTRAR INVENTARIO\n");
                            do{
                                System.out.println("Seleccione el producto al que le desea añadir");
                                System.out.println("1-Margarita\n2-Galletas\n3-Chitos\n4-Chocorramo\n5-Ponque\n6-Chocorramo\n7-Volver");
                                pro=a.nextInt();
                                if(pro>7 || pro<1){
                                   System.out.println("Error\n");
                                }
                            }while(pro>7 || pro<1);
                            Inventario obj1=new Inventario(); //creacion del obj1 de la clase inventario
                            int añadir; //variable utilizada para asigarle el valor que retorne el objeto
                            if(pro==1){ //si la variable pro tiene el valor 1 es porque el usuario escogio el producto margarita
                                producto=cantMargarita; //iguala la cantidad de productos Margarita para enviarla con la funcion
                                añadir=obj1.Inventario(producto); //envia la variable producto con el respectivo valor y lo que retorna lo asigna a la variable añadir 
                                cantMargarita=añadir+cantMargarita; //le aumenta el valor de la variable añadir a la cantidad del producto                                
                            }else{
                                if(pro==2){
                                    producto=cantGalletas;//iguala la cantidad de productos Galletas para enviarla con la funcion
                                    añadir=obj1.Inventario(producto); //envia la variable producto con el respectivo valor y lo que retorna lo asigna a la variable añadir 
                                    cantGalletas=añadir+cantGalletas; //le aumenta el valor de la variable añadir a la cantidad del producto
                                }else{
                                    if(pro==3){
                                        producto=cantChitos; //iguala la cantidad de productos Chitos para enviarla con la funcion
                                        añadir=obj1.Inventario(producto);//envia la variable producto con el respectivo valor y lo que retorna lo asigna a la variable añadir 
                                        cantChitos=añadir+cantChitos; //le aumenta el valor de la variable añadir a la cantidad del producto
                                    }else{
                                        if(pro==4){
                                            producto=cantChocorramo; //iguala la cantidad de productos Chocorramo para enviarla con la funcion
                                            añadir=obj1.Inventario(producto);//envia la variable producto con el respectivo valor y lo que retorna lo asigna a la variable añadir 
                                            cantChocorramo=añadir+cantChocorramo; //le aumenta el valor de la variable añadir a la cantidad del producto
                                        }else{
                                            if(pro==5){
                                                producto=cantPonque; //iguala la cantidad de productos Ponque para enviarla con la funcion
                                                añadir=obj1.Inventario(producto);//envia la variable producto con el respectivo valor y lo que retorna lo asigna a la variable añadir 
                                                cantPonque=añadir+cantPonque; //le aumenta el valor de la variable añadir a la cantidad del producto
                                            }else{
                                                if(pro==6){
                                                    producto=cantChocolatina; //iguala la cantidad de productos Chocolatina para enviarla con la funcion
                                                    añadir=obj1.Inventario(producto);//envia la variable producto con el respectivo valor y lo que retorna lo asigna a la variable añadir 
                                                    cantChocolatina=añadir+cantChocolatina; //le aumenta el valor de la variable añadir a la cantidad del producto
                                                }
                                            }
                                        }
                                    }
                                }
                            }        
                    break;
                    case 2: //ventas actuales
                        System.out.println("El total de las ventas actuales son: "+cantVentas+"\n");
                        System.out.println("1-Margarita: "+ventasMargarita);
                        System.out.println("2-Galletas: "+ventasGalletas);
                        System.out.println("3-Chitos: "+ventasChitos);
                        System.out.println("4-Chocorramo: "+ventasChocorramo);
                        System.out.println("5-Ponque: "+ventasPonque);
                        System.out.println("6-Chitos: "+ventasChocolatina);
                    break;
                    case 3: //total de ganancias
                        System.out.println("El total de ganancias son: "+cantGanancias);
                    break;    
                    case 4: //porcentaje de ventas
                        double porcentaje;
                        porcentajeVentas obj2=new porcentajeVentas();
                        porcentaje=obj2.porcentajeVentas(valorTotal,cantVentas);
                        System.out.println("El porcentaje de ventas es: "+porcentaje+" %\n");
                    break;
                    case 5:
                        porcentajeGanancias obj3=new porcentajeGanancias();
                        porcentaje=obj3.porcentajeGanancias(cantTotal,cantGanancias);
                        System.out.println("El porcentaje de ganancias es: "+porcentaje+" %\n");
                    break;    
                }
            break;       
            case 2:
                System.out.println("BIENVENIDO CLIENTE");
                do{
                    do{
                    System.out.println("Los productos de la tienda son:\n");
                    System.out.println("1-Margarita  $"+valorMargarita+"\n2-Galletas  $"+valorGalletas+"\n3-Chitos  $"+valorChitos+"\n4-Chocorramo   $"+valorChocorramo+"\n5-Ponque   $"+valorPonque+"\n6-Chocolatina   $"+valorChocolatina+"\n7- Salir sin comprar nada");
                    System.out.println("Elija el producto que desea comprar");
                    desea=a.nextInt();
                    }while(desea>7 || desea<1);
                    if((desea==1 && cantMargarita==0) || (desea==2 && cantGalletas==0) || (desea==3 && cantChitos==0)|| (desea==4 && cantChocorramo==0) || (desea==5 && cantPonque==0) || (desea==6 && cantChocolatina==0)){//verifica que la opcion que ingreso tenga disponible el prodcuto para comprar
                        System.out.println("El producto que acaba de seleccionar se encuentra agotado, por favor seleccione otra opcion.");
                    }
                }while((desea==1 && cantMargarita==0) || (desea==2 && cantGalletas==0) || (desea==3 && cantChitos==0)|| (desea==4 && cantChocorramo==0) || (desea==5 && cantPonque==0) || (desea==6 && cantChocolatina==0));//verifica que la opcion que ingreso tenga disponible el prodcuto para comprar
                if(desea==1){//si ingreso 1 es porque selecciono el prodcuto margarita
                    cantMargarita=cantMargarita-1; //disminuye de a 1 la cantidad disponible del producto
                    cantVentas=cantVentas+1; //aumenta de a 1 la cantidad de ventas
                    cantGanancias=cantGanancias+valorMargarita; //cantGanancias es un acumulador, le asigna el valor de Margarita ya que el cliente acaba de comprar el producto
                    ventasMargarita=ventasMargarita+1; //Es un contador, cuenta cuantas veces compro el mismo producto
                    System.out.println("Compra exitosa");
                }else{
                    if(desea==2){//si ingreso 1 es porque selecciono el prodcuto Galletas
                        cantVentas=cantVentas+1; //aumenta de a 1 la cantidad de ventas
                        cantGalletas=cantGalletas-1; //disminuye de a 1 la cantidad disponible del producto
                        cantGanancias=cantGanancias+valorGalletas;//cantGanancias es un acumulador, le asigna el valor de Galletas ya que el cliente acaba de comprar el producto
                        ventasGalletas=ventasGalletas+1; //Es un contador, cuenta cuantas veces compro el mismo producto
                        System.out.println("Compra exitosa");
                    }else{
                        if(desea==3){ //si ingreso 1 es porque selecciono el prodcuto Chitos
                            cantChitos=cantChitos-1; //disminuye de a 1 la cantidad disponible del producto
                            cantGanancias=cantGanancias+valorChitos;//cantGanancias es un acumulador, le asigna el valor de Chitos ya que el cliente acaba de comprar el producto
                            cantVentas=cantVentas+1;//aumenta de a 1 la cantidad de ventas
                            ventasChitos=ventasChitos+1;//Es un contador, cuenta cuantas veces compro el mismo producto
                            System.out.println("Compra exitosa");
                        }else{
                            if(desea==4){//si ingreso 1 es porque selecciono el prodcuto Chocorramo
                                cantVentas=cantVentas+1;//aumenta de a 1 la cantidad de ventas
                                cantChocorramo=cantChocorramo-1; //disminuye de a 1 la cantidad disponible del producto
                                cantGanancias=cantGanancias+valorChocorramo;//cantGanancias es un acumulador, le asigna el valor de Chocorramo ya que el cliente acaba de comprar el producto
                                ventasChocorramo=ventasChocorramo+1;//Es un contador, cuenta cuantas veces compro el mismo producto
                                System.out.println("Compra exitosa");
                            }else{
                                if(desea==5){//si ingreso 1 es porque selecciono el prodcuto ponque
                                    cantVentas=cantVentas+1;//aumenta de a 1 la cantidad de ventas 
                                    cantPonque=cantPonque-1; //disminuye de a 1 la cantidad disponible del producto
                                    cantGanancias=cantGanancias+valorPonque;//cantGanancias es un acumulador, le asigna el valor de Ponque ya que el cliente acaba de comprar el producto
                                    ventasPonque=ventasPonque+1;//Es un contador, cuenta cuantas veces compro el mismo producto
                                    System.out.println("Compra exitosa");
                                }else{
                                    if(desea==6){//si ingreso 1 es porque selecciono el prodcuto chocolatina
                                        cantVentas=cantVentas+1;//aumenta de a 1 la cantidad de ventas
                                        cantChocolatina=cantChocolatina-1; //disminuye de a 1 la cantidad disponible del producto
                                        cantGanancias=cantGanancias+valorChocolatina; //cantGanancias es un acumulador, le asigna el valor de Chocolatina ya que el cliente acaba de comprar el producto
                                        ventasChocolatina=ventasChocolatina+1;//Es un contador, cuenta cuantas veces compro el mismo producto
                                        System.out.println("Compra exitosa");
                                    }
                                }
                            }
                        }
                    }
                }         
            break;    
            
        }
    }while(deseam!=3);   //todo el programa se va a repetir hasta que la opcion que ingreso en el menu principal sea igual a 3
}
}