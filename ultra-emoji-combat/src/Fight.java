public class Fight {
    private Fighter brave; //desafiado
    private Fighter defiant;  //desafiante
    private int rounds;

    private boolean approved;

    public void setBrave(Fighter brave) {
        this.brave = brave;
    }

    public void setDefiant(Fighter defiant) {
        this.defiant = defiant;
    }

    public Fighter getBrave() {
        return brave;
    }

    public Fighter getDefiant() {
        return defiant;
    }
    public void brandFight(Fighter fighter1, Fighter fighter2){
       if (fighter1.getCategory() == fighter2.getCategory()) {
           setBrave(fighter1);
           setDefiant(fighter2);
           if (brave != defiant) approved = true;
           else {
               approved = false;
               brave = null;
               defiant = null;
           }

       }

    }

    public void fight(){
        if (approved){
            this.brave.apresentation();
            this.defiant.apresentation();

            int wins = (int)(Math.random() * 3);

            switch (wins){
                case 0:
                    this.brave.drawFight();
                    System.out.println(brave.getName() + " draw fight");
                    this.defiant.drawFight();
                    System.out.println(defiant.getName() + " draw fight");
                    break;

                case 1:
                    this.brave.loseFight();
                    System.out.println(brave.getName() + " lose fight");
                    this.defiant.winFight();
                    System.out.println(defiant.getName() + " wins fight");
                    break;

                case 2:
                    this.defiant.loseFight();
                    System.out.println(defiant.getName() + " lose fight");
                    this.brave.winFight();
                    System.out.println(brave.getName() + " wins fight");
                    break;
            }
        }
            else {
                System.out.println("The fight cannot happen");
            }

    }



}
