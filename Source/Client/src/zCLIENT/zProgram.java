/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zCLIENT;

/**
 *
 * @author Nhom 1142014_1142066
 */
public class zProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new Thread(new ClientGUI()).start();
    }
}
