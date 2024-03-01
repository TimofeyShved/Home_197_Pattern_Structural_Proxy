package com.company;

public class Main {

    public static void main(String[] args) {
        // Паттерн надстройки над кодом, когда нужно сделать что-то ещё помимо основного кода
        ICar car = new CarProxy();
        car.drive();
    }
}

// обычный код
interface ICar {
    void drive();
}

class Reno implements ICar{
    @Override
    public void drive() {
        System.out.println("drive reno");
    }
}

// надстройка (прокси)
class CarProxy implements ICar{
    ICar car = new Reno();

    @Override
    public void drive() {
        System.out.println("proxy work");
        car.drive();
    }
}
