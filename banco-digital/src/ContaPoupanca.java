public class ContaPoupanca extends Contas {

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }


    @Override
public void extrato(){

    System.out.println("----------------Extrato da Conta Poupanca---------------");
    System.out.println("Número da conta: " + super.numero + "  Agência: " + super.agencia  );
    System.out.println("Seu saldo atual é de R$ " + String.format("%.2f", saldo) + " .");
   
}

}
