import java.util.Comparator;

public class Slizerin extends Hogwarts implements Comparable<Slizerin> {
    private int trick;
    private int determination;
    private int ambition;

    public Slizerin(String name, int spellPower, int distanceOfTransgression, int trick, int determination, int ambition) {
        super(name, spellPower, distanceOfTransgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int calculateProperties(Slizerin slizerin) {
        return slizerin.getTrick() + slizerin.getDetermination() + slizerin.getAmbition();
    }
    @Override
    public int compareTo(Slizerin o) {
        int sum1 = calculateProperties(this);
        int sum2 = calculateProperties(o);
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + o.getName());
            return 1;
        } else if (sum1 == sum2) {
            System.out.println(this.getName() + " и " + o.getName() + " одинаковые Слизеренцы");
            return 0;
        } else {
            System.out.println(o.getName() + " лучший Слизеринец, чем " + this.getName());
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Имя: " + this.getName() +
                "сила магии=" + this.getSpellPower() +
                "дистанция трансгрессирования=" + this.getDistanceOfTransgression() +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                '}';
    }
}
