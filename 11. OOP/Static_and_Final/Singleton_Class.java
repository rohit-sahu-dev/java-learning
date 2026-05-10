package Static_and_Final;

class Singleton {

    // single object
    private static Singleton instance = new Singleton();

    // private constructor
    private Singleton() {
        System.out.println("Object created");
    }

    // global access method
    public static Singleton getInstance() {
        return instance;
    }
}

public class Singleton_Class {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        //  Both references point to SAME object

        System.out.println(s1 == s2);
    }
}
