import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class Rest {

    public static class User {
        private String firstName;
        private String lastName;
        private String email;
        private String phone;

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

        public void markAsOccupied() {
            // Логіка позначення як зайнятий
        }

        public void markAsFree() {
            // Логіка позначення як вільний
        }
    }

    public static class Reservation {
        private LocalDate date; // Змінив тип даних з Date на LocalDate
        private Time time;
        private Table table;
        private boolean confirmed;

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
        private LocalDate lastUpdateDate; // Змінив тип даних з Date на LocalDate
        // Додаткові властивості та методи
    }

}
