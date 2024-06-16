package oop.introduction.interfaces;

public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Start music");

    }

    @Override
    public void stop() {
        System.out.println("Stop music");
    }
}
