package africa.semicolon.gemstube.services;

import africa.semicolon.gemstube.dto.requests.RegisterRequest;
import africa.semicolon.gemstube.dto.responses.RegisterResponse;
import africa.semicolon.gemstube.model.User;
import africa.semicolon.gemstube.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GemsTubeUserService implements UserService{

    private final UserRepository userRepository;
    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        User user = new User();
user.setEmail(registerRequest.getEmail());
user.setPassword(registerRequest.getPassword());
RegisterResponse registerResponse = new RegisterResponse();


User savedUser = userRepository.save(user);
        registerResponse.setId(savedUser.getId());
        registerResponse.setEmail(savedUser.getEmail());
        return registerResponse;
    }
}
