/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package alura.conversordemonedas;

import alura.conversordemonedas.ConversorService.ConversorService;
import javax.swing.JOptionPane;

/**
 *
 * @author Elián
 */
public class ConversorDeMonedas {

    public static void main(String[] args) {

        ConversorService conversor = new ConversorService();

        String opciones = (String) (JOptionPane.showInputDialog(null, "Seleccione una moneda", "Conversor de moneda", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de moneda", "Conversor de temperatura"}, "Seleccionar"));
        
        boolean continuar = true;
        
        while (continuar) {
            switch (opciones) {
                case "Conversor de moneda":
                    String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir");

                    try {
                        double cantidad = Double.parseDouble(input);
                        conversor.elegirMoneda(cantidad);
                    } catch (NumberFormatException e) {
                        System.out.println("No se ha ingresado un valor númerico");
                        JOptionPane.showMessageDialog(null, "No se ha ingresado un valor númerico");
                        e.getMessage();
                        e.printStackTrace();

                    }

                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");

                    if (respuesta == JOptionPane.NO_OPTION || respuesta == JOptionPane.CANCEL_OPTION) {
                        continuar = false;
                        break;
                    }

                default:
                    break;
            }
        }
    }
}
