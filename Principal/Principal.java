package Principal;
import Modelo.Modelo;
import Controlador.Controlador;
import Vista.Vista;
public class Principal {
    
    public static void main(String[] args){
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista,new Modelo());
        controlador.iniciarVista();
        vista.setVisible(true);
    }
}