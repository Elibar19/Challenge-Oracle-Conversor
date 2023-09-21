/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alura.conversordemonedas.ConversorService;

import javax.swing.JOptionPane;

/**
 *
 * @author Elián
 */
public class ConversorService {
    
    public void elegirMoneda(double cantidad){
        String opcion = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero", 
                "Monedas", 
                JOptionPane.PLAIN_MESSAGE, null, 
                new Object[]{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano",
                    "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, "Seleccion")).toString();
        
        switch(opcion){
            case "De Pesos a Dólar":
                pesosToDolar(cantidad);
                break;
            case "De Pesos a Euro":
                pesosToEuro(cantidad);
                break;
            case "De Pesos a Libras":
                pesosToLibra(cantidad);
                break;
            case "De Pesos a Yen": 
                pesosToYen(cantidad);
                break;
            case "De Pesos a Won Coreano":
                pesosToWon(cantidad);
                break;
            case "De Dólar a Pesos":
                dolarToPesos(cantidad);
                break;
            case "De Euro a Pesos":
                euroToPesos(cantidad);
                break;
            case "De Libras a Pesos":
                libraToPesos(cantidad);
                break;
            case "De Yen a Pesos":
                yenToPesos(cantidad);
                break;
            case "De Won Coreano a Pesos":
                wonToPesos(cantidad);
                break;
        }        
    }

    public void pesosToDolar(double cantidad) {
        double valorConversion = cantidad / 740;
        valorConversion = (double) Math.round(valorConversion *100d)/100;
        JOptionPane.showMessageDialog(null, "$"+cantidad+" ARS equivale a $"+valorConversion+" dólares.");
    }
    
    public void pesosToEuro(double cantidad) {
        double valorConversion = cantidad / 373.32;
        valorConversion = (double) Math.round(valorConversion *100d)/100;
        JOptionPane.showMessageDialog(null, "$"+cantidad+" ARS equivale a $"+valorConversion+" dólares.");
    }
    
    public void pesosToLibra(double cantidad) {
        double valorConversion = cantidad / 430.47;
        valorConversion = (double) Math.round(valorConversion *100d)/100;
        JOptionPane.showMessageDialog(null, "$"+cantidad+" ARS equivale a $"+valorConversion+" dólares.");
    }
    
    public void pesosToYen(double cantidad) {
        double valorConversion = cantidad / 2.37;
        valorConversion = (double) Math.round(valorConversion *100d)/100;
        JOptionPane.showMessageDialog(null, "$"+cantidad+" ARS equivale a $"+valorConversion+" dólares.");
    }
    
    public void pesosToWon(double cantidad) {
        double valorConversion = cantidad / 0.26;
        valorConversion = (double) Math.round(valorConversion *100d)/100;
        JOptionPane.showMessageDialog(null, "$"+cantidad+" ARS equivale a $"+valorConversion+" dólares.");
    }
    
    public void dolarToPesos(double cantidad) {
        double valorConversion = cantidad * 740;
        valorConversion = (double) Math.round(valorConversion *100d)/100;
        JOptionPane.showMessageDialog(null, "$"+cantidad+" ARS equivale a $"+valorConversion+" dólares.");
    }
    
    public void euroToPesos(double cantidad) {
        double valorConversion = cantidad * 373.32;
        valorConversion = (double) Math.round(valorConversion *100d)/100;
        JOptionPane.showMessageDialog(null, "$"+cantidad+" ARS equivale a $"+valorConversion+" dólares.");
    }
    
    public void libraToPesos(double cantidad) {
        double valorConversion = cantidad * 430.47;
        valorConversion = (double) Math.round(valorConversion *100d)/100;
        JOptionPane.showMessageDialog(null, "$"+cantidad+" ARS equivale a $"+valorConversion+" dólares.");
    }
    
    public void yenToPesos(double cantidad) {
        double valorConversion = cantidad * 2.37;
        valorConversion = (double) Math.round(valorConversion *100d)/100;
        JOptionPane.showMessageDialog(null, "$"+cantidad+" ARS equivale a $"+valorConversion+" dólares.");
    }
    
    public void wonToPesos(double cantidad) {
        double valorConversion = cantidad * 0.26;
        valorConversion = (double) Math.round(valorConversion *100d)/100;
        JOptionPane.showMessageDialog(null, "$"+cantidad+" ARS equivale a $"+valorConversion+" dólares.");
    }
    
}
