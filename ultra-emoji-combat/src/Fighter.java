public class Fighter {
    private String name;
    private String nacionality;
    private int age;
    private double weight;
    private double height;
    private String category;
    private int wins;
    private int defeats;
    private int tied;

    public void apresentation(){
        System.out.println("---------------------------------------------");
        System.out.println("This is " + this.getName());
        System.out.println("from " + this.getNacionality());
        System.out.println("aged " + this.getAge());
        System.out.println("weighing "+ this.getWeight());
        System.out.println(" with " +  this.getWins() + " wins");
        System.out.println(this.getDefeats() + " losses");
        System.out.println("and");
        System.out.println(this.getTied() + " tieds");
        System.out.println("draws competing in the " + this.getCategory() + " division");
        System.out.println("--------------------------------------------------");
    }

    public void status(){
        System.out.println("-----------------------------------");
        System.out.println("name: "+ getName());
        System.out.println("from: "+ getNacionality());
        System.out.println("aged: "+ getAge());
        System.out.println("weight: "+ getWeight());
        System.out.println("height: "+ getHeight());
        System.out.println("categoy:"+ getCategory());
        System.out.println("wind: " + this.getWins());
        System.out.println("lose: " + this.getDefeats());
        System.out.println("tied: " + this.getTied());
        System.out.println("-----------------------------------");

    }
    public void winFight(){
        setWins(getWins() + 1);
    }

    public void loseFight(){
        setDefeats(getDefeats() + 1);
    }

    public void drawFight(){
        setTied(getTied() + 1);
    }


    public Fighter(String name, String nacionality, int age, double height, double weight, int wins, int defeats, int tied) {
        this.name = name;
        this.nacionality = nacionality;
        this.age = age;
        this.height = height;
        setWeight(weight);
        this.wins = wins;
        this.defeats = defeats;
        this.tied  = tied;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        setCategory();
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setCategory() {
        if(this.weight <= 70.3 ) this.category = "light";
        else if (this.weight <= 83.9) this.category = "avarege";
        else if (this.weight <= 120.2) this.category = "heavy";
        else this.category = "invalid";
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public void setTied(int tied) {
        this.tied = tied;
    }

    public String getName() {
        return name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getCategory() {
        return category;
    }

    public int getWins() {
        return wins;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getTied() {
        return tied;
    }
}
