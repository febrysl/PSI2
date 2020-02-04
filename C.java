/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fslt10a;

/**
 *
 * @author USER
 */
public class C implements A {  

    public C(){
            }
    public void displayConstants (){
        System.out.println("INTERFACE_CONSTANT : " + A.INTERFACE_CONSTANT);
        B baru = new B();//create object, cara eksekusinya obj.namamethod
        System.out.println("CLASS_CONSTANT : " + baru.CLASS_CONSTANT);
        }
    
}
