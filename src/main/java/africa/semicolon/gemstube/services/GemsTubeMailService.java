package africa.semicolon.gemstube.services;

import africa.semicolon.gemstube.dto.requests.MailRequest;
import africa.semicolon.gemstube.dto.responses.EmailResponse;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.MediaType.*;

@Service
public class GemsTubeMailService implements MailService{

    @Override
    public EmailResponse sendMail(MailRequest mailRequest) {
        final String apiKey = "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";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(APPLICATION_JSON);
        httpHeaders.set("accept", APPLICATION_JSON_VALUE);
        httpHeaders.set("api-key", apiKey);
        HttpEntity<MailRequest> responseHttpEntity = new RequestEntity<>(mailRequest, httpHeaders, POST, URI.create(""));
        ResponseEntity<EmailResponse> response = restTemplate.postForEntity("https://api.brevo.com/v3/smtp/email", responseHttpEntity, EmailResponse.class);
        var emailResponse = response.getBody();
        emailResponse.setCode(response.getStatusCode().value());
        return emailResponse;

    }
}
