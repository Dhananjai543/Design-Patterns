package CreationalDesignPatterns.Builder;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {

    private String firstName;
    private String lastName;
    private String address;
    private int phoneNumber;
}
