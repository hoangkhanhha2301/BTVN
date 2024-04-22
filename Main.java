import java.until.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Nhanvien> danhsachnhanvien = new ArrayList<>();
    public static void main(String[] args){
        khoiTaoNhanVien();
        hienThiDanhSachNhanVien();
        themNhanVien();
        hienThiDanhSachNhanVien();
        xoaNhanVien();
    }

    public static void khoiTaoNhanVien(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            Nhanvien nv = new Nhanvien(i+1, "Nhân viên "+ (i+1), 21, "Phòng " + (i+1), "NV" + (i+1), (i+1)*5000000);
            danhsachnhanvien.add(nv);
        }
    }

    public static void hienThiDanhSachNhanVien(){
        System.out.println("Danh sách nhân viên:");
        for (Nhanvien nv : danhsachnhanvien) {
            nv.output();
        }
    }

    public static void themNhanVien(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên cần thêm:");
        System.out.print("Id nhân viên: ");
        int id = scanner.nextInt();
        System.out.print("Tên nhân viên: ");
        String ten = scanner.nextString();
        System.out.print("Tuổi: ");
        int tuoi = scanner.nextInt();
        System.out.print("Phòng ban: ");
        String phongban = scanner.nextString();
        System.out.print("Mã nhân viên: ");
        String chucvu = scanner.nextString();
        System.out.print("Lương: ");
        int luong = scanner.nextDouble();
        Nhanvien nv = new Nhanvien(id, name, age, department, code, salaryrate);
        danhsachnhanvien.add(nv);
    }

    public static void xoaNhanVien(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id nhân viên cần xóa: ");
        int id = scanner.nextInt();
        for (int i = 0; i < danhsachnhanvien.size(); i++){
            if (danhsachnhanvien.get(i).getId() == id){
                danhsachnhanvien.remove(i);
                System.out.println("Danh sách sau khi đã xóa nhân viên có id:" + id);
                hienThiDanhSachNhanVien();
                break;
            }
        }
        System.out.println("Không tìm thấy nhân viên có id: " + id);
    }
}