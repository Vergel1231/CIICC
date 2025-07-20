interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Feeding the gorilla.");
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Trying to pet the gorilla.");
    }

    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        g.feed(true);
        g.groom();
        g.pet();
    }
}
