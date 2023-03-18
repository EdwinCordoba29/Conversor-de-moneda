import javax.swing.*;

public class ValidarNumeros {
    public boolean validarNumero(String cadena){
        boolean resultado = true;
        if(cadena.matches("[0-9]*")){
            resultado = false;
        }else{
            JOptionPane.showMessageDialog(null,"Valor no válido");
        }
        return resultado;
    }
}
