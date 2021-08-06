/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.text.DecimalFormat;

/**
 *
 * @author HP
 */
public class ClsFactura {
    public static final int MaxY = 5;
    public static final int MaxX = 8;
    private int totalFilas = 0;
    
    private static String [][] complemento = new String  [5][8]; //nombre de la matriz asignada
     private static  double  [][] arraynum1 = new double[5][8];
     private static double  [][] arraynum2 = new double[5][8];
     private static double  [][] arraynum3 = new double[5][8];
     private static double  [][] controlar = new double[5][8];
    
    private static final int NumUnidad =1;
    private static final int NomProducto =0;
    private static final int PrecioUnitario =2;
    private static final int Kg =3;
    private static final int ValorFactura =2;
    private static final int GastoValor =3;
    private static final int GastoPrecio =4;
    private static final int CostoPorUnidad =5;
    private static final int CostoTotal =6;
    private int filaActual = 0;
    
    private static DecimalFormat f = new DecimalFormat("0.00");
    
    
   
    public double Suma = 0;
    public double [] centinela1 = new double [9];
    public double [] centinela2 = new double [9];

    
    
    
  
    
     public void AggVendedor (ClsDatos Datos){
        
            complemento[4][0]="GRAN TOTAL";
           for (int i = 1; i <8; i ++){
              complemento [4][i] = "";
           }
            
            complemento[filaActual][NomProducto] = Datos.NomProducto; 
            complemento[filaActual][NumUnidad] = Datos.NumUnidad+"";
            complemento[filaActual][PrecioUnitario] =  Datos.PrecioUnitario+"";
            complemento[filaActual][Kg] =  ClsDatos.Kg+"";
        filaActual++;
        
        
      
        
  
    }
     
         public void operaciones (ClsDatos Datos){
        

        double  paso1,x1,x2,x3,x4,x11,x22,x33,x44,paso5,paso81,paso82,paso83,paso84,fin1,fin2,fin3,fin4,fin5;
        
       
    for(int columna=1;columna<complemento.length;columna++)
    {    paso1 = 0;  x1 = 0; x2 = 0; x3 = 0; x4 = 0; paso5 = 0; paso81 = 0; paso82 = 0; paso83 = 0; paso84 = 0; x11 = 0; x22 = 0; x33 = 0; x44 = 0; fin1 = 0; fin2 = 0; fin3 = 0; fin4 = 0; fin5 = 0;
        for(int fila=0;fila<complemento.length-1;fila++)
        {
            
            double gastoalvalor = 8700;
            double gastoalpeso = 7500;
              arraynum1[fila][columna]=Double.valueOf(complemento[fila][1]);   
              arraynum2[fila][columna]=Double.valueOf(complemento[fila][2]); 
              paso1 += arraynum1[fila][columna] * arraynum2[fila][columna]; 
              
            
              
              arraynum1[fila][columna] = Double.valueOf(complemento[0][2]);
              x1 = arraynum1[fila][columna] * (gastoalvalor / paso1);
              complemento[0][4] = f.format(x1)+"";
              
              arraynum1[fila][columna] = Double.valueOf(complemento[1][2]);
              x2 = arraynum1[fila][columna] * (gastoalvalor / paso1);
               complemento[1][4] = f.format(x2)+"";
              
              arraynum1[fila][columna] = Double.valueOf(complemento[2][2]);
              x3 = arraynum1[fila][columna] * (gastoalvalor / paso1);
               complemento[2][4] = f.format(x3)+"";
              
              arraynum1[fila][columna] = Double.valueOf(complemento[3][2]);
              x4 = arraynum1[fila][columna] * (gastoalvalor / paso1);
               complemento[3][4] = f.format(x4)+"";
               
               arraynum1[fila][columna]=Double.valueOf(complemento[fila][1]);   
              arraynum2[fila][columna]=Double.valueOf(complemento[fila][3]); 
              paso5 += arraynum1[fila][columna] * arraynum2[fila][columna]; 
              
              
              
              
              arraynum1[fila][columna] = Double.valueOf(complemento[0][3]);
              x11 = arraynum1[fila][columna] * (gastoalpeso / paso5);
              complemento[0][5] = f.format(x11)+"";
              
              arraynum1[fila][columna] = Double.valueOf(complemento[1][3]);
              x22 = arraynum1[fila][columna] * (gastoalpeso / paso5);
               complemento[1][5] = f.format(x22)+"";
              
              arraynum1[fila][columna] = Double.valueOf(complemento[2][3]);
              x33 = arraynum1[fila][columna] * (gastoalpeso / paso5);
               complemento[2][5] = f.format(x33)+"";
              
              arraynum1[fila][columna] = Double.valueOf(complemento[3][3]);
              x44 = arraynum1[fila][columna] * (gastoalpeso / paso5);
               complemento[3][5] = f.format(x44)+"";
               
               
                arraynum1[fila][columna]=Double.valueOf(complemento[0][2]);
              paso81 = x1 + x11 + arraynum1[fila][columna];
              complemento[0][6] = f.format(paso81)+"";
              
              arraynum1[fila][columna]=Double.valueOf(complemento[1][2]);
              paso82 = x2 + x22 + arraynum1[fila][columna];
              complemento[1][6] = f.format(paso82)+"";
              
              arraynum1[fila][columna]=Double.valueOf(complemento[2][2]);
              paso83 = x3 + x33 + arraynum1[fila][columna];
              complemento[2][6] = f.format(paso83)+"";
              
              arraynum1[fila][columna]=Double.valueOf(complemento[3][2]);
              paso84 = x4 + x44 + arraynum1[fila][columna];
              complemento[3][6] = f.format(paso84)+"";
              
              
              
              arraynum1[fila][columna]=Double.valueOf(complemento[0][1]);
              fin1 = arraynum1[fila][columna] * paso81;
              complemento[0][7] = "Q"+f.format(fin1)+""; 
              
              arraynum1[fila][columna]=Double.valueOf(complemento[1][1]);
              fin2 = arraynum1[fila][columna] * paso82;
              complemento[1][7] = "Q"+f.format(fin2)+"";
              
              arraynum1[fila][columna]=Double.valueOf(complemento[2][1]);
              fin3 = arraynum1[fila][columna] * paso83;
              complemento[2][7] = "Q"+f.format(fin3)+"";
              
              arraynum1[fila][columna]=Double.valueOf(complemento[3][1]);
              fin4 = arraynum1[fila][columna] * paso84;
              complemento[3][7] = "Q"+f.format(fin4)+"";
              
        
              fin5 = fin1 + fin2 + fin3 +fin4;
              complemento[4][7] = "Q"+f.format(fin5)+"";
   
        }   
        
        
        
    }
}
        
       
       
    
    

     

      public  void imprimirDecorado(){
       
       for (int x = 0; x < complemento.length; x++) {
            System.out.print("*");
            for (int y = 0; y < complemento[x].length; y++) {
                System.out.print(complemento[x][y]);
                if (y != complemento[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
   }
   
    
        public double SumaX(int colum){
            
        double total = 0.0;
        for(int y = 0; y <filaActual; y ++){
            String col = complemento[y][colum];
            total = total + Double.valueOf(col);
        }
        centinela1[colum] = total;


        return colum;
    }
}
