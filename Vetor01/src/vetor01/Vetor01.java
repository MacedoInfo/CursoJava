/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Macedo
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {9,2,3,4,5,10,30};
        System.out.println("Total de casas de N é " + n.length);
        for (int c=0; c<=n.length - 1;c++){
            System.out.println(n[c]);
        }
    }
    
}
