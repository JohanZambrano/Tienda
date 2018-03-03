/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 * calcula el porcentaje de ventas, le envia dos variables, la primera es el total de ganancias y la segunda es la cantidad de ganancias que tuvo
 * @version 1.8.0_161,  27 de febrero del 2018
 * @author Johan Zambrano
 */
public class porcentajeGanancias {
    double porcentajeGanancias(double a,double b){
        double porcentaje;
        porcentaje=b/a;
        return porcentaje;
    }   
}
