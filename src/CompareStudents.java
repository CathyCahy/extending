public class CompareStudents {
    public void compareStudents(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if (gryffindor1 != null && gryffindor2 != null) {
            int sum1 = gryffindor1.getHonor() + gryffindor1.getNobility() + gryffindor1.getBravery();
            int sum2 = gryffindor2.getHonor() + gryffindor2.getNobility() + gryffindor2.getBravery();
            if (sum1 > sum2) {
                System.out.println(gryffindor1.getName() + " лучший Гриффиндорец, чем " + gryffindor2.getName());
            } else if (sum1 == sum2) {
                System.out.println(gryffindor2.getName() + " и " + gryffindor1.getName() + "одинаково хороши");
            } else System.out.println(gryffindor2.getName() + " лучший Гриффиндорец, чем " + gryffindor1.getName());
        }
    }

    public void compareStudents(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        if (hufflepuff1 != null && hufflepuff2 != null) {
            int sum1 = hufflepuff1.getDiligence() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
            int sum2 = hufflepuff2.getDiligence() + hufflepuff2.getLoyalty() + hufflepuff2.getHonesty();
            if (sum1 > sum2) {
                System.out.println(hufflepuff1.getName() + " лучший Пуффендуец, чем " + hufflepuff2.getName());
            } else if (sum1 == sum2) {
                System.out.println(hufflepuff2.getName() + " и " + hufflepuff1.getName() + "одинаково хороши");
            } else System.out.println(hufflepuff2.getName() + " лучший Пуффендуец, чем " + hufflepuff1.getName());
        }
    }

    public void compareStudents(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        if (ravenclaw1 != null && ravenclaw2 != null) {
            int sum1 = ravenclaw1.getSmart() + ravenclaw1.getWisdom() + ravenclaw1.getHumor() + ravenclaw1.getCreative();
            int sum2 = ravenclaw2.getSmart() + ravenclaw2.getWisdom() + ravenclaw2.getHumor()+ravenclaw2.getCreative();
            if (sum1 > sum2) {
                System.out.println(ravenclaw1.getName() + " лучший Когтевранец, чем " + ravenclaw2.getName());
            } else if (sum1 == sum2) {
                System.out.println(ravenclaw2.getName() + " и " + ravenclaw1.getName() + "одинаково хороши");
            } else System.out.println(ravenclaw2.getName() + " лучший Когтевранец, чем " + ravenclaw1.getName());
        }
    }

    public void compareStudents(Slytherin slytherin1, Slytherin slytherin2) {
        if (slytherin1 != null && slytherin2 != null) {
            int sum1 = slytherin1.getSly() + slytherin1.getDetermination() + slytherin1.getAmbition()+slytherin1.getResourcefulness()+slytherin1.getPower();
            int sum2 = slytherin2.getSly() + slytherin2.getDetermination() + slytherin2.getAmbition()+slytherin2.getResourcefulness()+slytherin2.getPower();
            if (sum1 > sum2) {
                System.out.println(slytherin1.getName() + " лучший Слизеринец, чем " + slytherin2.getName());
            } else if (sum1 == sum2) {
                System.out.println(slytherin2.getName() + " и " + slytherin1.getName() + "одинаково хороши");
            } else System.out.println(slytherin2.getName() + " лучший Слизеринец, чем " + slytherin1.getName());
        }
    }

    public void compareStudents(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if (hogwarts1 != null && hogwarts2 != null) {
            if (hogwarts1.getMagicPower() > hogwarts2.getMagicPower()) {
                System.out.println(hogwarts1.getName() + " обладает бОльшей мощностью магии, чем " + hogwarts2.getName());
            } else if (hogwarts1.getMagicPower() == hogwarts2.getMagicPower()) {
                System.out.println(hogwarts1.getName() + " и " + hogwarts2.getName() + "одинаково хороши в магии");
            } else System.out.println(hogwarts2.getName() + " обладает бОльшей мощностью магии, чем " + hogwarts1.getName());
        }
        if (hogwarts1.getTransgression() > hogwarts2.getTransgression()) {
            System.out.println(hogwarts1.getName() + " обладает бОльшей трансгрессией, чем " + hogwarts2.getName());
        } else if (hogwarts1.getTransgression() == hogwarts2.getTransgression()) {
            System.out.println(hogwarts1.getName() + " и " + hogwarts2.getName() + "одинаково хороши в трансгрессии");
        } else System.out.println(hogwarts2.getName() + " обладает бОльшей трансгрессией, чем " + hogwarts1.getName());

    }
}
