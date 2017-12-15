package finance.models;

public class User {

    private  String name;
    private  String email;
    private  String password;
    private String liquid;
    private String available;
    private String value;

    public User(){

    }

    public User(String name, String email, String password, String liquid, String city, String available, String value) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.liquid = liquid;
        this.available = available;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLiquid() {
        return liquid;
    }

    public void setLiquid(String liquid) {
        this.liquid = liquid;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

