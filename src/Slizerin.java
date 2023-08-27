import java.util.Comparator;

public class Slizerin extends Hogwarts implements Comparator<Slizerin> {
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

    @Override
    public int compare(Slizerin o1, Slizerin o2) {
        int sum1 = o1.getAmbition() + o1.getDetermination() + o1.getTrick();
        int sum2 = o2.getAmbition() + o2.getDetermination() + o2.getTrick();
        if (sum1 > sum2) {
            System.out.println(o1.getName() + " лучший Слизеринец, чем " + o2.getName());
            return 1;
        } else if (sum1 == sum2) {
            System.out.println(o1.getName() + " и " + o2.getName() + " одинаковые Слизеренцы");
            return 0;
        } else {
            System.out.println(o2.getName() + " лучший Слизеринец, чем " + o1.getName());
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
