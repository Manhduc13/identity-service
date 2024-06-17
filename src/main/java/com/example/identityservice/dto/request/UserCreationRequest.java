package com.example.identityservice.dto.request;

import com.example.identityservice.validator.DobConstraint;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "USERNAME_INVALID")
    String username;
    @Size(min = 6, message = "PASSWORD_INVALID")
    String password;
    String firstname;
    String lastname;
    @DobConstraint(min = 10, message = "DOB_INVALID")
    LocalDate dob;
    Set<String> roles;
}
