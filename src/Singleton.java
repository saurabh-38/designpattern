public class Singleton {
    //

    private int a;
    private int b;
    private static Singleton instance;

    private  Singleton(int a,int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static Singleton getInstance(int a, int b) {
        if(instance==null){
            instance=new Singleton(a,b);
        }else{
            instance.a=a;
            instance.b=b;
        }
        return instance;
    }
}
