import javax.swing.JOptionPane;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        String opcion = menu.menuPrincipal();
        JOptionPane.showMessageDialog(null, "Usted seleccionó " + opcion, "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}