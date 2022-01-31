package beginner.com;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 25;
        int y;

        y = --x; // Pre decrement x=24
        System.out.println("y = " + x);

        y = x--; // Post decrement x=24
        System.out.println("y = " + x);

        y = ++x; // Pre increment x=24
        System.out.println("y = " + x);

        y = x++; // Post increment x=24
        System.out.println("y = " + x);

    }
}
