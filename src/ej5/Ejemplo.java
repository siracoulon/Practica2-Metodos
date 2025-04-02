package ej5;
import java.io.*;
// Clase que contiene al metodo
public class Ejemplo {

    // Declaramos las excepciones personalizadas
    public static class XxxException extends Exception {
        public XxxException(String message) {
            super(message);
        }
    }

    public static class YyyException extends Exception {
        public YyyException(String message) {
            super(message);
        }
    }

    // El método que lanza las excepciones personalizadas
    public void methodD() throws XxxException, YyyException {
        //  try-catch para manejar XxxException
        try {
            // Simulamos que XxxException ocurre
            if (someConditionForXxx()) {
                throw new XxxException("XxxException por otra condicion");
            }

            
            System.out.println("XxxException not thrown.");

        } catch (XxxException e) {
            System.out.println("Capturada XxxException: " + e.getMessage());
        }

        // try-catch para manejar YyyException
        try {
            // Simulamos un escenario donde YyyException ocurre
            if (someConditionForYyy()) {
                throw new YyyException("YyyException por otra condicion");
            }

            
            System.out.println("YyyException not thrown.");

        } catch (YyyException e) {
            System.out.println(" Capturada YyyException: " + e.getMessage());
            
        }
    }

    // Las condiciones para lanzar excepciones
    private boolean someConditionForXxx() {
        
        return true; 
    }

    private boolean someConditionForYyy() {
        
        return false; 
    }

    
}
