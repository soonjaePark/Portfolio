package sjpark.porfolio.portfolio.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="my_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyInfoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;
    
    @Column(name="create_dt")
    private LocalDateTime createDt;

    @Column(name="modify_dt")
    private LocalDateTime modifyDt;

    @Column(name="email")
    private String email;

    @Column(name="tel")
    private String tel;
}