import java.util.Scanner;

public class ContaBancaria
{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      
     System.out.println("Qual o numero da agencia:   ");
      String agencia = scanner.next();
      
     System.out.println("Qual o numero da conta:   ");
      int conta = scanner.nextInt();
      
     System.out.println("Qual o nome do cliente:   ");
      String nomeCliente = scanner.next();
     
     System.out.println("Qual o saldo em conta:   ");
      Double saldo = scanner.nextDouble();
      
      System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
      
      
    }
}
