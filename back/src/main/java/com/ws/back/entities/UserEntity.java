package com.ws.back.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Data
@Table(name = "glb_users")
@Entity
@Embeddable
public class UserEntity implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="testid_generator")
    @SequenceGenerator(name="testid_generator", sequenceName="ta_tests_id_seq", allocationSize=1)
    @Column(name="id", updatable = false, nullable = false)
    private Integer id;

    @Column (name = "login")
    private String login;

    @Column (name = "mail")
    private String mail;

    @Column (name = "picpath")
    private String picpath;

    @Column (name = "picsFolder")
    private String picsFolder;
    
    @Column (name = "notes")
    private Long notes;

    @Column (name = "rank")
    private Integer rank;

    @Column (name = "banned")
    private Boolean banned;

    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "games")
    private List<GamesEntity> games;
*/
    }