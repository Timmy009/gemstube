package africa.semicolon.gemstube.services;

import africa.semicolon.gemstube.dto.requests.RegisterRequest;
import africa.semicolon.gemstube.dto.responses.RegisterResponse;

public interface UserService {
     RegisterResponse register(RegisterRequest registerRequest);
}
