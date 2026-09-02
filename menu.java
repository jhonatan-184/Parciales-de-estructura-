import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        Boolean continuar = true;
        System.out.println("ingrese la cantidad de vendedores");
        int n = sc.nextInt();
        ObjVendedor[][] v = new ObjVendedor[n][n];


        while(continuar){
            System.out.println("vienvenido al vendedor del año");
            System.out.println("que desea realizar: ");
            System.out.println("1) Llenar informacion del vendedor");
            System.out.println("2) mostar vendedor del año");
            int opt = sc.nextInt();
        
            switch (opt){
                case 1:
                    m.cargarVendedores(v,sc);
                    break;
                case 2:
                    m.mostrarVendedorDelAño(v);
                    break;
            }
        }

    }
}
