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
@Builder
public class Delivery {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "info", columnDefinition = "json")
    private String info;

}
