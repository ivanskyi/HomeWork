package com.ivanskyi.instances;

public class User {
    String email;
    int loginDateDayAgo;
    Team team;

    public User(String email, int loginDateDayAgo, Team team) {
        this.email = email;
        this.loginDateDayAgo = this.loginDateDayAgo;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLoginDateDayAgo() {
        return loginDateDayAgo;
    }

    public void setLoginDateDayAgo(int loginDateDayAgo) {
        this.loginDateDayAgo = loginDateDayAgo;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}