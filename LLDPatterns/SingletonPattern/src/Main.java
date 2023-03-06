public class Main {
    public static void main(String[] args) {
        // Object not created until we call getInstance this is called as lazy instantiation
        Singleton obj = Singleton.getInstance();
    }
}