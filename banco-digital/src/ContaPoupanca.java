public class ContaPoupanca extends Contas {

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

protected double rendimento() {
        double taxa = 0.0928;
        double rendimento = taxa*saldo;
        return rendimento;
       
}

protected double rendimentoAnual() {
    double saldoFinal = saldo + rendimento() ;
    return saldoFinal;  
    
}


    @Override
public void extrato(){

    System.out.println("----------------Extrato da Conta Poupanca---------------");
    System.out.println("Titular: " + this.cliente.getNome());
    System.out.println("Número da conta: " + String.format("%04d", this.numero) + "  Agência: " + String.format("%03d",this.agencia));
    System.out.println("Seu saldo atual é de R$ " + String.format("%.2f", saldo) + " .");
    System.out.println("Em 12 meses sua conta irá render: R$ " + String.format("%.2f",rendimento()));
    System.out.println("Seu saldo final será de: R$ " + String.format("%.2f",rendimentoAnual()));
}

}
