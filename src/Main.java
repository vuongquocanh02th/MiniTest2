public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien quanLy = new QuanLyNhanVien(10); // Giới hạn số lượng nhân viên là 10

        // Them nhan vien full time
        NhanVienFullTime nv1 = new NhanVienFullTime("NV01", "Nguyen Van A", 30, "0123456789", "a@example.com", 5000, 2000, 500);
        NhanVienFullTime nv2 = new NhanVienFullTime("NV02", "Tran Thi B", 25, "0987654321", "b@example.com", 6000, 3000, 700);
        quanLy.themNhanVien(nv1);
        quanLy.themNhanVien(nv2);

        // Them nhan vien part time
        NhanVienPartTime nv3 = new NhanVienPartTime("NV03", "Le Thi C", 22, "0123984567", "c@example.com", 8);
        NhanVienPartTime nv4 = new NhanVienPartTime("NV04", "Pham Hoang D", 20, "0987234599", "d@example.com", 7);
        quanLy.themNhanVien(nv3);
        quanLy.themNhanVien(nv4);

        // Tính trung bình lương
        double trungBinhLuong = quanLy.tinhTrungBinhLuong();
        System.out.println("Luong trung binh toan bo nhan vien: " + trungBinhLuong);

        // Liet ke nhan vien full time luong thap hon trung binh
         quanLy.nvFulltimeLuongThapHonTB();

        // tinh tong luong phai tra cho nv part-time
        double tongLuongParttime = quanLy.tinhTongLuongParttime();
        System.out.println("Tong luong phai tra NV part-time: " + tongLuongParttime);
    }
}
