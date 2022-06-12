package com.prova.movie.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Movies")
public class Movies {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome")
    private String name;
    @Column(name = "Genero")
    private String genre;
    @Column(name = "UrlStream")
    private String urlStream;


}
