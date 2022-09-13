package vn.plusplus.k86.springbootexercise.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class User {
    private String phone;
    private String password;
    private String email;
}
