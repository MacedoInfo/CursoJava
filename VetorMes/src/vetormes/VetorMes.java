/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetormes;

/**
 *
 * @author Macedo
 */
public class VetorMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[]={"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago",
            "Set","Out","Nov","Dez"};
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
                for (int c = 0; c<mes.length;c++){
                    System.out.println(mes[c] +" "+ dias[c]);
                }
                }
    
}
