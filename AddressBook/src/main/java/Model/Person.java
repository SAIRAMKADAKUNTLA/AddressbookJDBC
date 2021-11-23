package Model;

public class Person {
    private String first_name;
    private String last_name;

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_name() {
        return last_name;
    }

    private String city;

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    private String p_no;

    public String getP_no() {
        return p_no;
    }

    public void setP_no(String p_no) {
        this.p_no = p_no;
    }
}
