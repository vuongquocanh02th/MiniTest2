public abstract class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private int tuoi;
    private String soDienThoai;
    private String email;

    public NhanVien(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    // Phương thức trừu tượng để tính lương
    public abstract double tinhLuong();

    // Getter và Setter (nếu cần)
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getEmail() {
        return email;
    }
}
