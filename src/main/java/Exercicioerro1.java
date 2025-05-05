
import javax.swing.JOptionPane;

public class Exercicioerro1 {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int n = 0;
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1:"));
        } catch (NumberFormatException e) {
            System.out.println("tentando usar letra no numero: " + e);
        }
        try {
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1:"));
        } catch (NumberFormatException e) {
            System.out.println("tentando usar letra no numero: " + e);

        }
        try {
            n = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("tentando fazer divisao por 0: " + e);
        }
        System.out.println("O resultado é: " + n);
    }
}
