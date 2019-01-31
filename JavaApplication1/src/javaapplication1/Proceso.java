/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class Proceso implements Runnable{
    Thread t;
    String nombre; 
    String estado;
    public Proceso(String nombre){
        this.nombre = nombre;
        t = new Thread();
        this.estado = t.getState().name();
       
        /*try {
            
            ///t.sleep(700);    
            run();
            /*
            System.out.println("estado 2 "+t.getName()+ ' '+t.getState());
            
                System.out.println("estado 3 "+t.getName()+ ' '+t.getState());
              */
            
       /* } catch (InterruptedException ex) {
            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);   
        }*/
       //run();
        
    }

    
    
    @Override
    public void run(){
         //t.start();
         System.out.println("2do estado "+t.getState());
       
       /*     System.out.println(nombre+" - "+t.getState());
            System.out.println("estado"+this.estado);
        */
    }
    
}

