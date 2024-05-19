public class PrintService {
    public void print(Gryffindor[] gryffindors){
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Студент "+ gryffindor.getName() + ", сила магии "+ gryffindor.getMagicPower()+ ", рассторяние трансгрессии "+ gryffindor.getTransgression()+ ", благородство " + gryffindor.getNobility() + ", честь " + gryffindor.getHonor()+ ", храбрость "+ gryffindor.getBravery());
        }
        System.out.println();
    }

    public void print(Hufflepuff[] hufflepuffs){
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Студент "+ hufflepuff.getName() + ", сила магии "+ hufflepuff.getMagicPower()+ ", рассторяние трансгрессии "+ hufflepuff.getTransgression()+ ", трудолюбие " + hufflepuff.getDiligence()+ ", верность " + hufflepuff.getLoyalty()+ ", честность "+ hufflepuff.getHonesty());
        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclaws){
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Студент "+ ravenclaw.getName() + ", сила магии "+ ravenclaw.getMagicPower()+ ", рассторяние трансгрессии "+ ravenclaw.getTransgression()+ ", ум " + ravenclaw.getSmart() + ", мудрость " + ravenclaw.getWisdom()+ ", остроумие "+ ravenclaw.getHumor() +", творчество "+ ravenclaw.getCreative());
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins){
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Студент "+ slytherin.getName() + ", сила магии "+ slytherin.getMagicPower()+ ", рассторяние трансгрессии "+ slytherin.getTransgression()+ ", хитрость " + slytherin.getSly() + ", решительность " + slytherin.getDetermination()+ ", амбициозность "+ slytherin.getAmbition() + ", находчивость " + slytherin.getResourcefulness()+ ", жажда власти " + slytherin.getPower());
        }
        System.out.println();
    }
}
