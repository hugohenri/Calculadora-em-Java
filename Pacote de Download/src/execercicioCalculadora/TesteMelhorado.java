package execercicioCalculadora;

import javax.swing.JOptionPane;

public class TesteMelhorado {
    public static void main(String[] args) throws Exception {
        
        Calculadora calculadora = new Calculadora();

        String opcao = JOptionPane.showInputDialog(null, "1- SOMA \n2- SUBTRAÇÃO\n3- MULTIPLICAÇÃO\n4- DIVISÃO");
        
        String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        String numero2 = JOptionPane.showInputDialog(null, "Digite o segundo numero");
        calculadora.num1 = Float.parseFloat(numero1);
        calculadora.num2 = Float.parseFloat(numero2);
        

       

        switch (opcao) {
            case "1":
                calculadora.soma();
                
                break;
            case "2":
                calculadora.subtrair();
                break;
            case "3":
                calculadora.multiplicar();
                break;
            case "4":
                calculadora.dividir();
                break;
                
            default:
            System.out.println("valor invalido");
                break;
               
        }
        

        if(calculadora.alert != 0){
        JOptionPane.showMessageDialog(null, "O resulto é: " + calculadora.res, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
        }
       
        
        
        
        
    }
}
