package execercicioCalculadora;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        String numero2 = JOptionPane.showInputDialog(null, "Digite o segundo numero");
        calculadora.num1 = Float.parseFloat(numero1);
        calculadora.num2 = Float.parseFloat(numero2);
        
        calculadora.soma();
        calculadora.resultado();
        calculadora.subtrair();
        calculadora.resultado();
        calculadora.dividir();
        calculadora.resultado();
    }
}
