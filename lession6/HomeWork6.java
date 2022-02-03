/**
 * Java 1. Homework 6
 *
 * @author Artem N
 * version 03.02.2022
 */
class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat(100);
        Dog dog = new Dog(300, 10);
        Dog Super_dog = new Dog(600, 100);
        IAnimal[] animals = {cat, dog , Super_dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(400));
            System.out.println(animal.swim(5));
            System.out.println(animal.run(50));
            System.out.println(animal.swim(15));
        }
        System.out.println(Animal.countOfAnimals);
    }
}

abstract class Animal implements IAnimal{
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int countOfAnimals = 0;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + " не может бежать " + distance;
        } else {
            return className + " Может бежать " +distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > runLimit) {
            return className + " Не может плыть " + distance;
        } else {
            return className + " Может плыть " +distance;
        }
    }

    @Override
    public String toString() {
        return className + " Сколько может бежать: " + runLimit + ", сколько может плыть " + swimLimit;
    }
}

class Dog extends Animal {
    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

class Cat extends Animal {
    Cat(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    Cat(int runLimit) {
        super(runLimit, -1);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + " не может плыть ";
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}