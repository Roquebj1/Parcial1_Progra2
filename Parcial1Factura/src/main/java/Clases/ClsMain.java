/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ClsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner e = new Scanner(System.in);
        String nombree = "";
        
        ClsFactura complemento = new ClsFactura();
        ClsDatos datos = new ClsDatos();
        

        System.out.println("DESCRIPCIÓN DE FACTURA");
        System.out.println("");
        
        datos.NomProducto = "Cemento U.G.C ";
        datos.NumUnidad = 30;
        datos.PrecioUnitario = 80;
        datos.Kg = 45;
        complemento.AggVendedor(datos);
        
        
        
         datos.NomProducto = "Block 14X25";
        datos.NumUnidad = 100;
        datos.PrecioUnitario = 2;
        datos.Kg = 25;
        complemento.AggVendedor(datos);
        
         datos.NomProducto = "Piedrín";
        datos.NumUnidad = 4;
        datos.PrecioUnitario = 190;
        datos.Kg = 10;
        complemento.AggVendedor(datos);
       
         datos.NomProducto = "Arena de Río";
        datos.NumUnidad = 7;
        datos.PrecioUnitario = 102;
        datos.Kg = 15;
        complemento.AggVendedor(datos);
        
        
               

        complemento.operaciones(datos);
        complemento.imprimirDecorado();

    
        
        
        
        
        
    }
    
    
}
