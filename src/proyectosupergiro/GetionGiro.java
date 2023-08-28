/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosupergiro;

import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class GetionGiro {

    private static ArrayList<Giro> ListaGiro = new ArrayList<>();
    private static ArrayList<Cliente> ListaCliente = new ArrayList<>();

    public static boolean RegistrarCliente(Cliente cliente) {
        boolean agregar = ListaCliente.add(cliente);
        return agregar;
    }

    public static boolean ExisteCliente(String Identificacion) {
        boolean existe = false;
        for (Cliente cliente : ListaCliente) {
            if (cliente.getIdentificacion().equals(Identificacion)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static boolean ExisteGiro(String Destinatario) {
        boolean existe = false;
        for (Giro destinatario : ListaGiro) {
            if (destinatario.getDestinatario().equals(Destinatario)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static boolean HacerGiro(Giro giro) {
        boolean agregar = ListaGiro.add(giro);
        return agregar;
    }

    public static ArrayList<Cliente> listarCiente() {
        return ListaCliente;
    }

    public static ArrayList<Giro> listarGiro() {
        return ListaGiro;
    }

    public static void EliminarGiro(String Destinatario) {
        for (Giro g : ListaGiro) {
            if (g.getDestinatario().equals(Destinatario)) {
                ListaGiro.remove(g);
                break;
            }
        }
    }

    public static void EliminarCliente(String identificacion) {
        for (Cliente c : ListaCliente) {
            if (c.getIdentificacion().equals(identificacion)) {
                ListaCliente.remove(c);
                break;
            }
        }
    }

    public static Cliente ConsultarRemitente(String Identificacion) {
        Cliente cliente = null;
        for (Cliente c : ListaCliente) {
            if (c.getIdentificacion().equals(Identificacion)) {
                cliente = c;
                break;
            }
        }
        return cliente;
    }
}
