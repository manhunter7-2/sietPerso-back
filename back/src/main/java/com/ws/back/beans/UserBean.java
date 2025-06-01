package com.ws.back.beans;

import lombok.Data;

@Data
public class UserBean {
    public String login;
    public String mail;
    public Long notes;
    public Integer rank;
}
