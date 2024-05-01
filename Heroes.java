interface Printable {
    void displayInfo();
}

class HeroClass implements Printable {
    private String name;
    private String description;
    private int health;
    private int damage;
    private int speed;

    public HeroClass(String name, String description, int health, int damage, int speed) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayInfo() {
        System.out.println("Name        : " + getName());
        System.out.println("Description : " + getDescription());
        System.out.println("Health      : " + getHealth());
        System.out.println("Damage      : " + getDamage());
        System.out.println("Speed       : " + getSpeed());
    }
}


class Strength extends HeroClass {
    private int armor;

    public Strength(String name, String description, int health, int damage, int speed, int armor) {
        super(name, description, health, damage, speed);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Armor       : " + getArmor());
    }
}


class Agility extends HeroClass {
    private double criticalhit;

    public Agility(String name, String description, int health, int damage, int speed, double criticalhit) {
        super(name, description, health, damage, speed);
        this.criticalhit = criticalhit;
    }

    public double getCriticalHit() {
        return criticalhit;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Critical Hit    : " + getCriticalHit());
    }
}

class Intelligence extends HeroClass {
    private int magicdamage;

    public Intelligence(String name, String description, int health, int damage, int speed, int magicdamage){
        super(name, description, health, damage, speed);
        this.magicdamage = magicdamage;
    }

    public int getMagicDamage() {
        return magicdamage;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Magic Damage    : " + getMagicDamage());
    }
}

public class Heroes {
    public static void printHeroesInfo(Printable printable) {
        printable.displayInfo();
    }

    public static void main(String[] args) {
    
        Strength Axe = new Strength(
            "Axe",
            "One after another, Axe cuts down his foes. Marching ahead of his team, he locks his enemies in battle then counters their blows with a deadly spin of his weapon. Slamming his culling blade through a weakened enemy, he is always charging onward.",
            500,
            10,
            5,
            10
        );

        Agility Juggernaut  = new Agility(
            "Juggernaut",
            "In a flurry of slashes, Juggernaut cuts down his foes. Sprinting and spinning into battle with reckless abandon, and nearly invincible once he is able to begin his assault, stopping Juggernaut can often be just as difficult as surviving him.",
            350,
            20,
            10,
            20
        );

        Intelligence Rubick = new Intelligence(
            "Rubick",
            "Always seeking a new spell to steal, Rubick is ever eager to turn an enemy's most unique advantage against them. Snatching his enemies into the air to fling them where he will, he has no trouble sowing chaos among careless foes.",
            100,
            5,
            5,
            50
        );

        System.out.println("===Heroes===");
        System.out.println("\n===Strenght===");
        printHeroesInfo(Axe);
        System.out.println("\n===Agility===");
        printHeroesInfo(Juggernaut);
        System.out.println("\n===Intelligence===");
        printHeroesInfo(Rubick);
    }
}