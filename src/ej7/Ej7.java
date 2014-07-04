/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej7;

import javax.swing.JOptionPane;

/**
 *
 * @author V1C70R MU3N735
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int convertidor;
        char x;
        String a="";
        String Cadena, temp;
        Cadena=JOptionPane.showInputDialog("Ingrese Frase");
        int dimension = Cadena.length();    
        char [] frase= Cadena.toCharArray();    
        for (int i = 0; i < dimension; i++)
        {
            if (Cadena.codePointAt(i)>=65 && Cadena.codePointAt(i)<=90)
            {
                convertidor = Cadena.codePointAt(i);
                convertidor =convertidor+32;
                x=(char)convertidor; 
                a=a+x;                    
            }
            else                  
            {
                a=a+frase[i];                    
            }          
        }
        System.out.println(a);
    }
    }
    
