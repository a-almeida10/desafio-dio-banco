
public class ContaCorrente extends Contas{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
public void extrato(){

    System.out.println("----------------Extrato da Conta Corrente---------------");
    System.out.println("Titular: " + this.cliente.getNome());
    System.out.println("Número da conta: " + String.format("%04d", this.numero) + "  Agência: " + String.format("%03d",this.agencia));
    System.out.println("Seu saldo atual é de R$ " + String.format("%.2f", saldo) + " .");
}

   

    }

