import java.util.Comparator;

public class Pufenduj extends Hogwarts implements Comparable<Pufenduj> {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Pufenduj(String name, int spellPower, int distanceOfTransgression, int industriousness, int loyalty, int honesty) {
        super(name, spellPower, distanceOfTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public int calculateProperties(Pufenduj pufenduj) {
        return pufenduj.getLoyalty() + pufenduj.getLoyalty() + pufenduj.getIndustriousness();
    }
    @Override
    public int compareTo(Pufenduj o) {
        int sum1 = calculateProperties(this);
        int sum2 = o.getHonesty() + o.getIndustriousness() + o.getLoyalty();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + o.getName());
            return 1;
        } else if (sum1 == sum2) {
            System.out.println(this.getName() + " и " + o.getName() + " одинаковые Пуфендуйцы");
            return 0;
        } else {
            System.out.println(o.getName() + " лучший Пуффендуец, чем " + this.getName());
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Имя: " + this.getName() +
                "сила магии=" + this.getSpellPower() +
                "дистанция трансгрессирования=" + this.getDistanceOfTransgression() +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
