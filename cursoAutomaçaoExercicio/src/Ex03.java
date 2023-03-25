

import javax.swing.JOptionPane;

public class Ex03 {
    
//   
    public static void main (String[]args) {
// Faca um algoritmo para ler dois valores exibir o segundo valor da variaveis trocados
String valor1String = JOptionPane.showInputDialog("Digite primeiro valor:");
String valor2String = JOptionPane.showInputDialog("Digite segundo valor");
String valor3String = "";

valor3String =  valor1String;
valor1String =  valor2String;
valor2String =  valor3String;

System.out.println ("Digite primeiro valor:"+ valor1String); //syout + tab
System.out.println ("Digite segundo valor:" + valor2String); //syout + tab

}
}


   


  




