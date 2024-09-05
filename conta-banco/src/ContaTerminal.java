import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        
       //PRIMEIRO CRIEI O SCANNER
        Scanner scanner = new Scanner(System.in);

       //DEPOIS SETEI AS VARIAVEIS
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

       //AQUI EU PEÇO PRA APARECER NA TELA E O USUARIO DIGITAR, O SCANNER LE E FIXA NA VARIAVEL numeroConta
        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = scanner.nextInt();

       //AQUI VAI PRA PROXIMA LINHA
        scanner.nextLine();

       //AQUI EU PEÇO PRA APARECER NA TELA E O USUARIO DIGITAR, O SCANNER LE E FIXA NA VARIAVEL agencia
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

       //AQUI EU PEÇO PRA APARECER NA TELA E O USUARIO DIGITAR, O SCANNER LE E FIXA NA VARIAVEL nomeCliente 
        System.out.println("Por favor, digite o seu Nome:");
        nomeCliente = scanner.nextLine();

       //AQUI EU PEÇO PRA APARECER NA TELA E O USUARIO DIGITAR, O SCANNER LE E FIXA NA VARIAVEL saldo 
        System.out.println("Por favor, digite o Saldo:");
        saldo = scanner.nextFloat();

       //AQUI A PARTE FINAL DO CODIGO ONDE AS VARIAVEIS QUE O SCANNER GUARDOU SÃO CONCATENADAS COM O TEXTO 
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

       //AQUI FECHA O SCANNER, FIM DO CODIGO 
        scanner.close();
    }

}
