

import javax.swing.JOptionPane;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         
        String  digiteNomeCliente  = JOptionPane.showInputDialog("Digite nome do Cliente"); 
        String  porFavorDigiteNúmeroDaAgência =JOptionPane.showInputDialog("Por favor digite o número da agência");
        int  digiteNúmeroDaConta  = Integer.parseInt(JOptionPane.showInputDialog("Digite o número  da conta"));
        float saldo = 237.48f;
    
        meuprimeirometódo( digiteNomeCliente,   porFavorDigiteNúmeroDaAgência, digiteNúmeroDaConta,  saldo);
    
              
    }


    public static void meuprimeirometódo(String digiteNomeCliente, String  porFavorDigiteNúmeroDaAgência, int  digiteNúmeroDaConta, float saldo)
     {

                System.out.println ("Digite nome do Cliente");
                System.out.println (digiteNomeCliente );
                System.out.println ("Por favor digite o número da agência");
                System.out.println (porFavorDigiteNúmeroDaAgência );
                System.out.println ("Digite o número  da conta");
                System.out.println (digiteNúmeroDaConta );
                System.out.println ("saldo");
                System.out.println (saldo);
                
                System.out.println("Olá [ " + digiteNomeCliente +  " ], obrigado por criar uma conta em nosso banco, sua agência é [ " + porFavorDigiteNúmeroDaAgência + "], conta [ " + digiteNúmeroDaConta + " ] e seu saldo [ "+ saldo + " ] já está disponível para saque\".");


     }

}