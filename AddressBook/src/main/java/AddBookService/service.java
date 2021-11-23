package AddBookService;

import Model.Person;
import Repo.AddBookRepo;

import java.sql.SQLException;
import java.util.List;

public class service {
    AddBookRepo addBookRepo=new AddBookRepo();
    public void insertContactToDB(Person person) throws SQLException, ClassNotFoundException {
        addBookRepo.insert(person);
    }
    public void updateContact(Person person) throws SQLException, ClassNotFoundException {
        addBookRepo.update(person);
    }
    public void updateL_name(Person person) throws SQLException, ClassNotFoundException {
        addBookRepo.updateLast_name(person);
    }
    public  void updateC(Person person) throws SQLException, ClassNotFoundException {
        addBookRepo.updateCity(person);
    }
    public  void  deleteContact(Person person) throws SQLException, ClassNotFoundException {
        addBookRepo.delete(person);
    }
    public List<Person> displayAll() throws SQLException, ClassNotFoundException {
        return addBookRepo.display();
    }
    public  Person searchContact(String p_no) throws SQLException, ClassNotFoundException {
        return addBookRepo.search(p_no);
    }
    public List<Person> sortAll() throws SQLException, ClassNotFoundException {
        return addBookRepo.sort();
    }
    public List<Person> sort_Ln() throws SQLException, ClassNotFoundException {
        return addBookRepo.sortByLn();
    }
    public List<Person> sort_cty() throws SQLException, ClassNotFoundException {
        return addBookRepo.sortByC();
    }
    public List<Person> sort_ph() throws SQLException, ClassNotFoundException {
        return addBookRepo.sortByp();
    }


}
