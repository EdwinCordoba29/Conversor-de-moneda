import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    ConvertirMonedas convertir = new ConvertirMonedas();
    public String menuPrincipal(){
        Object[] opciones = {"Conversor de Moneda","Conversor de Temperatura"};
        Object opcion = JOptionPane.showInputDialog(null, "Seleccione una opción: ","Menu",JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
        if(opcion == null){
            return "null";
        }else{
            return opcion.toString();
        }
    }
    public void finalizarPrograma(){
        JOptionPane.showMessageDialog(null, "Programa finalizado","Programa",1);
    }
    public String ingresarValor(){
        Object valor = JOptionPane.showInputDialog(null,"Ingrese el valor");
        if(valor == null){
            return "null";
        }else{
            return valor.toString();
        }
    }

    public String menuMonedas(double canitdadConvertir){
        Object[] opcionesConvertir = {
                "De Pesos a Dólar",
                "De Pesos a Euros",
                "De Pesos a Libras Esterleinas",
                "De Pesos a Yen Japonés",
                "De Pesos a Won sur-coreano",
                "De Dólar a Pesos",
                "De Euros a Pesos",
                "De Libras Esterleinas a Pesos",
                "De Yen Japonés a Pesos",
                "De Won sur-coreano a Pesos"
        };
        Object opcion = JOptionPane.showInputDialog(null,"Seleccione el tipo de conversión","Tipos de conversión",JOptionPane.QUESTION_MESSAGE,null,opcionesConvertir,opcionesConvertir[0]);
        if(opcion == null){
            return "null";
        }else{
            Map<String,Double> valorMonedas = new HashMap<String,Double>();
            valorMonedas.put("USD",4750.23);
            valorMonedas.put("EUR",5107.70);
            valorMonedas.put("GBP",5808.11);
            valorMonedas.put("JPY",36.33);
            valorMonedas.put("KRW",3.67);
            switch (opcion.toString()){
                case "De Pesos a Dólar":
                    convertir.convertirPesosAMonedas(canitdadConvertir,"USD",valorMonedas.get("USD"));
                    break;
                case "De Pesos a Euros":
                    convertir.convertirPesosAMonedas(canitdadConvertir,"EUR",valorMonedas.get("EUR"));
                    break;
                case "De Pesos a Libras Esterleinas":
                    convertir.convertirPesosAMonedas(canitdadConvertir,"GBP",valorMonedas.get("GBP"));
                    break;
                case "De Pesos a Yen Japonés":
                    convertir.convertirPesosAMonedas(canitdadConvertir,"JPY",valorMonedas.get("JPY"));
                    break;
                case "De Pesos a Won sur-coreano":
                    convertir.convertirPesosAMonedas(canitdadConvertir,"KRW",valorMonedas.get("KRW"));
                    break;
                case "De Dólar a Pesos":
                    convertir.convertirModenasAPesos(canitdadConvertir,valorMonedas.get("USD"));
                    break;
                case "De Euros a Pesos":
                    convertir.convertirModenasAPesos(canitdadConvertir,valorMonedas.get("EUR"));
                    break;
                case "De Libras Esterleinas a Pesos":
                    convertir.convertirModenasAPesos(canitdadConvertir,valorMonedas.get("GBP"));
                    break;
                case "De Yen Japonés a Pesos":
                    convertir.convertirModenasAPesos(canitdadConvertir,valorMonedas.get("JPY"));
                    break;
                case "De Won sur-coreano a Pesos":
                    convertir.convertirModenasAPesos(canitdadConvertir,valorMonedas.get("KRW"));
                    break;
            }
            return "";
        }
    }
}
