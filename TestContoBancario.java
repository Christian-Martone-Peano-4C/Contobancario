/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

/**
 *
 * @author martone.christian
 */
public class TestContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoBancario c1 = new ContoBancarioEsteso("cms");
         ContoBancario c2 = new ContoBancarioEsteso("kfc",6000);
          ContoBancario c3 = new ContoBancarioEsteso("bbs",1000);
        c2.deposito(1000);
        c2.prelievo(2000);
        System.out.println(c2);
    }
    
    
}
