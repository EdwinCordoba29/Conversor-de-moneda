import javax.swing.*;

public class Menu {
    public String menuPrincipal(){
        Object[] opciones = {"Seleccione","Conversor de Moneda","Conversor de Temperatura"};
        String opcion = JOptionPane.showInputDialog(null, "Seleccione una opción: ","Menu",JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]).toString();
        return opcion;
    }
    public String ingresarValor(){
        return JOptionPane.showInputDialog(null,"Ingrese el valor");
    }

    public void menuMonedas(){
        Object[] opcionesConvertir = {
                "Seleccione",
                "De Pesos a Dólar",
                "De Pesos a Euros",
                "De Pesos a Libras Esterleinas",
                "De Pesos a Yen Japonés",
                "De Pesos a Won sul-coreano",
                "De Dólar a Pesos",
                "De Euros a Pesos",
                "De Libras Esterleinas a Pesos",
                "De Yen Japonés a Pesos",
                "De Yen Won sul-coreano a Pesos"
        };
        Object opcion = JOptionPane.showInputDialog(null,"Seleccione el tipo de conversión","Tipos de conversión",JOptionPane.QUESTION_MESSAGE,null,opcionesConvertir,opcionesConvertir[0]);
        switch (opcion.toString()){
            case "De Pesos a Dólar":
                JOptionPane.showMessageDialog(null,"Opcion 1");
                break;
            case "De Pesos a Euros":
                JOptionPane.showMessageDialog(null,"Opcion 2");
                break;
            case "De Pesos a Libras Esterleinas":
                JOptionPane.showMessageDialog(null,"Opcion 3");
                break;
            case "De Pesos a Yen Japonés":
                JOptionPane.showMessageDialog(null,"Opcion 4");
                break;
            case "De Pesos a Won sul-coreano":
                JOptionPane.showMessageDialog(null,"Opcion 5");
                break;
            case "De Dólar a Pesos":
                JOptionPane.showMessageDialog(null,"Opcion 6");
                break;
            case "De Euros a Pesos":
                JOptionPane.showMessageDialog(null,"Opcion 7");
                break;
            case "De Libras Esterleinas a Pesos":
                JOptionPane.showMessageDialog(null,"Opcion 8");
                break;
            case "De Yen Japonés a Pesos":
                JOptionPane.showMessageDialog(null,"Opcion 9");
                break;
            case "De Yen Won sul-coreano a Pesos":
                JOptionPane.showMessageDialog(null,"Opcion 10");
                break;
        }
    }
}
