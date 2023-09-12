class Account {
    public String name;
    protected String email;

    private String password;

    // getter & setter
    public String getpassword(String password) {
        return this.password;
    }

    public void Setpassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Ritik";
        account1.email = "vermaritik933@gmail.com";
        account1.getpassword("abc");
        System.out.println(account1.getpassword("abcd"));
    }
}
