package Week8;

public class UserProxyHandler implements UserProxy{
    private boolean isLoggedIn;

    UserProxyHandler(boolean isloggedIn){
        isLoggedIn = isloggedIn;
    }

    public User getUser(){
        User user;
        if(isLoggedIn) {
            user = new AuthorizedUser();
        }
        else{
            user = new GuestUser();
        }
        return user;
    }
}
