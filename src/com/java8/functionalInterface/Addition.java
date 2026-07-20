package com.java8.functionalInterface;

@FunctionalInterface
public interface Addition {

    void Add(int a, int b);

}

class Main{

    //traditional way using the anonymous class
    Addition addition = new Addition() {
        @Override
        public void Add(int a, int b) {
            int res = a + b;
            System.out.println("res = " + res);
        }
    };

    //By using the lambda expression
    Addition add1 = (a,b) -> {
        int res = a + b;
        System.out.println("res = " + res);
    };

    public static void main(String[] args) {
        Main main = new Main();
        main.addition.Add(11,55);

        main.add1.Add(44,55);
    }

}
