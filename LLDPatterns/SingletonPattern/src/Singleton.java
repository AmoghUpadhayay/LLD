public class Singleton {
    private static Singleton obj;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(obj == null){
            // to make thread safe
            synchronized (Singleton.class){
                // check again as multiple threads can reach above step
                if(obj == null){
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }
}
