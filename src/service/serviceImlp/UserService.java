package service.serviceImlp;

import model.Book;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserService implements service.UserService {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }



    @Override
    public String createUser(List<User> users) {
     this.users = users;


return "";
    }


    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public User findUserById(Long id) {
        for (User user : users) {
            if (Objects.equals(user.getId(),id)){
                users.add(user);
             return (User)users;
            }
        }

        return null;
    }

    @Override
    public String removeUserByName(String name) {
        return null;
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {

    }

    @Override
    public String buyBooks(String name, List<Book> books) {


            System.out.println(" enter by book name : ");
            String book = new Scanner(System.in).nextLine();
            for (Book book1 : books) {
                if (book1.getName().equals(book)){
                    for (User user : users) {
                        user.getBasket()

                    }
                }
            }

            return " Successfully buy ! ";
        }
    }
}
