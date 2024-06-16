package oop.introduction.interfaces;

public class Car implements Brake, Engine{
    @Override
    public void brake() {
        System.out.println("Hello brake");

    }

    @Override
    public void start() {
        System.out.println("Hello start");

    }

    @Override
    public void stop() {
        System.out.println("Hello stop");

    }

    @Override
    public void acc() {
        System.out.println("Hello acc");

    }
}
