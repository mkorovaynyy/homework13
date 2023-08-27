import java.util.Comparator;
import java.util.Random;

public class Cogtevran extends Hogwarts implements Comparator<Cogtevran> {
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

    @Override
    public int compare(Cogtevran o1, Cogtevran o2) {
        int sum1 = o1.getCreativity() + o1.getMind() + o1.getWisdom();
        int sum2 = o2.getCreativity() + o2.getMind() + o2.getWisdom();
        if(sum1 > sum2) {
            System.out.println(o1.getName() + " лучший Когтевранец, чем " + o2.getName());
            return 1;
        } else if (sum1 == sum2) {
            System.out.println(o1.getName() + " и " + o2.getName() + " одинаковые когтевранцы");
            return 0;
        } else {
            System.out.println(o2.getName() + " лучший Когтевранец, чем " + o1.getName());
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
