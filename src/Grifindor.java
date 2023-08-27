import java.util.Comparator;

public class Grifindor extends Hogwarts implements Comparator<Grifindor> {
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

    @Override
    public int compare(Grifindor o1, Grifindor o2) {
        int sum1 = o1.getNobility() + o1.getBravery() + o1.getHonor();
        int sum2 = o2.getNobility() + o2.getBravery() + o2.getHonor();
        if(sum1 > sum2) {
            System.out.println(o1.getName() + " лучший Грифиндорец, чем " + o2.getName());
            return 1;
        } else if (sum1 == sum2) {
            System.out.println(o1.getName() + " и " + o2.getName() + " одинаковые грифиндорцы");
            return 0;
        } else {
            System.out.println(o2.getName() + " лучший Грифиндорец, чем " + o1.getName());
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
