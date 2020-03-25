package mijia.intelligence.communty.model;

import lombok.Data;

/**
 * @author xiangming
 * @create 2020-03-25-0:21
 */
@Data
public class User {
    private int id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
}
