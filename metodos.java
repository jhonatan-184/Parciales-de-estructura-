import java.util.Scanner;

public class metodos {
    public ObjVendedor[][] cargarVendedores(ObjVendedor[][] v,Scanner sc){
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.println("Ingrese el nombre del vendedor: ");
                String nombre = sc.next();
                System.out.println("Ingrese el telefono: ");
                Double telefono = sc.nextDouble();
                System.out.println("Ingrese la cantidad de ventas: ");
                int ventasRealizadas= sc.nextInt();
                ObjVendedor o = new ObjVendedor(nombre, telefono, ventasRealizadas);
                v[i][j] = o;
            }
        }
        return v;
    }

    public void mostrarVendedorDelAño(ObjVendedor[][] v){
        int mayor = 0;
        int posI = 0;
        int posJ = 0;
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if(v[i][j].getVentasRealizadas() > mayor){
                    mayor = v[i][j].getVentasRealizadas();
                    posI = i;
                    posJ = j;
                }
            }
        }
        System.out.println("El vendedor del año es: " + v[posI][posJ].getNombre());
        System.out.println("Telefono: " + v[posI][posJ].getTelefono());
        System.out.println("Total de ventas realizadas: " + v[posI][posJ].getVentasRealizadas());
    }
}