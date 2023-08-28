import java.util.Comparator;

public class Grifindor extends Hogwarts implements Comparable<Grifindor> {
    private int nobility;
    private int honor;
    private int bravery;

    public Grifindor(String name, int spellPower, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(name, spellPower, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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

    public int calculateProperties(Grifindor grifindor) {
        return grifindor.getHonor() + grifindor.getBravery() + grifindor.getNobility();
    }

    @Override
    public int compareTo(Grifindor o) {
        int sum1 = calculateProperties(this);
        int sum2 = o.getNobility() + o.getBravery() + o.getHonor();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Грифиндорец, чем " + o.getName());
            return 1;
        } else if (sum1 == sum2) {
            System.out.println(this.getName() + " и " + o.getName() + " одинаковые грифиндорцы");
            return 0;
        } else {
            System.out.println(o.getName() + " лучший Грифиндорец, чем " + this.getName());
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Имя: " + this.getName() +
                "сила магии=" + this.getSpellPower() +
                "дистанция трансгрессирования=" + this.getDistanceOfTransgression() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
