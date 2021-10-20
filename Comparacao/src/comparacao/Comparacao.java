/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacao;

/**
 *
 * @author Macedo
 */
public class Comparacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo", nome2 = "Gustavo",resultado = "", 
               nome3 = new String ("Gustavo");
        
        resultado = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(resultado);
        
        
    }
   
}
