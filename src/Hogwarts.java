import java.util.Random;

public abstract class Hogwarts {
    private String name;
    private int spellPower;
    private int distanceOfTransgression;

    public Hogwarts(String name, int spellPower, int distanceOfTransgression) {
        this.name = name;
        this.spellPower = spellPower;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public String getName() {
        return name;
    }
    public int toCompareHogvartsStudents(Hogwarts o1, Hogwarts o2) {
        int sum1 = o1.getDistanceOfTransgression()+ o1.getSpellPower();
        int sum2 = o2.getDistanceOfTransgression()+ o2.getSpellPower();
        if(sum1 > sum2) {
            System.out.println(o1.getName() + " лучший Хогвартианец, чем " + o2.getName());
            return 1;
        } else if (sum1 == sum2) {
            System.out.println(o1.getName() + " и " + o2.getName() + " одинаковые Хогвартианцы");
            return 0;
        } else {
            System.out.println(o2.getName() + " лучший Хогвартианец, чем " + o1.getName());
            return -1;
        }
    }
}
