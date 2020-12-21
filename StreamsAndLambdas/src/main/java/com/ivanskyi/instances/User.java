package com.ivanskyi.instances;

public class User {
    String email;
    int loginDate;
    Team team;

    public User(String email, int loginDateDayAgo, Team team) {
        this.email = email;
        this.loginDate = this.loginDate;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(int loginDate) {
        this.loginDate = loginDate;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}