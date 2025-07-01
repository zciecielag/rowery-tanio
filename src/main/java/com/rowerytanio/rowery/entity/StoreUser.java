package com.rowerytanio.rowery.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class StoreUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 25)
    private String username;
    @Column(nullable = false, length = 100)
    private String password;
    @ColumnDefault("'USER'")
    private String role;
}
