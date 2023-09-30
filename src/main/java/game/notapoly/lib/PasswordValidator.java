package game.notapoly.lib;


import game.notapoly.dto.UserRegistrationDto;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<ValidPassword, UserRegistrationDto> {
    private static final int MIN_PASSWORD_SIZE = 5;

    @Override
    public boolean isValid(UserRegistrationDto userRegistrationDto, ConstraintValidatorContext context) {
        return userRegistrationDto.getPassword() != null
                && userRegistrationDto.getPassword().length() >= MIN_PASSWORD_SIZE
                && userRegistrationDto.getPassword().equals(userRegistrationDto.getRepeatPassword());
    }
}
