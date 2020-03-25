package mijia.intelligence.communty.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author xiangming
 * @create 2020-03-24-16:42
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
