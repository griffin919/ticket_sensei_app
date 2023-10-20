package dev.ticketsensei.ticketsensei.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="host")
public class Host {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String contact;
    private String email;
    private String nationality;
    private String username;
    private String password;
    private String organizationName;
    private String position;
    private String website;
    private String socialLink1;
    private String socialLink2;
    private String aboutMe;
    private String refFiles;

    @Override
    public String toString() {
        return "Host{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", nationality='" + nationality + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", position='" + position + '\'' +
                ", website='" + website + '\'' +
                ", socialLink1='" + socialLink1 + '\'' +
                ", socialLink2='" + socialLink2 + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                ", refFiles='" + refFiles + '\'' +
                '}';
    }
}
