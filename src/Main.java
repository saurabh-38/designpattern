public class Main {
    public static void main(String[] args) {

        Thread s1= new Thread(new ThreadFoo());
        Thread s2 = new Thread(new ThreadBar());
        s1.start();
        s2.start();
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        //create two thread and got two different output
        //


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