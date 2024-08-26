public class Singleton {
    //

    private String value;
    private static Singleton instance;

    private  Singleton(String value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "value='" + value + '\'' +
                '}';
    }

    public static synchronized Singleton getInstance(String value) {
        if(instance==null){ //this is race condition in out singleton desgin pattern
            instance=new Singleton(value);
        }
        return instance;
    }
}
