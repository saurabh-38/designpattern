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

     Singleton s1 = Singleton.getInstance(2,5);

        Singleton s2 = Singleton.getInstance(7,5);
        System.out.println(s1.toString());
        System.out.println(s2.toString());


    }
}