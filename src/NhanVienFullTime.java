public class NhanVienFullTime extends NhanVien {
    private double luongCung;
    private double thuong;
    private double phat;

    public NhanVienFullTime(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email,
                            double luongCung, double thuong, double phat) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email);
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
    }

    @Override
    public double tinhLuong() {
        return luongCung + (thuong - phat);
    }

    //
    public double getLuongCung() {
        return luongCung;
    }

    public double getThuong() {
        return thuong;
    }

    public double getPhat() {
        return phat;
    }
}
