package controladores;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		MenuInterfaz mi = new MenuImplementacion();

        int opcionPrincipal;
        boolean cerrarPrincipal = false;

        do
        {
            System.out.println("MENÚ INICIAL");
            opcionPrincipal = mi.mostrarMenuPrincipalYSeleccion();
            switch (opcionPrincipal){

                case 0:
                    System.out.println("Se cierra la aplicación");
                    cerrarPrincipal = true;
                    break;
                case 1:
                    System.out.println("VERSIÓN EMPLEADO");
                    mi.accederVersionEmpleado();
                    
                    break;
                case 2:
                    System.out.println("VERSIÓN CLIENTE");
                    mi.accederVersionCliente();                        
                    break;
                default:
                    System.out.println("No se ha elegido una opción aceptable");
                    break;
            }

        } while (!cerrarPrincipal);

	}

}
