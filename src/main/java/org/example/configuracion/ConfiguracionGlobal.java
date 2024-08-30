package org.example.configuracion;

public class ConfiguracionGlobal {
    // Única instancia de la clase
    private static ConfiguracionGlobal instancia = null;

    // Atributos de configuración
    private String urlBaseDatos;
    private int maxConexiones;
    // Otros atributos de configuración...

    // Constructor privado para prevenir instanciación externa
    private ConfiguracionGlobal() {
        // Inicialización de atributos de configuración
        urlBaseDatos = "jdbc:mysql://localhost:3306/miBaseDatos";
        maxConexiones = 10;
        // Inicializar otros atributos...
    }

    // Método público estático para obtener la instancia
    public static synchronized ConfiguracionGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGlobal();
        }
        return instancia;
    }

    // Métodos getters y setters para los atributos de configuración
    public String getUrlBaseDatos() {
        return urlBaseDatos;
    }

    public void setUrlBaseDatos(String urlBaseDatos) {
        this.urlBaseDatos = urlBaseDatos;
    }

    public int getMaxConexiones() {
        return maxConexiones;
    }

    public void setMaxConexiones(int maxConexiones) {
        this.maxConexiones = maxConexiones;
    }
}
