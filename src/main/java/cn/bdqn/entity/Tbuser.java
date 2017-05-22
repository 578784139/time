package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by AW on 2017/5/18.
 */
public class Tbuser {
    private int userid;
    private String username,password,userroles,nickname;
    private Date registrationtime,Dateofbirth,systemtime;

    public Tbuser() {
    }

    public Tbuser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Tbuser(int userid, String username, String password, String userroles, String nickname, Date registrationtime, Date dateofbirth, Date systemtime) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.userroles = userroles;
        this.nickname = nickname;
        this.registrationtime = registrationtime;
        Dateofbirth = dateofbirth;
        this.systemtime = systemtime;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserroles() {
        return userroles;
    }

    public void setUserroles(String userroles) {
        this.userroles = userroles;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(Date registrationtime) {
        this.registrationtime = registrationtime;
    }

    public Date getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        Dateofbirth = dateofbirth;
    }

    public Date getSystemtime() {
        return systemtime;
    }

    public void setSystemtime(Date systemtime) {
        this.systemtime = systemtime;
    }

    @Override
    public String toString() {
        return "Tbuser{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userroles='" + userroles + '\'' +
                ", nickname='" + nickname + '\'' +
                ", registrationtime=" + registrationtime +
                ", Dateofbirth=" + Dateofbirth +
                ", systemtime=" + systemtime +
                '}';
    }
}
