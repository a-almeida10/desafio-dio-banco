
public class ContaCorrente extends Contas{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
public void extrato(){

    System.out.println("----------------Extrato da Conta Corrente---------------");
    System.out.println("Número da conta: " + super.numero + "  Agência: " + super.agencia  );
    System.out.println("Seu saldo atual é de R$ " + String.format("%.2f", saldo) + " .");
   
}

   

    }

