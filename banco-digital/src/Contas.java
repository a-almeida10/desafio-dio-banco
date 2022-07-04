public abstract class Contas implements iConta {
    
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0001;

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;


    public Contas(Cliente cliente){

        this.agencia = Contas.AGENCIA_PADRAO;
        this.numero = Contas.SEQUENCIAL++;
        this.cliente = cliente;
    }

//-------------IMPLEMENTAÇAO INTERFACE: MÉTODOS------------//

@Override
public void sacar(double valor) {
     saldo -= valor;
     
}
@Override 
public void depositar(double valor) {
    saldo += valor;
}
@Override 
public void transferir(double valor, Contas contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    
}

@Override
public void extrato(){

    System.out.println("----------------Extrato da conta----------------");
    System.out.println("Titular: " + this.cliente.getNome());
    System.out.println("Número da conta: " + String.format("%04d", this.numero) + "  Agência: " + String.format("%03d",this.agencia));
    System.out.println("Seu saldo atual é de R$ " + String.format("%.2f", saldo) + " .");
   
}
}



// //--------------------MÉTODOS---------------------//

    
//    public void sacar(){


//    }

//    public void depositar(){   
//     }

//     public void transferir(){

    
//     }

//----------GETS AND SETS----------------------//
    
//     public int getAgencia() {
//         return agencia;
//     }


//     public int getNumero() {
//         return numero;
//     }
    
// }
