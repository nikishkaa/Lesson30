package by.itstep.goutor.javalesson.lesson30;

public interface Eatable {
    int SIZE = 10;

    void eat();


    // Since JDK 8.0
    default int sum(int a, int b) {
        return a + b;
    }


    // Since JDK 8.0
    public static void main(String[] args) {

    }

    // Since JDK 9.0
    // private static final int COUNT = 10;


    private void test() {

    }

    class Switcher implements Eatable {
        @Override
        public void eat() {

        }
    }


}
