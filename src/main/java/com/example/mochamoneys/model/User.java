package com.example.mochamoneys.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;
    private long budgetId;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "userId", updatable = false, insertable = false)
    private List<Categoryexp> categoryexp;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "userId", updatable = false, insertable = false)
    private List<Categoryinc> categoryinc;

    // Explicit constructor
    public User(long id, String name, String email, String password, long budgetId,
                List<Categoryexp> categoryexp, List<Categoryinc> categoryinc) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.budgetId = budgetId;
        this.categoryexp = categoryexp;
        this.categoryinc = categoryinc;
    }

    // Other methods

    // Builder methods if needed
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        // Builder methods for individual fields if needed
        private String name;
        private String email;
        private String password;
        private long budgetId;
        private List<Categoryexp> categoryexp;
        private List<Categoryinc> categoryinc;

        // Builder methods for individual fields
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder budgetId(long budgetId) {
            this.budgetId = budgetId;
            return this;
        }

        public UserBuilder categoryexp(List<Categoryexp> categoryexp) {
            this.categoryexp = categoryexp;
            return this;
        }

        public UserBuilder categoryinc(List<Categoryinc> categoryinc) {
            this.categoryinc = categoryinc;
            return this;
        }

        // Build method
        public User build() {
            return new User(id, name, email, password, budgetId, categoryexp, categoryinc);
        }
    }
}