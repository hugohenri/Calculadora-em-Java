package execercicioCalculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    float num1;
    float num2;
    float res;
    int alert =1;
   
    
    void soma(){
        res = num1 +num2;
    }

    void  subtrair(){
        res = num1 - num2;
    }

    void multiplicar(){
        res = num1 *num2;
    }

    void dividir(){
        if((num1 == 0) || (num2 == 0)){
            JOptionPane.showMessageDialog(null, "Não é possivel dividir", "Erro", JOptionPane.ERROR_MESSAGE);
            alert = 0;
            
            
        }else{
            res = num1 / num2;
        }
    }
    
    void resultado(){

        System.out.println("O resultado é: " + res);
    }

    
    
}
