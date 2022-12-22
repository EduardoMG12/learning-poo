public class Pencil {
    private String model;
    private String cor;
    private Integer ponta;
    private Boolean tampada;

    private Integer carga;

    public Pencil(String model, String cor, Integer ponta){
        this.model = model;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = true;
        this.carga = 100;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPonta(Integer ponta) {
        this.ponta = ponta;
    }

    public void setTampada(Boolean tampada) {
        this.tampada = tampada;
    }

    public Integer getPonta() {
        return ponta;
    }

    public String getCor() {
        return cor;
    }

    public String getModel() {
        return model;
    }

    public void pencil(){ }

    public void pencilReview(){
        System.out.println(this.model);
        System.out.println(this.cor);
        System.out.println(this.ponta);
        System.out.println(this.tampada);
        System.out.println(this.carga);
    }
    public void rabiscar(String rabisquei){
        if (this.tampada){
            System.out.println("Essa ação é inválida pois a caneta esta tampada");
        }
        if (this.carga <= 0){
            System.out.println("acabou a tinta da sua caneta");
        }
        else this.carga -= 10;
        System.out.println(rabisquei);
    }

    public String tampar(String statePencil) {
        String message;
        if (statePencil == "tampar" && !this.tampada){
            this.tampada = true;
            message = "Você tampou a caneta";
            return message;
        } if (statePencil == "destampar" && this.tampada){
            this.tampada = false;
            message = "Você destampou a caneta";
            return message;
        }

        else {
            String stateNowPencil = this.tampada == true ? " tampada " : " destampada ";
            message = "Ação inválida a caneta está" + stateNowPencil  + "você não pode efetuar essa ação";
        }

        return message;
    }


}
