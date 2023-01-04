public class Main {
    public static void main(String[] args) {

        var lutador = new Fighter[5];
        lutador[0] = new Fighter("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        lutador[1] = new Fighter("Putscript" , "Brasil", 29, 1.68, 57.8, 14,2,3);
        lutador[2] = new Fighter("Snapshadow","EUA", 35,1.65,80.9,12,2,1);
        lutador[3] = new Fighter("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);

        System.out.println("-----------------------");
        System.out.println(lutador[0].getWins());
        System.out.println(lutador[0].getTied());
        System.out.println(lutador[0].getDefeats());
        System.out.println("-----------------------");
        System.out.println(lutador[1].getWins());
        System.out.println(lutador[1].getTied());
        System.out.println(lutador[1].getDefeats());
        System.out.println("-----------------------");

        var fight = new Fight();
        fight.brandFight(lutador[0], lutador[1]);

        fight.fight();

    }
}