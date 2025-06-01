package com.ws.back.entities;

import lombok.Data;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Table(name = "glb_users")
@Entity
public class UserEntity implements Serializable{

    @Id
    @Column(name = "id")
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

    //#TODO list of games then add levels
}
