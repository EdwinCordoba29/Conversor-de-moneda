import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertirMonedas {
    public void convertirPesosAMonedas(double valor,String moneda,double valorMoneda) {
        double resultado = valor / valorMoneda;
        BigDecimal bd = new BigDecimal(resultado);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null, "Tienes $ " + bd + " " + moneda);

    }
    public void convertirModenasAPesos(double valor, double valorMoneda){
        double resultado = valor * valorMoneda;
        BigDecimal bd = new BigDecimal(resultado);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null,"Tienes $ " + bd + " Pesos");
    }
}
