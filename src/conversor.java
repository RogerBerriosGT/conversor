import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Quetzales a Euros", "Quetzales a Dólares", "Quetzales a Libras Esterlinas", "Quetzales a Yen",
                    "Quetzales a Won" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en Quetzales de Guatemala: ");
            double quetzal;
            try {
                quetzal = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("Quetzales a Dólares")) {
                double dollars = quetzal * 0.13;
                JOptionPane.showMessageDialog(null,
                        quetzal + " Quetzales son " + FormatearDecimal.format(dollars) + " dólares.");
            } else if (choice.equals("Quetzales a Euros")) {
                double euros = quetzal * 0.12;
                JOptionPane.showMessageDialog(null, quetzal + " Quetzales son " + euros + " euros.");
            } else if (choice.equals("Quetzales a Libras Esterlinas")) {
                double pounds = quetzal * 0.10;
                JOptionPane.showMessageDialog(null, quetzal + " Quetzales son " + pounds + " libras esterlinas.");
            } else if (choice.equals("Quetzales a Yen")) {
                double yen = quetzal * 20.01;
                JOptionPane.showMessageDialog(null, quetzal + " Quetzales son " + yen + " yenes japoneses.");
            } else if (choice.equals("Quetzales a Won")) {
                double won = quetzal * 176.58;
                JOptionPane.showMessageDialog(null, quetzal + " Quetzales son " + won + " wones surcoreanos.");
            }

            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }

    }
}