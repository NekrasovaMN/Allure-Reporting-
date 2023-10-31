package data;

import com.github.javafaker.Faker;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import lombok.Value;
import lombok.val;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateDate(int shift) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy")); // TODO: добавить логику для объявления переменной date и задания её значения, для генерации строки с датой
    }

    public static String generateCity(String locale) {
        var faker = new Faker(new Locale(locale));
        String city = faker.address().city();
        return city;
    }

    public static String generateName(String locale) {
        var faker = new Faker(new Locale(locale));
        String name = faker.name().fullName();
        return name;
    }

    public static String generatePhone(String locale) {
        var faker = new Faker(new Locale(locale));
        String phone = String.valueOf(faker.phoneNumber());
        return phone;
    }

    public static class Registration {
        private Registration() {
        }

        public static UserInfo generateUser(String locale) {
            UserInfo user;
            user = new UserInfo(
            generateСity(locale));
            generateName(locale);
            generatePhone(locale)
        }
    }

    @Value
    public static class UserInfo {
        String city;
        String name;
        String phone;
    }
}

