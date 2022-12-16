import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import service.serviceImlp.BookService;
import service.serviceImlp.UserService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static BookService bookService=new BookService();
    private static UserService userService = new UserService();

        }
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.
        User user = new User(1L, "Samira", "Nurmat kyzy ", "samira@gmail", "1212121", Gender.FEMALE, BigDecimal.valueOf(11));
        User user1 = new User(2L, "Saikal", "Muratova ", "saikal@gmail", "1223456", Gender.FEMALE, BigDecimal.valueOf(10));
        User user2 = new User(3L, "Samara", "Nurlanova ", "samara@gmail", "1234567", Gender.FEMALE, BigDecimal.valueOf(12));
        User user3 = new User(4L, "Syimyk", "Nurlanova ", "samara@gmail", "1234567", Gender.MALE, BigDecimal.valueOf(12));
        User user4 = new User(5L, "alym", "Nurlanov ", "samara@gmail", "1234567", Gender.MALE, BigDecimal.valueOf(12));

        List<Book>books=new ArrayList<>(Arrays.asList(
                new Book(1L,"after", Genre.ROMANCE,BigDecimal.valueOf(12),"Samira", Language.ENGLISH, LocalDate.of(2012,8,4)),
                new Book(1L,"fatal gift",Genre.FANTASY, BigDecimal.valueOf(55),"Alinur",Language.RUSSIAN,LocalDate.of(2011,4,8)),
                 new Book(2L,"Fate according to the book of changes",Genre.ROMANCE,BigDecimal.valueOf(34),"Saikal",Language.ENGLISH,LocalDate.of(2009,5,9)),
                 new Book(3L,"Биринчи мугалим",Genre.HISTORICAL,BigDecimal.valueOf(23),"Чынгыз Айтматов",Language.KYRGYZ,LocalDate.of(2006,6,9)),
                 new Book(4L,"fatal gift",Genre.DETECTIVE,BigDecimal.valueOf(22),"Samara",Language.RUSSIAN,LocalDate.of(2014,8,8)),
                 new Book(5L,"Выбор. О свободе ",Genre.ROMANCE,BigDecimal.valueOf(34),"Ali",Language.RUSSIAN,LocalDate.of(2018,3,2))


        new User(1L,"Samira","Nurmat kyzy ","samira@gmail","1212121", Gender.FEMALE,BigDecimal.valueOf(11)
        );

        List<User> users=new ArrayList<>(Arrays.asList(
              user,user1,user2,user3,user4));




    }
}