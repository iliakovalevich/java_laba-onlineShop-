package online.shop.services.personServices;

public class CheckExceptions {
    public void checkAge(int age) {
        try {
            if (age > 15 & age < 80) {
                return;
            } else {
                throw new Exception("The input number must be between from 16 to 80!");
            }
        } catch (Exception exception) {
            exception.getMessage();
        }
    }
}
