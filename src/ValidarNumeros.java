import javax.swing.*;

public class ValidarNumeros {
    public boolean validarNumero(String cadena) {
        boolean resultado = true;
        try {
            double x = Double.parseDouble(cadena);
            if (x >= 0 || x < 0) {
                resultado = false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido");
        }
        return resultado;
    }
}
