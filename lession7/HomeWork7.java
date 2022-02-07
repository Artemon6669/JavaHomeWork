class HomeWork7 {
    public static void main (String[] args) {
        Cat[] cats = {
            new Cat("Kot" , 15), new Cat("Murzik", 10), new Cat("Vasily", 20)
        };
        Plate plate = new Plate(50, 20);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(30);
        System.out.println(plate);

        for (Cat cat :cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }


    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public void setFullness(boolean status) {
        fullness = status;
    }

    public void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }



    @Override
    public String toString() {
        return "name: " + name + ", appetite: " + appetite + ", fullness: " + fullness;
    }
}

class Plate {
    private int food;
    private int volume;

    Plate(int volume, int food ) {
        this.food = food;
        this.volume = volume;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}