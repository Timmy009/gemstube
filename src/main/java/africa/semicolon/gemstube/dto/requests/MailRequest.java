package africa.semicolon.gemstube.dto.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MailRequest {
    private Sender sender;

    @JsonProperty ("to")
    private List<Recipient> recipients;

    private String subject;
    private String htmlContent;
}
