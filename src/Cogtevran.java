import java.util.Comparator;
import java.util.Random;

public class Cogtevran extends Hogwarts implements Comparable<Cogtevran> {
    private int mind;
    private int wisdom;
    private int creativity;

    public Cogtevran(String name, int spellPower, int distanceOfTransgression, int mind, int wisdom, int creativity) {
        super(name, spellPower, distanceOfTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreativity() {
        return creativity;
    }
    public int calculateProperties(Cogtevran cogtevran) {
        return cogtevran.getCreativity() + cogtevran.getMind() + cogtevran.getWisdom();
    }
    @Override
    public int compareTo(Cogtevran o) {
        int sum1 = calculateProperties(this);
        int sum2 = calculateProperties(o);
        if(sum1 > sum2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + o.getName());
            return 1;
        } else if (sum1 == sum2) {
            System.out.println(this.getName() + " и " + o.getName() + " одинаковые когтевранцы");
            return 0;
        } else {
            System.out.println(o.getName() + " лучший Когтевранец, чем " + this.getName());
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Имя: " + this.getName() +
                "сила магии=" + this.getSpellPower() +
                "дистанция трансгрессирования=" + this.getDistanceOfTransgression() +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", creativity=" + creativity +
                '}';
    }
}
