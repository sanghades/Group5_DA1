/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Nguyễn Hiếu
 */
public class KhachHangModel {
    private String id;
    private String ma;
    private String hoTen;
    private String sdt;
    private String ngaySinh;
    private String diaChi;
    private boolean gioiTinh;
    private boolean trangThai;
    private String ghiChu;
 

    public KhachHangModel() {
    }

    public KhachHangModel(String ma) {
        this.ma = ma;
    }
    

    public KhachHangModel(String id, String ma, String hoTen, String sdt, String ngaySinh, String diaChi, boolean gioiTinh, boolean trangThai, String ghiChu) {
        this.id = id;
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
       
    }

    public KhachHangModel(String ma, String hoTen, String sdt, String ngaySinh, String diaChi, boolean gioiTinh, boolean trangThai, String ghiChu) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
       
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "KhachHangModel{" + "id=" + id + ", ma=" + ma + ", hoTen=" + hoTen + ", sdt=" + sdt + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", trangThai=" + trangThai + ", ghiChu=" + ghiChu + '}';
    }

    public Object[] toRowData(){
        return new Object[]{id, ma, hoTen, sdt, ngaySinh, diaChi, gioiTinh ? "Nam" : "Nữ", trangThai ? "Khách Hàng Thân Thiết" : "Khách Hàng Không Thân Thiết", ghiChu};
    }
}
