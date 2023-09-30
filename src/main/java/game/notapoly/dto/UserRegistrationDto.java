package game.notapoly.dto;

import game.notapoly.lib.ValidPassword;
import game.notapoly.lib.ValidUsername;
import lombok.Data;

@Data
@ValidPassword
public class UserRegistrationDto {
    @ValidUsername
    private String username;
    private String password;
    private String repeatPassword;
}
