/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bruno
 */
public class SingletonLazyHolder {
    private static final SingletonLazyHolder instancia = new SingletonLazyHolder();
    
    private SingletonLazyHolder(){
        super();
    }
    
    public static SingletonLazyHolder getInstancia(){
        return InstanciaHolder.instancia;
    }
}
