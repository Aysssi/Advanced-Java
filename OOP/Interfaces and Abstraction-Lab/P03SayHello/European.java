package LabInterfacesAndAbstraction.P03SayHello;

public class European implements Person {
    private String name;

    public European(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
