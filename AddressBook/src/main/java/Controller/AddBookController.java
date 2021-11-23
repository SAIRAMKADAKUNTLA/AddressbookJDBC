package Controller;

import AddBookService.service;
import Model.Person;

import java.sql.SQLException;
import java.util.List;

public class AddBookController {
    service s=new service();
    public  void  insertContact(String first_name,String last_name,String city,String p_no) throws SQLException, ClassNotFoundException {
        Person person=new Person();
        person.setFirst_name(first_name);
        person.setLast_name(last_name);
        person.setCity(city);
        person.setP_no(p_no);
        s.insertContactToDB(person);
    }
    public  void updateContact(String first_name,String p_no) throws SQLException, ClassNotFoundException {
        Person person=new Person();
        person.setFirst_name(first_name);
        person.setP_no(p_no);
        s.updateContact(person);
    }
    public void updateLast_name(String last_name,String p_no) throws SQLException, ClassNotFoundException {
        Person person=new Person();
        person.setLast_name(last_name);
        person.setP_no(p_no);
        s.updateL_name(person);
    }
    public  void updatecity(String city,String p_no) throws SQLException, ClassNotFoundException {
        Person person=new Person();
        person.setCity(city);
        person.setP_no(p_no);
        s.updateC(person);
    }
    public  void deleteContact(String p_no) throws SQLException, ClassNotFoundException {
        Person person=new Person();
        person.setP_no(p_no);
        s.deleteContact(person);
    }
    public List<Person> displayDB() throws SQLException, ClassNotFoundException {
        return s.displayAll();
    }
    public Person searchCon(String sP_no) throws SQLException, ClassNotFoundException {
        return s.searchContact(sP_no);
    }
    public  List<Person> sort_DB_ByFirstname() throws SQLException, ClassNotFoundException {
        return s.sortAll();
    }
    public  List<Person> sort_DB_ByLastname() throws SQLException, ClassNotFoundException {
        return s.sort_Ln();
    }
    public  List<Person> sort_DB_ByCity() throws SQLException, ClassNotFoundException {
        return s.sort_cty();
    }
    public  List<Person> sort_DB_ByPhone_Number() throws SQLException, ClassNotFoundException {
        return s.sort_ph();
    }
}
