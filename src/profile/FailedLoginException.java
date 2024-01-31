package profile;

public class FailedLoginException extends Exception {
    public FailedLoginException() {
        super("FailedLoginException: Wrong username or password");
    }
}
