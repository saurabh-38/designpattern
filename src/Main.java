public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        House h = new House.Builder()
                .rent(5)
                .address("delhi")
                .build();
      System.out.println(h.toString());
      //adassert 1==2;


    }
}