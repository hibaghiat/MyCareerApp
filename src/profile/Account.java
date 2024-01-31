package profile;

public class Account {
    // Attributes
    private String Login;
    private String Password;

    // Constructor
    public Account(String Login, String Password) {
        this.Login = Login;
        this.Password = Password;
    }

    public boolean Authenticate(String Login, String Password) throws FailedLoginException {
        if (this.Login.equals(Login) && this.Password.equals(Password)) {
            return true;
        } else {
            throw new FailedLoginException();
        }
    }

    // get/set Password
    public String getPass() {
        return this.Password;
    }

    public void Change_Pass(String Password) {
        this.Password = Password;
    }

    // get/set Login
    public String getLogin() {
        return this.Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
    // Methods: change pass, Authenticate

    @Override
    public String toString() {
        return "Login: " + Login + "\tPassword: " + Password;
    }

}