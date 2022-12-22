public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;

    private boolean status = false;

    public ContaBanco(int numeroDaConta, String tipo, String dono, double saldo) {
        this.numConta = numeroDaConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        abrirContas();
    }
    public void statusConta(){
        System.out.println("A conta está ativa: " + this.status);
        System.out.println("Nome do dono da conta: " + this.dono);
        System.out.println("Saldo da conta: " + this.saldo);
        System.out.println("Tipo da conta: " + this.tipo);
        System.out.println();
    }

    public void abrirContas() {
        if (this.status) System.out.println("Está conta já está aberta");
        else this.status = true;
    }


    public void fecharConta(){
        if (!this.status) System.out.println("Está conta já esta desativada");
        else if (this.saldo != 0) System.out.println("você tenque sacar antes de fechar a conta você possuí um saldo de "+ this.saldo);
        else this.status = false;
        System.out.println("Conta fechada com sucesso");;
    }
    public void sacar(double valor){
        if(this.saldo >= valor && this.status) {
            this.saldo -= valor;
            System.out.println("você sacou: " + valor);
            System.out.println("o saldo da sua conta é de: " + this.saldo);
        } else if (!this.status) System.out.println("A sua conta não existe em nosso sistema");
         else System.out.println("Você não tem saldo o suficiente para sacar " + valor + ", o seu saldo é de " + saldo);

    }
    public void depositar(double valor){
        if (!this.status) {
            System.out.println("A sua conta não existe em nosso sistema");
            return;
        }
        System.out.println("você depositou: " + valor);
        this.saldo += valor;
        System.out.println("o saldo da sua conta é de: " + this.saldo);

    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }
}
