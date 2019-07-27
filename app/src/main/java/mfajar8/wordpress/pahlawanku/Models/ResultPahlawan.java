
package mfajar8.wordpress.pahlawanku.Models;

import java.util.HashMap;
import java.util.Map;

public class ResultPahlawan {

    private String id_pahlawan;
    private String kategori;
    private String foto;
    private String nama;
    private String nama_asli;
    private String tempat_lahir;
    private String tanggal_lahir;
    private String tempat_wafat;
    private String tanggal_wafat;
    private String julukan;
    private String jasa;
    private String biografi;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId_pahlawan() {
        return id_pahlawan;
    }

    public void setId_pahlawan(String id_pahlawan) {
        this.id_pahlawan = id_pahlawan;
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

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getTempat_wafat() {
        return tempat_wafat;
    }

    public void setTempat_wafat(String tempat_wafat) {
        this.tempat_wafat = tempat_wafat;
    }

    public String getTanggal_wafat() {
        return tanggal_wafat;
    }

    public void setTanggal_wafat(String tanggal_wafat) {
        this.tanggal_wafat = tanggal_wafat;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
