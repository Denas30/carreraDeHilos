/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import javax.swing.JLabel;


public class Animal extends Thread {
    String nombre;
    int meta;
    JLabel label;

    public Animal(String nombre, int meta, JLabel label) {
        this.nombre = nombre;
        this.meta = meta;
        this.label = label;
    }
@Override
    public void run(){
     for (int i = 0; i < meta; i++) {
       try{
           System.out.println(this.nombre + "corriendo.");
           label.setLocation(i,0);
           Thread.sleep(150);
       }catch(InterruptedException ex){
           System.out.println("La excepcion es:" + ex);
       }  
     }
     System.out.println(nombre +"llego a la meta.");
     yield();
 }   

}
