package africa.semicolon.gemstube.services;

import africa.semicolon.gemstube.dto.requests.MailRequest;
import africa.semicolon.gemstube.dto.requests.Recipient;
import africa.semicolon.gemstube.dto.requests.Sender;
import africa.semicolon.gemstube.dto.responses.EmailResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MailServiceTest {

    @Autowired
private MailService mailService;
    @Test
    public void testSendMail() {
        Sender sender = new Sender();
        sender.setEmail("timileyinbamgbose7@gmail.com");
        sender.setName("Timileyin");
        Recipient recipient = new Recipient();
        recipient.setName("Sam");
        recipient.setEmail("kononir960@cindalle.com");
        List<Recipient> recipients = List.of(recipient);
        MailRequest mailRequest = new MailRequest();
        mailRequest.setSender(sender);
        mailRequest.setRecipients(recipients);
        mailRequest.setSubject("Testing 123...");
        mailRequest.setHtmlContent("<p> We are testing our happ </p>");
        EmailResponse response = mailService.sendMail(mailRequest);
        assertNotNull(response);
        assertNotNull(response.getMessageId());
    }

}
