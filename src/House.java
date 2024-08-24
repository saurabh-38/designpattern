public class House {

    private final int rent;
    private final String address;

    @Override
    public String toString() {
        return "House{" +
                "rent=" + rent +
                ", address='" + address + '\'' +
                '}';
    }

    private House(Builder builder) {
        this.rent = builder.rent;
        this.address = builder.address;
    }

    //Create static Builder class
    //Create Same Varibale at the parent class
    // Create setter method for variables and return snapshot of static builder class
    // rent,addess method
    //house object ek builder class
    //house contructor (builder class object )
    public static class Builder {

        private int rent;
        private String address;

        public Builder rent(int rent) {
            this.rent = rent;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public House build() {

            return new House(this);
        }
    }


}
