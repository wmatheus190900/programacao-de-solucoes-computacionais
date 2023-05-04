package Lista4;
import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args) {
        String entrada, sexo;
        int nota, idade;
        double salario;
        boolean continuar = true;
        
        while (continuar) {
        do{
            entrada = JOptionPane.showInputDialog("Informe nota");
            // Converte a entrada para inteiro e armazena em numero1:
            nota = Integer.parseInt(entrada);
            if(nota>0 && nota<=10){
            JOptionPane.showMessageDialog(null,"Sucesso");
            }else{
            JOptionPane.showMessageDialog(null, "Número inválido");
            }
        }while(nota<0 || nota>10);
        do{
            entrada = JOptionPane.showInputDialog("Informe o salário: ");
             // Converte a entrada para inteiro e armazena em numero2:
            salario = Double.parseDouble(entrada);
            if(salario>0){
            JOptionPane.showMessageDialog(null,"Sucesso" );
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido");
        }
        } while(salario<0);
        do{
            sexo = JOptionPane.showInputDialog("Informe o sexo: ");
            if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
            JOptionPane.showMessageDialog(null,"Sucesso" );
            } else {
            JOptionPane.showMessageDialog(null, "inválido");
            }
        } while(!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));
        
        do{
            entrada = JOptionPane.showInputDialog("Informe a idade: ");
             // Converte a entrada para inteiro e armazena em numero2:
            idade = Integer.parseInt(entrada);
            if(idade>0 && idade<150){
            JOptionPane.showMessageDialog(null,"Sucesso" );
            } else {
            JOptionPane.showMessageDialog(null, "Número inválido");
            }
        }while(idade<0 || idade>150);
        
        entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
        if (entrada.equalsIgnoreCase("n") || entrada.equalsIgnoreCase("não")) {
            continuar = false;
        }
        }        
    }
}

