public class Main {

    public static void main(String[] args){
        var charlesConta = new ContaBanco(12543,"CC","Charles Eduardo Mello Guimaraes", 2000.00);
        charlesConta.statusConta();
        charlesConta.depositar(2000);

    }

}