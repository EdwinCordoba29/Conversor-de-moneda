import javax.swing.*;

public class Menu {
    public String menuPrincipal(){
        Object[] opciones = {"Conversor de Moneda","Conversor de Temperatura"};
        String opcion = JOptionPane.showInputDialog(null, "Seleccione una opción: ","Menu",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]).toString();
        return opcion;
    }
    public String ingresarValor(){
        return JOptionPane.showInputDialog(null,"Ingrese el valor");
    }
}
