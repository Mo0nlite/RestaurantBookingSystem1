import java.time.LocalTime;
import java.time.LocalDate;
import java.util.List;

public class Rest {

    public class User {

        // Зазначено модифікатор private тому, що firstName, lastName, email, phone є особистою інформацією користувача
        private String firstName;
        private String lastName;
        private String email;
        private String phone;

        // Конструктор для класу User
        // Визначено модифікатор public, оскільки клас User повинен бути доступний з будь-якого місця програми.
        public User(String firstName, String lastName, String email, String phone) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phone = phone;
        }

        public void chooseTable(String firstName, String lastName) {
            // Логіка вибору столика
        }

        public void changeBooking(String email) {
            // Логіка зміни бронювання
        }

        public void cancelBooking(String phone) {
            // Логіка скасування бронювання
        }
    }

    public interface BookingSystem {
        void provideBookingOption();
        void initiateBookingProcess();
        void notifyTableAvailability();
    }

    public class RestaurantBookingSystem implements BookingSystem {

        // Зазначено модифікатор private, щоб забезпечити контроль доступу до списку ресторанів, списку користувачів, списку бронювань та доступу до параметрів системи
        private List<Restaurant> restaurants;
        private List<User> users;
        private List<Reservation> reservations;
        private SystemParameters systemParameters;

        // Конструктор для класу RestaurantBookingSystem
        // Визначено модифікатор public, оскільки клас RestaurantBookingSystem повинен бути доступний з будь-якого місця програми.
        public RestaurantBookingSystem(List<Restaurant> restaurants, List<User> users, List<Reservation> reservations, SystemParameters systemParameters) {
            this.restaurants = restaurants;
            this.users = users;
            this.reservations = reservations;
            this.systemParameters = systemParameters;
        }

        @Override
        public void provideBookingOption() {
            // Логіка надання можливості бронювання
        }

        @Override
        public void initiateBookingProcess() {
            // Логіка ініціювання процесу бронювання
        }

        @Override
        public void notifyTableAvailability() {
            // Логіка повідомлення про наявність столиків
        }
    }

    public class Restaurant {

        // Зазначено модифікатор private тому, що name, address  та  numberOfTables  є основною інформацією про ресторан
        private String name;
        private String address;
        private int numberOfTables;

        // Конструктор для класу Restaurant
        // Визначено модифікатор public, оскільки клас Restaurant повинен бути доступний з будь-якого місця програми.
        public Restaurant(String name, String address, int numberOfTables) {
            this.name = name;
            this.address = address;
            this.numberOfTables = numberOfTables;
        }

        public void updateTables() {
            // Логіка оновлення столиків
        }

        public void reserveTable() {
            // Логіка резервування столика
        }
    }

    public class Table {

        // Зазначено модифікатор private тому, що isOccupied, number та capacity (Вільність, номер та місця)є внутрішньою властивістю столика
        private boolean isOccupied;
        private int number;
        private int capacity;

        // Конструктор для класу Table
        // Визначено модифікатор public, оскільки клас Table повинен бути доступний з будь-якого місця програми.
        public Table(boolean isOccupied, int number, int capacity) {
            this.isOccupied = isOccupied;
            this.number = number;
            this.capacity = capacity;
        }

        public void markAsOccupied() {
            // Логіка позначення як зайнятий
        }

        public void markAsFree() {
            // Логіка позначення як вільний
        }
    }

    public class Reservation {

        // Зазначено модифікатор private тому, що date, time, table, confirmed є внутрішньою властивістю бронювання
        private LocalDate date;
        private LocalTime time;
        private Table table;
        private boolean confirmed;

        // Конструктор для класу Reservation
        // Визначено модифікатор public, оскільки клас Reservation повинен бути доступний з будь-якого місця програми
        public Reservation(LocalDate date, LocalTime time, Table table, boolean confirmed) {
            this.date = date;
            this.time = time;
            this.table = table;
            this.confirmed = confirmed;
        }

        public void confirmReservation() {
            // Логіка підтвердження бронювання
        }

        public void cancelReservation() {
            // Логіка скасування бронювання
        }

        public void automaticallyMarkConfirmation() {
            // Логіка автоматичного позначення підтвердження
        }
    }

    public class SystemParameters {

        // Зазначено модифікатор private тому, що versionInfo та lastUpdateDate  є конфіденційною інформацією системи
        private String versionInfo;
        private LocalDate lastUpdateDate;

        // Конструктор для класу SystemParameters
        // Визначено модифікатор public, оскільки клас SystemParameters може бути використаний з будь-якої точки програми
        public SystemParameters(String versionInfo, LocalDate lastUpdateDate) {
            this.versionInfo = versionInfo;
            this.lastUpdateDate = lastUpdateDate;

        }
    }

    public class Main {
        public static void main(String[] args) {
            // Створення об'єктів класів
            User user1 = new User("John", "Smith", "johnsmith@gmil.com", "380123456789");
            Restaurant restaurant1 = new Restaurant("Restaurant Abamma", "Вулиця Тараса Шевченко 3", 10);
            Table table1 = new Table(false, 1, 4);
            LocalDate currentDate = LocalDate.now();
            SystemParameters parameters = new SystemParameters("1.0", currentDate);


        }
    }


}
