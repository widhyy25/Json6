package dashboard.example.com.json6;

public class Guru {
    private String nama;
    private String no_hp;
    private String alamat;
    private String no_induk;

    public Guru(String nama, String no_hp, String alamat, String no_induk) {
        this.nama = nama;
        this.no_hp = no_hp;
        this.alamat = alamat;
        this.no_induk = no_induk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_induk() {
        return no_induk;
    }

    public void setNo_induk(String no_induk) {
        this.no_induk = no_induk;
    }
}
