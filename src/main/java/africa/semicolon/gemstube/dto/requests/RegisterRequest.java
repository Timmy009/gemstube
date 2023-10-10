package africa.semicolon.gemstube.dto.requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class RegisterRequest {
    private String email;
    private String password;
}
