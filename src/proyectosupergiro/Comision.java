/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupergiro;

/**
 *
 * @author SENA
 */
public class Comision {
    private static double dosPorciento;
    private static double cuatroPorciento;
    private static double seisPorciento;
    private static double ochoPorciento;
    
    public static double Dosporciento(double Monto){
        return (Monto*2)/100;
    }
    public static double Cuatroporciento(double Monto){
        return (Monto*4)/100;
    }
    public static double Seisporciento(double Monto){
        return (Monto*6)/100;
    }
    public static double Ochoporciento(double Monto){
        return (Monto*8)/100;
    }
}
