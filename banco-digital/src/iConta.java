public interface iConta {
    
    default void sacar(double valor) {

    }
    default void depositar(double valor) {

    }
    default void transferir(double valor, Contas contaDestino) {

    }
    default void extrato(){

    }


}
