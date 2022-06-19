package Week8;

class AuthorizedUser implements User {
    @Override
    public void checkOut() {
        System.out.print("checking out...");
    }
}
