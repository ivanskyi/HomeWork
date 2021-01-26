package com.ivanskyi.chat;

public class User {
    private String email;
    private DateInstance loginDate;
    private Team team;

    public User(String email, DateInstance loginDate, Team team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DateInstance getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(DateInstance loginDate) {
        this.loginDate = loginDate;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "User{"
                + "email='" + email + '\''
                + ", loginDate=" + loginDate
                + ", team=" + team
                + '}';
    }
}
