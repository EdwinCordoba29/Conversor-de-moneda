import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Main mn = new Main();
        Menu menu = new Menu();
        ValidarNumeros util = new ValidarNumeros();
        String opcion = menu.menuPrincipal();
        switch (opcion){
            case "Conversor de Moneda":
                String valor = menu.ingresarValor();
                if(!util.validarNumero(valor)){
                    JOptionPane.showMessageDialog(null,"Validado");
                }else{
                    JOptionPane.showMessageDialog(null,"No validado");
                }
                break;
            case "Conversor de Temperatura":
                menu.ingresarValor();
                break;
        }
    }
}