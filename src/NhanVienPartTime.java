public class NhanVienPartTime extends NhanVien {
    private int soGioLam;

    public NhanVienPartTime(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, int soGioLam) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email);
        this.soGioLam = soGioLam;
    }

    @Override
    public double tinhLuong() {
        return soGioLam * 100000;
    }

    // Getter và Setter
    public int getSoGioLamViec() {
        return soGioLam;
    }
}
