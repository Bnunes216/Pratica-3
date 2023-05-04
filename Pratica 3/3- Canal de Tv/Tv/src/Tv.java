import javax.swing.JOptionPane;

public class Tv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder mensagem = new StringBuilder();
        
        int canal,quantidade,total=0,c2=0,q2=0,c4=0,q4=0,c5=0,q5=0,c7=0,q7=0,c12=0,q12=0,i=0;
    
    do{
   i++;     
 canal = Integer.parseInt(JOptionPane.showInputDialog("A qual canal voce assite dentre esta lista:\n Insira apenas o numero do canal\n Canal 2\n Canal 4\n Canal 5\n Canal 7\n Canal 12")); 
 if(canal != 0){
 
 quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas da sua casa estao assistindo este canal?\n"));
        
 if(canal ==2){
  c2++;   
  q2= q2+quantidade;   
 }else if(canal==4){
  c4++;
  q4 =quantidade;
 }else if(canal==5){
  c5++;
  q5 =quantidade;
 }else if(canal==7){
  c7++;
  q7 =quantidade;
 }else if(canal==12){
  c12++;
  q12 =quantidade;
 }                            
total = total + quantidade; 

 }
        
    }while(canal!=0);
    
        mensagem.append("Casa assistindo o canal 2: ").append(c2).append("\nPessoas assistindo o canal 2:").append(q2)
        .append("\nCasa assistindo o canal 4: ").append(c4).append("\nPessoas assistindo o canal 4:").append(q4)
        .append("\nCasa assistindo o canal 5: ").append(c5).append("\nPessoas assistindo o canal 5:").append(q5)
        .append("\nCasa assistindo o canal 7: ").append(c7).append("\nPessoas assistindo o canal 7:").append(q7)
        .append("\nCasa assistindo o canal 12: ").append(c12).append("\nPessoas assistindo o canal 12:").append(q12);
JOptionPane.showMessageDialog(null, mensagem);
    System.exit(0);
    }
    
}