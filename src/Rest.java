import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Rest {

    public static class Main {
        public static void main(String[] args) {
            User user1 = new User("John", "Smith", "johnsmith@gmil.com", "380123456789");
            Restaurant restaurant1 = new Restaurant("Restaurant Abamma", "Вулиця Тараса Шевченко 3", 10);
            Table table1 = new Table(false, 1, 4);
            LocalDate currentDate = LocalDate.now();
            SystemParameters parameters = new SystemParameters("1.0", currentDate);

            // Виклик статичних полів і методів
            System.out.println("Total restaurants: " + RestaurantBookingSystem.totalRestaurants);
            System.out.println("Total tables: " + Table.totalTables);
        }
    }

    public static class User {
        private String firstName;
        private String lastName;
        private String email;
        private String phone;

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

    public static class RestaurantBookingSystem implements BookingSystem {
        private List<Restaurant> restaurants;
        private List<User> users;
        private List<Reservation> reservations;
        private SystemParameters systemParameters;

        public static int totalRestaurants = 0; // статичне поле для підрахунку загальної кількості ресторанів

        public RestaurantBookingSystem(List<Restaurant> restaurants, List<User> users, List<Reservation> reservations, SystemParameters systemParameters) {
            this.restaurants = restaurants;
            this.users = users;
            this.reservations = reservations;
            this.systemParameters = systemParameters;
            totalRestaurants++; // збільшення лічильника при кожному створенні нового ресторану
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

    public static class Restaurant {
        private String name;
        private String address;
        private int numberOfTables;

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

    public static class Table {
        private boolean isOccupied;
        private int number;
        private int capacity;

        public static int totalTables = 0; // статичне поле для підрахунку загальної кількості столиків

        public Table(boolean isOccupied, int number, int capacity) {
            this.isOccupied = isOccupied;
            this.number = number;
            this.capacity = capacity;
            totalTables++; // збільшення лічильника при кожному створенні нового столика
        }

        public void markAsOccupied() {
            // Логіка позначення як зайнятий
        }

        public void markAsFree() {
            // Логіка позначення як вільний
        }
    }

    public static class Reservation {
        private LocalDate date;
        private LocalTime time;
        private Table table;
        private boolean confirmed;

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

    public static class SystemParameters {
        private String versionInfo;
        private LocalDate lastUpdateDate;

        public SystemParameters(String versionInfo, LocalDate lastUpdateDate) {
            this.versionInfo = versionInfo;
            this.lastUpdateDate = lastUpdateDate;

        }
    }


}
