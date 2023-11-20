package com.springdatajpa.test.springdatajpa.model;

import jakarta.persistence.*;
import lombok.*;


@Data
@Builder
@Embeddable
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "guardian_email")

        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column(name = "guardian_mobile")
        )
})
@AllArgsConstructor
@NoArgsConstructor
public class Guardian {
    private String name;
    private String email;
    private String mobile;

    @Override
    public String toString() {
        return "Guardian{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
