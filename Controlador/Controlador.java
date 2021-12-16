package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Controlador implements ActionListener {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void iniciarVista(){
        vista.setTitle("Suma");
        vista.setLocationRelativeTo(null);
        vista.textoValor1.setText(String.valueOf(modelo.getValor1()));
        vista.textoValor2.setText(String.valueOf(modelo.getValor2()));
        vista.textoTotal.setText(String.valueOf(modelo.getTotal()));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        modelo.setValor1(Integer.parseInt(vista.textoValor1.getText()));
        modelo.setValor2(Integer.parseInt(vista.textoValor2.getText()));
        modelo.suma();
        vista.textoTotal.setText(String.valueOf(modelo.getTotal()));
        
    }
}
