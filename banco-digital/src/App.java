public class App {
          
   public static void main(String[] args) {

   Cliente Aghata = new Cliente();
   Aghata.setNome("Ághata Almeida");   
   
    Contas conta1 = new ContaCorrente(Aghata);
    Contas conta2 = new ContaPoupanca(Aghata);


    conta1.depositar(123500);
    conta1.extrato();
    conta2.depositar(25.00);
    conta2.extrato();
    conta1.transferir(800.00, conta2);
    conta1.extrato();
    conta2.extrato();
   }

}

