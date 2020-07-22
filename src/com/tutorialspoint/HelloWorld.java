package com.tutorialspoint;

public class HelloWorld {

    private String message;

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void initMth(){
        System.out.println("init method : " + message);
    }

    public void destory(){
        System.out.println("destory method : " + message);
    }
}
