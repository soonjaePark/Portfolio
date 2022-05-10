package sjpark.porfolio.portfolio.models.myinfo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyInfoModel {
    private long seq;
    private String name;
    private String tel;
    private int age;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime modifyDt;

    private String createDtStr;
    private String modifyDtStr;
}
