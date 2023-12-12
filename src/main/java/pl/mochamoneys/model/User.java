package pl.mochamoneys.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    private long userId;
    private String name;
    private String email;
    private String password;
}
