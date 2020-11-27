/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119011.reihanwiyanda;

import java.util.Date;

/**
 *
 * @author Reihan Wiyanda
 */
public class Customer implements CustomerInvoice {
    private String nama, email;
    private boolean member;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember () {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
       return "Hari ini tanggal 27 November 2020";

    }
    
}
