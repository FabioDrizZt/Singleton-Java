package org.example;

public class Singleton {
    // Aqui tenemos una unica instancia de la clase
    private static Singleton instanciaUnica;

    // El metodo constructor que nadie mas que esta misma clase puede utilizar
    private Singleton(){
        // Toda la inicialización de nuestro objeto
        System.out.println("Se utilizo el constructor");
    }

    // Método para obtener esa instancia creada por el constructor
    public static Singleton getInstance(){
        if (instanciaUnica == null) {
            // Si no hay instancia creada, se la crea
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    public void showMessage(){
        System.out.println("Hola, soy la unica instancia de Singleton");
    }
}
