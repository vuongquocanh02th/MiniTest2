public class QuanLyNhanVien {
    private NhanVien[] danhSachNhanVien;
    private int soNhanVien; // Số lượng nhân viên hiện tại

    public QuanLyNhanVien(int maxSize) {
        this.danhSachNhanVien = new NhanVien[maxSize];
        this.soNhanVien = 0;
    }

    // Them nhan vien vao danh sach
    public void themNhanVien(NhanVien nhanVien) {
        if (soNhanVien < danhSachNhanVien.length) {
            danhSachNhanVien[soNhanVien++] = nhanVien;
        } else {
            System.out.println("Khong the them, danh sach da day");
        }
    }

    // Tính trung bình lương
    public double tinhTrungBinhLuong() {
        double tongLuong = 0;
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong += danhSachNhanVien[i].tinhLuong();
        }
        return soNhanVien > 0 ? tongLuong / soNhanVien : 0;
    }

    // Liet ke nhan vien full time luong thap hon TB
    public void nvFulltimeLuongThapHonTB() {
        double trungBinhLuong = tinhTrungBinhLuong();
        System.out.println("Nhan vien full time co luong thap hon trung binh:");
        for (int i = 0; i < soNhanVien; i++) {
            if (danhSachNhanVien[i] instanceof NhanVienFullTime) {
                NhanVienFullTime fulltime = (NhanVienFullTime) danhSachNhanVien[i];
                if (fulltime.tinhLuong() < trungBinhLuong) {
                    System.out.println(fulltime.getHoTen() + " - Luong: " + fulltime.tinhLuong());
                }
            }
        }
    }

    // Tinh tong luong phai tra cho nv part-time
    public double tinhTongLuongParttime() {
        double tongLuong = 0;
        for (int i = 0; i < soNhanVien; i++) {
            if (danhSachNhanVien[i] instanceof NhanVienPartTime) {
                tongLuong += danhSachNhanVien[i].tinhLuong();
            }
        }
        return tongLuong;
    }
}
