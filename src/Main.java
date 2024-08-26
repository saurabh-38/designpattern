public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
//
//        House h = new House.Builder()
//                .rent(5)
//                .address("delhi")
//                .build();
//      System.out.println(h.toString());
      //adassert 1==2;

        Singleton s1 = Singleton.getInstance("foo");
        Singleton s2 = Singleton.getInstance("bar");
        System.out.println(s1.toString());
        System.out.println(s2.toString());


    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.toString());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.toString());
        }
    }
}