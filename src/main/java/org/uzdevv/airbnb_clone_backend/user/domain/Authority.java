package org.uzdevv.airbnb_clone_backend.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "authority")
public class Authority implements Serializable {

    @Id
    @NotNull
    @Size(max = 50)
    @Column(length = 50)
    private String name;



}
