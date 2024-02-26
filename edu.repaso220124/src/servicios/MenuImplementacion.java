package servicios;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;
import servicios.ClienteImplementacion;
import servicios.EmpleadoImplementacion;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	List<ClienteDto> listaClientes = new ArrayList<ClienteDto>();
	@Override
	public int mostrarMenuPrincipalYSeleccion() {
		int opcion;

        System.out.println("0. Cerrar aplicación");
        System.out.println("1. Versión empleado");
        System.out.println("2. Versión cliente");
        System.out.println("Escriba la opción deseada: ");
        opcion = sc.nextInt();
        return opcion;
	}

	@Override
	public void accederVersionEmpleado() {

		EmpleadoInterfaz ei = new EmpleadoImplementacion();

        int opcionEmpleado;
        opcionEmpleado = mostrarMenuEmpleadoYSeleccion();

        switch (opcionEmpleado)
        {
            case 0:
                break;
            case 1:
                ei.validarCliente(listaClientes);
                break;
            case 2:
                ei.borrarCliente(listaClientes); 
                break;
            case 3:
                ei.mostrarClientes(listaClientes); 
                break;
            default:
                System.out.println("No ha seleccionado una opción aceptable vuelve al menú inicial.");
                break;
        }
		
	}
	
    private int mostrarMenuEmpleadoYSeleccion() {
    
    	int opcion;

	    System.out.println("0. Volver");
	    System.out.println("1. Validar cliente");
	    System.out.println("2. Borrar cliente");
	    System.out.println("3. Mostrar clientes");
	    System.out.println("Escriba la opción deseada: ");
	    opcion = sc.nextInt();
	    return opcion;
    
    }

	@Override
	public void accederVersionCliente() {
		
		ClienteInterfaz ci = new ClienteImplementacion();

        int opcionCliente;
        opcionCliente = mostrarMenuClienteYSeleccion();

        switch (opcionCliente)
        {
            case 0:
                break;
            case 1:
                ci.registroNuevoCliente(listaClientes);
                break;
            case 2:
                ci.accesoCliente(listaClientes); 
                break;
            default:
                System.out.println("No ha seleccionado una opción aceptable vuelve al menú inicial.");
                break;
        }

	}
	
    private int mostrarMenuClienteYSeleccion()
    {
        int opcion;

        System.out.println("0. Volver");
        System.out.println("1. Registro cliente");
        System.out.println("2. Acceso cliente (login)");
        System.out.println("Escriba la opción deseada: ");
        opcion = sc.nextInt();
        return opcion;
    
    }

}
