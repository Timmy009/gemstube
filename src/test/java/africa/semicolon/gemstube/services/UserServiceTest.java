package africa.semicolon.gemstube.services;

import africa.semicolon.gemstube.dto.requests.RegisterRequest;
import africa.semicolon.gemstube.dto.responses.RegisterResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void register () {
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setEmail("timileyinbamgbose7@gmail.com");
        registerRequest.setPassword("Timileyin17");

        RegisterResponse registerResponse = userService.register(registerRequest);

        assertNotNull(registerResponse);
        assertNotNull(registerResponse.getId());

    }

}