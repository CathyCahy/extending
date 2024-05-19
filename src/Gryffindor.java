public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public Gryffindor(String name, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
//    public void compareStudents(Gryffindor gryffindor1, Gryffindor gryffindor2) {
//        if (gryffindor1 != null && gryffindor2 != null) {
//            int sum1 = gryffindor1.getMagicPower() + gryffindor1.getTransgression() + gryffindor1.getHonor() + gryffindor1.getNobility() + gryffindor1.getBravery();
//            int sum2 = gryffindor2.getMagicPower() + gryffindor2.getTransgression() + gryffindor2.getHonor() + gryffindor2.getNobility() + gryffindor2.getBravery();
//            if (sum1 > sum2) {
//                System.out.println(gryffindor1.getName() + " лучший Гриффиндорец, чем " + gryffindor2.getName());
//            } else if (sum1 == sum2) {
//                System.out.println(gryffindor2.getName() + " и " + gryffindor1.getName() + "одинаково хороши");
//            } else System.out.println(gryffindor2.getName() + " лучший Гриффиндорец, чем " + gryffindor1.getName());
//        }
//    }

}


