package kpi.iasa;

public class FactoryMethod {
    public static void main(String[] args) {
        CarMaker carMaker=getCarMakerByName("Smth");
        Car car=carMaker.makeCar();
        car.move();



    }
    public static CarMaker getCarMakerByName(String name){
        if (name.equals("Ford"))
            return new FordMaker();
        else if (name.equals("Opel"))
            return new OpelMaker();
        throw new RuntimeException("No such type of car");
    }

}


interface Car{
    public void move();
}

class Opel implements Car{

    @Override
    public void move() {
        System.out.println("Opel is moving");
    }
}

class Ford implements Car{

    @Override
    public void move() {
        System.out.println("Ford is moving");
    }
}

interface CarMaker{
    public Car makeCar();
}

class OpelMaker implements CarMaker{

    @Override
    public Car makeCar() {
        return new Opel();
    }
}

class FordMaker implements CarMaker{

    @Override
    public Car makeCar() {
        return new Ford();
    }
}