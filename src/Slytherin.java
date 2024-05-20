public class Slytherin extends Hogwarts{
    private int sly;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;
    public Slytherin(String name, int magicPower, int transgression, int sly, int determination, int ambition, int resourcefulness, int power) {
        super(name, magicPower, transgression);
        this.sly  = sly;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getSly() {
        return sly;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setSly(int sly) {
        this.sly = sly;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return ", " +
                "хитрость " + sly +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + power;
    }
}
