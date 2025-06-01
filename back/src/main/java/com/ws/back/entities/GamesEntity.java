package com.ws.back.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Table(name = "games")
@Entity
public class GamesEntity implements Serializable{

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "gameRank")
    private Integer gameRank;

}
