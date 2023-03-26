import javax.swing.*;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ValidarNumeros util = new ValidarNumeros();
        String opcion = menu.menuPrincipal();
        switch (opcion){
            case "Conversor de Moneda":
                String valor;
                do{
                    valor = menu.ingresarValor();
                }while(util.validarNumero(valor));
                double cantidad = Double.parseDouble(valor);
                menu.menuMonedas(cantidad);
                break;
            case "Conversor de Temperatura":
                menu.ingresarValor();
                break;
        }
    }
}