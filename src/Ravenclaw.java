public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wisdom;
    private int humor;
    private int creative;

    public Ravenclaw(String name, int magicPower, int transgression, int smart, int wisdom, int humor, int creative) {
        super(name, magicPower, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.humor = humor;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getHumor() {
        return humor;
    }

    public int getCreative() {
        return creative;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return ", " +
                "ум " + smart +
                ", мудрость " + wisdom +
                ", остроумие " + humor +
                ", творчество " + creative;
    }
}
