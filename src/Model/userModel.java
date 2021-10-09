/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class userModel {
    private String Menang, Kalah, Seri, Match,PointSementara,Hasil,AddPoint;

    public String getAddPoint() {
        return AddPoint;
    }

    public void setAddPoint(String AddPoint) {
        this.AddPoint = AddPoint;
    }

    public String getHasil() {
        return Hasil;
    }

    public void setHasil(String Hasil) {
        this.Hasil = Hasil;
    }

    public String getMenang() {
        return Menang;
    }

    public void setMenang(String Menang) {
        this.Menang = Menang;
    }

    public String getKalah() {
        return Kalah;
    }

    public void setKalah(String Kalah) {
        this.Kalah = Kalah;
    }

    public String getSeri() {
        return Seri;
    }

    public void setSeri(String Seri) {
        this.Seri = Seri;
    }

    public String getMatch() {
        return Match;
    }

    public void setMatch(String Match) {
        this.Match = Match;
    }

    public String getPointSementara() {
        return PointSementara;
    }

    public void setPointSementara(String PointSementara) {
        this.PointSementara = PointSementara;
    } 
}
