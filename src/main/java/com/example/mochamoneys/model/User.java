package com.example.mochamoneys.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    private String name;
    private String email;
    private String password;
    private String role;


//    @OneToMany(cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "userId", updatable = false, insertable = false)
//    private List<Categoryexp> categoryexp;
//
//    @OneToMany(cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "userId", updatable = false, insertable = false)
//    private List<Categoryinc> categoryinc;


    public User(String name, String email, String password) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = "ROLE_USER";
    }

//    public void setRole(){
//        this.role = "ROLE_USER";
//    }
//
//    public String getRole() {
//        return role;
//    }

    // Other methods

    // Builder methods if needed
//    public static UserBuilder builder() {
//        return new UserBuilder();
//    }


//    public static class UserBuilder {
//        // Builder methods for individual fields if needed
//        private String name;
//        private String email;
//        private String password;

//        private String role;

//        private List<Categoryexp> categoryexp;
//        private List<Categoryinc> categoryinc;
//
//        // Builder methods for individual fields
//        public UserBuilder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public UserBuilder email(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public UserBuilder password(String password) {
//            this.password = password;
//            return this;
//        }

//        public UserBuilder budgetId(long budgetId) {
//            this.budgetId = budgetId;
//            return this;
//        }
//
//        public UserBuilder categoryexp(List<Categoryexp> categoryexp) {
//            this.categoryexp = categoryexp;
//            return this;
//        }
//
//        public UserBuilder categoryinc(List<Categoryinc> categoryinc) {
//            this.categoryinc = categoryinc;
//            return this;
//        }
//
        // Build method
//        public User build() {
//            return new User(userId, name, email, password, categoryexp, categoryinc);
//        }
    }
