package com.design_pattern.factorypattern.demo3;

interface Car {
    void drive();
}

class BMW implements Car {

    @Override
    public void drive() {

    }
}

class PORSHE implements Car {

    @Override
    public void drive() {

    }
}

class CarFactory {
    Car getCarObj(String car){
        Car carObj = null;
        if(car.equals("BMW")){
            carObj = new BMW();
        }else if(car.equals("PORSHE")){
            carObj = new PORSHE();
        }
        return carObj;
    }
}

public class DemoFactoryEx {
}
