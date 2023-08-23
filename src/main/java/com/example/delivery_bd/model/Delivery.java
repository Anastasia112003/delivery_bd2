package com.example.delivery_bd.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "delivery")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Delivery {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "info", columnDefinition = "json")
    private String info;

}
