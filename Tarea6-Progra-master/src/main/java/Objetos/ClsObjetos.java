/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import java.text.NumberFormat;
import java.util.*;

/**
 *
 * @author andrilucero
 */
public class ClsObjetos {
    Scanner teclado = new Scanner(System.in);
    public static NumberFormat formatoCantidad = NumberFormat.getCurrencyInstance(new Locale("es","GT"));
    List<ClsModeloDatos> lista = new ArrayList<>();
    
    
    public ClsModeloDatos IngresoInformacion (){
        
        ClsModeloDatos Dato = new ClsModeloDatos();
        Dato.setVenero(Math.random()*999+1);
        Dato.setVfebrero(Math.random()*999+1);
        Dato.setVmarzo(Math.random()*999+1);
        
        System.out.println("Ingrese el nombre del vendedor:");
        Dato.setNombre(teclado.nextLine());
       
        
        System.out.println("El numero random para ti del mes de Enero es: " + Dato.getVenero());   
                
        System.out.println("El numero random para ti del mes de Febrero es: " + Dato.getVfebrero());
        
        System.out.println("El numero random para ti del mes de Marzo es: " + Dato.getVmarzo());
        
        lista.add(Dato);
        return Dato;
    }
     
    public static String Formato(double cantidad){
        return formatoCantidad.format(cantidad);
    }
    
    public void DesplegarInfo(){
        
        for(ClsModeloDatos elementos: lista){
            System.out.println("NOMBRE:      " + "  ENERO:    " + "  FEBRERO:    "+ "  MARZO:    ");
            System.out.println(elementos.getNombre() + "   ||    " + " " + Formato(elementos.getVenero()) +"   ||  "+ Formato(elementos.getVfebrero()) +" ||    "+ Formato(elementos.getVmarzo()));
        }
    }
   
    public void Sumar(){
        
        double totalEnero = 0;
       double totalFebrero = 0;
       double totalMarzo = 0;
       
       for( ClsModeloDatos elementos: lista){
           totalEnero += elementos.getVenero();
           totalFebrero += elementos.getVfebrero();
           totalMarzo += elementos.getVmarzo();
       }
       double GranTotal = totalEnero+totalFebrero+totalMarzo;
        System.out.println("Venta Total hasta la fecha: "+ "Q" + GranTotal);
        System.out.println("Venta total de Enero: " + "Q" +totalEnero);
        System.out.println("Venta total de Febrero: " + "Q" +totalFebrero);
        System.out.println("Venta total de Marzo: " + "Q"+totalMarzo);
      
    }
 
    public void SumaTotal(){
         for(ClsModeloDatos CT : lista){  
        
        CT.setTotal(CT.Venero + CT.Vfebrero + CT.Vmarzo);
        }
    }
   
    public void Menu(){
         Scanner t = new Scanner(System.in);
            String opc =" ";
            
            do{
            System.out.println("1- Ingresar Informacion");
            System.out.println("2- Mostrar toda la Informacion");
            System.out.println("3- Total por cada mes");
            System.out.println("4- Salir del Programa");
            opc = t.nextLine();
            
            switch(opc){
                case"1": IngresoInformacion();
                break;
                case"2": DesplegarInfo();
                break;
                case"3": Sumar();
                break;
                case"4": System.out.println("Adios, toma awita!");
                break;
                
                
            }
        }while(!opc.equals("4"));
            
    }
}
