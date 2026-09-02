/*Ejercicio 9 – Vendedor del año 

La empresa Yupi cuenta con cinco vendedores que participan por el reconocimiento al vendedor del año. 

Durante los diferentes meses se registraron las ventas realizadas por cada vendedor. La administración necesita consolidar esta información para determinar quién obtuvo el mayor resultado durante el año. 

Una vez identificado el ganador, se requiere presentar: 

Nombre. 

Teléfono. 

Total de ventas realizadas. 

Desarrolle una solución que permita determinar el ganador a partir de la información registrada durante los meses.  */
public class ObjVendedor{
    String Nombre;
    double Telefono;
    int VentasRealizadas;

    public ObjVendedor(String nombre, double telefono, int ventasRealizadas){
        Nombre =nombre;
        Telefono = telefono;
        VentasRealizadas = ventasRealizadas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getTelefono() {
        return Telefono;
    }

    public void setTelefono(double telefono) {
        Telefono = telefono;
    }

    public int getVentasRealizadas() {
        return VentasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        VentasRealizadas = ventasRealizadas;
    }

 
}