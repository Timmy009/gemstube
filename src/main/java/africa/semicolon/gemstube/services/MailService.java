package africa.semicolon.gemstube.services;

import africa.semicolon.gemstube.dto.requests.MailRequest;
import africa.semicolon.gemstube.dto.responses.EmailResponse;

public interface MailService {
    EmailResponse sendMail (MailRequest mailRequest);
}
