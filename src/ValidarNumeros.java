import javax.swing.*;

public class ValidarNumeros {
    public boolean validarNumero(String cadena){
        boolean resultado = true;
        if(cadena.matches("[0-9]*")){
            JOptionPane.showMessageDialog(null,"Es un número");
            resultado = false;
        }else{
            JOptionPane.showMessageDialog(null,"No es un número");
        }
        return resultado;
    }
}
