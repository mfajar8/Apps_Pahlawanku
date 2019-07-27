package mfajar8.wordpress.pahlawanku.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Pahlawan {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "kategori")
    private String kategori;

    @ColumnInfo(name = "foto")
    private String foto;

    @ColumnInfo(name = "nama")
    private String nama;

    @ColumnInfo(name = "nama_asli")
    private String nama_asli;

    @ColumnInfo(name = "lahir")
    private String lahir;

    @ColumnInfo(name = "wafat")
    private String wafat;

    @ColumnInfo(name = "julukan")
    private String julukan;

    @ColumnInfo(name = "jasa")
    private String jasa;

    @ColumnInfo(name = "biografi")
    private String biografi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama_asli() {
        return nama_asli;
    }

    public void setNama_asli(String nama_asli) {
        this.nama_asli = nama_asli;
    }

    public String getLahir() {
        return lahir;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public String getWafat() {
        return wafat;
    }

    public void setWafat(String wafat) {
        this.wafat = wafat;
    }

    public String getJulukan() {
        return julukan;
    }

    public void setJulukan(String julukan) {
        this.julukan = julukan;
    }

    public String getJasa() {
        return jasa;
    }

    public void setJasa(String jasa) {
        this.jasa = jasa;
    }

    public String getBiografi() {
        return biografi;
    }

    public void setBiografi(String biografi) {
        this.biografi = biografi;
    }
}
