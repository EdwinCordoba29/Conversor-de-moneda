import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertirTemperaturas {
    private double temperaturaConvertir;
    public void celsiusAFahrenheit(double temperatura){
        temperaturaConvertir = temperatura * 9/5 + 32;
        BigDecimal bd = new BigDecimal(temperaturaConvertir);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null,temperatura + " ºC es igual a " + bd + " ºF","Celsius a Fahrenheit",1);
    }
    public void celsiusAKelvin(double temperatura){
        temperaturaConvertir = temperatura + 273.15;
        BigDecimal bd = new BigDecimal(temperaturaConvertir);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null,temperatura + " ºC es igual a " + bd + " K","Celsius a Kelvin",1);
    }
    public void celsiusARankine(double temperatura){
        temperaturaConvertir = temperatura * 9/5 + 491.67;
        BigDecimal bd = new BigDecimal(temperaturaConvertir);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null,temperatura + " ºC es igual a " + bd + " ºR","Celsius a Rankine",1);
    }
    public void fahrenheitACelsius(double temperatura){
        temperaturaConvertir = (temperatura - 32) * 5/9;
        BigDecimal bd = new BigDecimal(temperaturaConvertir);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null,temperatura + " ºF es igual a " + bd + " ºC","Fahrenheit a Celsius",1);
    }
    public void fahrenheitAKelvin(double temperatura){
        temperaturaConvertir = (temperatura + 459.67) * 5/9;
        BigDecimal bd = new BigDecimal(temperaturaConvertir);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null,temperatura + " ºF es igual a " + bd + " K","Fahrenheit a Kelvin",1);
    }
    public void fahrenheitARankine(double temperatura){
        temperaturaConvertir = temperatura + 459.67;
        BigDecimal bd = new BigDecimal(temperaturaConvertir);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null,temperatura + " ºF es igual a " + bd + " ºR","Fahrenheit a Rankine",1);
    }
}
