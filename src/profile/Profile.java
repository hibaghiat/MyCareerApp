package profile;

public class Profile {
    // Attributes
    private String Name;
    private int Age;
    private String Address;
    private String Email;
    private String Phone;

    private Account account;

    // Constructor/Update Profile
    public Profile(String Name, int Age, String Address, String Email, String Phone, Account account) {
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.Email = Email;
        this.Phone = Phone;
        this.account = account;
    }

    // Behaviour:Update Profile
    public void Update_Profile(String choice, String Update) {
        if (choice.toUpperCase().equals("NAME"))
            this.Name = Update;
        else if (choice.toUpperCase().equals("AGE"))
            this.Age = Integer.parseInt(Update);
        else if (choice.toUpperCase().equals("ADDRESS"))
            this.Address = Update;
        else if (choice.toUpperCase().equals("EMAIL"))
            this.Email = Update;
        else if (choice.toUpperCase().equals("PHONE"))
            this.Phone = Update;

    }

    @Override
    public String toString() {
        return "----Profile---- \nFull Name: " + Name + "\nAge: " + Age + "\nAdress: " + Address + "\nEmail: "
                + Email + "\nPhone: " + Phone + "\n";
    }

    // Getters and setters
    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public Account getAccount() {
        return this.account;
    }
}