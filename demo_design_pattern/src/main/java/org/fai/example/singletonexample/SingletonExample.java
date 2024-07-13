package org.fai.example.singletonexample;

public class SingletonExample {
    private static SingletonExample instance;

    public static SingletonExample getInstance() {
       if (instance == null) {
           synchronized (SingletonExample.class){
               if (instance == null) {
                   instance = new SingletonExample();
               }
           }
        }
        return instance;
    }
}
