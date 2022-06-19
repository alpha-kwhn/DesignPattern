//2017112071 김응관
package Week9.P2;

public class User {
    private String firstName;    //required
    private String lastName;    //required
    private int age;    //optional
    private String phone;    //optional
    private String address;    //optional

    public User(Builder builder){
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        phone = builder.phone;
        address = builder.address;
    }

    public static class Builder {
        private String firstName;    //required
        private String lastName;    //required
        private int age;    //optional
        private String phone;    //optional
        private String address;    //optional

        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
