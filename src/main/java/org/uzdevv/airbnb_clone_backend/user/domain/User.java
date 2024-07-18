package org.uzdevv.airbnb_clone_backend.user.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.UuidGenerator;
import org.uzdevv.airbnb_clone_backend.shared.domain.AbstractAuditingEntity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static jakarta.persistence.GenerationType.SEQUENCE;
import static lombok.AccessLevel.PRIVATE;

@EqualsAndHashCode(callSuper = true)
@Data
@FieldDefaults(level = PRIVATE)
@Entity
@Table(name = "airbnb_user")
public class User extends AbstractAuditingEntity<Long> {


    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "userSequenceGenerator")
    @SequenceGenerator(name = "userSequenceGenerator", sequenceName = "user_generator", allocationSize = 1)
    @Column(name = "id")
    Long id;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "email")
    String email;

    @Column(name = "image_url")
    String imageUrl;

    @UuidGenerator
    @Column(nullable = false, name = "public_id")
    UUID publicId;

    @ManyToMany
    @JoinTable(name = "user_authority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "name")})
    Set<Authority> authorities = new HashSet<>();


    @Override
    public Long getId() {
        return this.id;
    }


}
