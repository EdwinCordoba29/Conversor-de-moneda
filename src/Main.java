import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ValidarNumeros util = new ValidarNumeros();
        String resultado;
        String opcion;
        String valor;
        int respuesta;
        boolean continuar = true;
        TERMINAR:
        while(continuar){
            PRINCIPAL:
            while(continuar){
                opcion = menu.menuPrincipal();
                switch (opcion){
                    case "Conversor de Moneda":
                        do{
                            valor = menu.ingresarValor();
                            if(valor == "null"){
                                break PRINCIPAL;
                            }
                        }while(util.validarNumero(valor));
                        double cantidad = Double.parseDouble(valor);
                        resultado = menu.menuMonedas(cantidad);
                        if(resultado == "null"){
                            break PRINCIPAL;
                        }
                        break;
                    case "Conversor de Temperatura":
                        do {
                            valor = menu.ingresarValor();
                            if(valor == "null"){
                                break PRINCIPAL;
                            }
                        }while(util.validarNumero(valor));
                        double temperatura = Double.parseDouble(valor);
                        resultado = menu.menuTemperaturas(temperatura);
                        if(resultado == "null"){
                            break PRINCIPAL;
                        }
                        break;
                    case "null":
                        menu.finalizarPrograma();
                        break TERMINAR;
                }
                respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversión?","Confirmación",0,3);
                if(respuesta == JOptionPane.NO_OPTION){
                    continuar = false;
                    menu.finalizarPrograma();
                }
            }
        }
    }
}