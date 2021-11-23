package Repo;

import Model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddBookRepo {
    String url="jdbc:mysql://localhost:3306/addressbook?useSSL=false";
    String user="root";
    String password="sairam123";
    public void insert(Person person) throws ClassNotFoundException, SQLException {
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String sql= "INSERT INTO addressbook.details (first_name,last_name,city,p_no)" + "VALUES(?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,person.getFirst_name());
        statement.setString(2,person.getLast_name());
        statement.setString(3,person.getCity());
        statement.setString(4,person.getP_no());
        statement.executeUpdate();
    }
    public  void update(Person person) throws ClassNotFoundException, SQLException {
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String sqlupdate = "UPDATE addressbook.details SET first_name=? WHERE p_no=?";
        PreparedStatement statement = connection.prepareStatement(sqlupdate);
        statement.setString(1,person.getFirst_name());
        statement.setString(2,person.getP_no());
        statement.executeUpdate();
    }
    public void updateLast_name(Person person) throws ClassNotFoundException, SQLException {
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String sqlupdate = "UPDATE addressbook.details SET last_name=? WHERE p_no=?";
        PreparedStatement statement = connection.prepareStatement(sqlupdate);
        statement.setString(1,person.getLast_name());
        statement.setString(2,person.getP_no());
        statement.executeUpdate();
    }
    public void updateCity(Person person) throws ClassNotFoundException, SQLException {
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String sqlupdate = "UPDATE addressbook.details SET city=? WHERE p_no=?";
        PreparedStatement statement = connection.prepareStatement(sqlupdate);
        statement.setString(1,person.getCity());
        statement.setString(2,person.getP_no());
        statement.executeUpdate();
    }
    public void delete(Person person) throws ClassNotFoundException, SQLException {
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String sqldelete="DELETE FROM addressbook.details WHERE p_no=?";
        PreparedStatement statement = connection.prepareStatement(sqldelete);
        statement.setString(1,person.getP_no());
        statement.executeUpdate();
    }
    public List<Person> display() throws ClassNotFoundException, SQLException {
        List<Person> personList=new ArrayList<>();
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String dis="SELECT * FROM addressbook.details ";
        Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery(dis);
        while (resultSet.next()){
            Person person=new Person();
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setP_no(resultSet.getString("p_no"));
            personList.add(person);
        }
        return  personList;
    }
    public Person search(String p_no) throws ClassNotFoundException, SQLException {
        Person person = new Person();
        Class.forName("java.sql.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        String srch = "SELECT * FROM addressbook.details WHERE p_no= ?";
        PreparedStatement s = connection.prepareStatement(srch);
        s.setString(1,p_no);
        ResultSet resultSet = s.executeQuery();
        while(resultSet.next()){
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setP_no(resultSet.getString("p_no"));
        }
        return person;
    }
    public List<Person> sort() throws ClassNotFoundException, SQLException {
        List<Person> personList=new ArrayList<>();
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String dis="SELECT * FROM addressbook.details ORDER BY first_name";
        Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery(dis);
        while (resultSet.next()){
            Person person=new Person();
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setP_no(resultSet.getString("p_no"));
            personList.add(person);
        }
        return  personList;
    }
    public List<Person> sortByLn() throws ClassNotFoundException, SQLException {
        List<Person> personList=new ArrayList<>();
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String dis="SELECT * FROM addressbook.details ORDER BY last_name";
        Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery(dis);
        while (resultSet.next()){
            Person person=new Person();
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setP_no(resultSet.getString("p_no"));
            personList.add(person);
        }
        return  personList;
    }
    public List<Person> sortByC() throws ClassNotFoundException, SQLException {
        List<Person> personList=new ArrayList<>();
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String dis="SELECT * FROM addressbook.details ORDER BY city";
        Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery(dis);
        while (resultSet.next()){
            Person person=new Person();
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setP_no(resultSet.getString("p_no"));
            personList.add(person);
        }
        return  personList;
    }
    public List<Person> sortByp() throws ClassNotFoundException, SQLException {
        List<Person> personList=new ArrayList<>();
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String dis="SELECT * FROM addressbook.details ORDER BY p_no";
        Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery(dis);
        while (resultSet.next()){
            Person person=new Person();
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setP_no(resultSet.getString("p_no"));
            personList.add(person);
        }
        return  personList;
    }
}
