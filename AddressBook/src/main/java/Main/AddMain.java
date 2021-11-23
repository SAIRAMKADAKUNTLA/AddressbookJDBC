package Main;

import Controller.AddBookController;
import Model.Person;

import java.sql.SQLException;
import java.util.Scanner;

public class AddMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        int choice;
       do{
           Scanner s=new Scanner(System.in);
           System.out.println("enter your choice");
           System.out.println("1 for insert");
           System.out.println("2 for update");
           System.out.println("3 for delete");
           System.out.println("4 for display");
           System.out.println("5 for searching");
           System.out.println("6 for sorting");
           System.out.println("0 for exit");
           AddBookController controller=new AddBookController();
           choice=s.nextInt();
           switch (choice) {
               case 1:
                   System.out.println("your in insert operation");
                   System.out.println("enter the firstname to insert");
                   String first_name = s.next();
                   System.out.println("enter the lastname to insert");
                   String last_name = s.next();
                   System.out.println("enter the city to insert");
                   String city = s.next();
                   System.out.println("enter the p_no to insert");
                   String p_no = s.next();
                   controller.insertContact(first_name, last_name, city, p_no);
                   break;
               case 2:
                   System.out.println("your in update operation");
                   int updateChoice;
                   do{
                   System.out.println("enter your choice to update");
                   System.out.println("1 for update first name");
                   System.out.println("2 for update last name");
                   System.out.println("3 for update city");
                   System.out.println("0 for exit");
                   updateChoice=s.nextInt();
                       switch (updateChoice){
                           case 1:
                               System.out.println("enter the P_NO name to edit");
                               String Up_no = s.next();
                               System.out.println("enter new first name");
                               String Ufirst_name = s.next();
                               controller.updateContact(Ufirst_name, Up_no);
                               break;
                           case 2:
                               System.out.println("enter the P_NO name to edit");
                               String Lp_no = s.next();
                               System.out.println("enter new last name");
                               String Last_name = s.next();
                               controller.updateLast_name(Last_name,Lp_no);
                               break;
                           case 3:
                               System.out.println("enter the P_NO name to edit");
                               String Cp_no = s.next();
                               System.out.println("enter new last name");
                               String cityy = s.next();
                               controller.updatecity(cityy,Cp_no);
                               break;
                       }
                   }while(updateChoice != 0);
                   break;

               case 3:
                   System.out.println("your in delete operation");
                   System.out.println("enter the p_no to delete data");
                   String dP_no = s.next();
                   controller.deleteContact(dP_no);
                   break;
               case 4:
                   System.out.println("the total db is :");
                   for(Person each : controller.displayDB()){
                       System.out.println("first name - "+each.getFirst_name());
                       System.out.println("last name - "+each.getLast_name());
                       System.out.println("city - "+each.getCity());
                       System.out.println("p_no - "+each.getP_no());
                       System.out.println();
                   }
                   break;
               case 5:
                   System.out.println("enter the p_no to get details of contact");
                   String sP_no=s.next();
                   System.out.println("get contact details");
                   Person person = controller.searchCon(sP_no);
                       System.out.println("first name - " + person.getFirst_name());
                       System.out.println("last name - " + person.getLast_name());
                       System.out.println("city - " + person.getCity());
                       System.out.println("phone number - " + person.getP_no());
                       System.out.println();
               case 6:
                   int sortChoice;
                   do{
                       System.out.println("enter your choice of sorting");
                       System.out.println("1 to sort by first name");
                       System.out.println("2 to sort by last name");
                       System.out.println("3 to sort by  city");
                       System.out.println("4 to sort by phone number");
                       System.out.println("0 to exit sorting");
                       sortChoice=s.nextInt();
                       switch (sortChoice){
                           case 1:
                               for(Person each : controller.sort_DB_ByFirstname()){
                                   System.out.println("first name - "+each.getFirst_name());
                                   System.out.println("last name - "+each.getLast_name());
                                   System.out.println("city - "+each.getCity());
                                   System.out.println("p_no - "+each.getP_no());
                                   System.out.println();
                               }
                               break;
                           case 2:
                               for(Person each : controller.sort_DB_ByLastname()){
                                   System.out.println("first name - "+each.getFirst_name());
                                   System.out.println("last name - "+each.getLast_name());
                                   System.out.println("city - "+each.getCity());
                                   System.out.println("p_no - "+each.getP_no());
                                   System.out.println();
                               }
                               break;
                           case 3:
                               for(Person each : controller.sort_DB_ByCity()){
                                   System.out.println("first name - "+each.getFirst_name());
                                   System.out.println("last name - "+each.getLast_name());
                                   System.out.println("city - "+each.getCity());
                                   System.out.println("p_no - "+each.getP_no());
                                   System.out.println();
                               }
                               break;
                           case 4:
                               for(Person each : controller.sort_DB_ByPhone_Number()){
                                   System.out.println("first name - "+each.getFirst_name());
                                   System.out.println("last name - "+each.getLast_name());
                                   System.out.println("city - "+each.getCity());
                                   System.out.println("p_no - "+each.getP_no());
                                   System.out.println();
                               }
                               break;
                       }
                   }while(sortChoice != 0);
           }
       } while(choice !=0);
    }
}
