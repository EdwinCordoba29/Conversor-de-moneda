import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Main mn = new Main();
        Menu menu = new Menu();
        ValidarNumeros util = new ValidarNumeros();
        String opcion = menu.menuPrincipal();
        switch (opcion){
            case "Conversor de Moneda":
                String valor;
                do{
                    valor = menu.ingresarValor();
                }while(util.validarNumero(valor));
                menu.menuMonedas();
                break;
            case "Conversor de Temperatura":
                menu.ingresarValor();
                break;
        }
    }
}