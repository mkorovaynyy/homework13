import java.util.Comparator;

public class Pufenduj extends Hogwarts implements Comparator<Pufenduj> {
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

    @Override
    public int compare(Pufenduj o1, Pufenduj o2) {
        int sum1 = o1.getHonesty() + o1.getIndustriousness() + o1.getLoyalty();
        int sum2 = o2.getHonesty() + o2.getIndustriousness() + o2.getLoyalty();
        if (sum1 > sum2) {
            System.out.println(o1.getName() + " лучший Пуффендуец, чем " + o2.getName());
            return 1;
        } else if (sum1 == sum2) {
            System.out.println(o1.getName() + " и " + o2.getName() + " одинаковые Пуфендуйцы");
            return 0;
        } else {
            System.out.println(o2.getName() + " лучший Пуффендуец, чем " + o1.getName());
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
