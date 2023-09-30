package game.notapoly.lib;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<ValidUsername, String> {
    private static final int USERNAME_MIN_LENGTH = 4;

    @Override
    public boolean isValid(String field, ConstraintValidatorContext context) {
        return field != null && field.length() >= USERNAME_MIN_LENGTH;
    }
}
