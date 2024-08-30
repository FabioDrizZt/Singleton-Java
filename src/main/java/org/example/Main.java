package org.example;

import org.example.configuracion.ConfiguracionGlobal;

public class Main {
    public static void main(String[] args) {
        // Intentamos obtener la instancia del singleton
        Singleton miSingleton = Singleton.getInstance();

        // Para utilizar los metodos de singleton
        miSingleton.showMessage();

        Singleton miSingleton2 = Singleton.getInstance();
        miSingleton2.showMessage();

        // Obteniendo la instancia de la configuración global
        ConfiguracionGlobal configuracion = ConfiguracionGlobal.getInstancia();

        // Usando la configuración en la aplicación
        System.out.println("URL de la base de datos: " + configuracion.getUrlBaseDatos());

        // Cambiando un atributo de configuración
        configuracion.setUrlBaseDatos("jdbc:mysql://otroHost:3306/miBaseDatos");
        System.out.println("Nueva URL de la base de datos: " + configuracion.getUrlBaseDatos());
    }

}
