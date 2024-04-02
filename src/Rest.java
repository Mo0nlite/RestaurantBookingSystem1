import java.time.LocalTime;
import java.time.LocalDate;
import java.util.List;

public class Rest {

    public class User {
        private String firstName;
        private String lastName;
        private String email;
        private String phone;

        // Конструктор для класу User
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
        private List<Restaurant> restaurants;
        private List<User> users;
        private List<Reservation> reservations;
        private SystemParameters systemParameters;

        // Конструктор для класу RestaurantBookingSystem
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
        private String name;
        private String address;
        private int numberOfTables;

        // Конструктор для класу Restaurant
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
        private boolean isOccupied;
        private int number;
        private int capacity;

        // Конструктор для класу Table
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
        private LocalDate date;
        private LocalTime time;
        private Table table;
        private boolean confirmed;

        // Конструктор для класу Reservation
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
        private String versionInfo;
        private LocalDate lastUpdateDate;

        // Конструктор для класу SystemParameters
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
