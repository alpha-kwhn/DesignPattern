package Week8;

public class MainClass {
    public static void main(String[] args) {
        boolean isUserLoggedIn= UserManagerService.isUserLoggedIn();
        User user=new UserProxyHandler(isUserLoggedIn).getUser();
        user.checkOut();
    }
}
