package com.exercicio2;


public class Testar extends Thread {
    public static void main(String[] args) {
          Testar teste1=new Testar();
          Testar teste2=new Testar();
          Testar teste3=new Testar();
          Testar teste4=new Testar();
          Testar teste5=new Testar();
          teste1.start();
          teste2.start();
          teste3.start();
          teste4.start();
          teste5.start();
          

    }
    
    public void run(){
        Singleton singleton1=Singleton.getObject();
        Singleton singleton2=Singleton.getObject();
        Singleton singleton3=Singleton.getObject();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton3.hashCode());
    }
}
