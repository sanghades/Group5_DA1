/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tus
 */
public class HopThitView {

    private String id;
    private String ma;
    private String TenHopThit;
    private Double GiaNhap;
    private Double GiaBan;
    private int SoLuongTon;
    private Date NgayDongGoi;
    private int HSD;
    private String MoTa;
    private int TrangThai;
    private String idThit;
    private String idLoaiThit;
    private String idXuatXu;
    private String idNCC;

    private ArrayList<HopThitView> ht = new ArrayList<>();

    public HopThitView() {
    }

    public HopThitView(String id, String ma, String TenHopThit, Double GiaNhap, Double GiaBan, int SoLuongTon, Date NgayDongGoi, int HSD, String MoTa, int TrangThai, String idThit, String idLoaiThit, String idXuatXu, String idNCC) {
        this.id = id;
        this.ma = ma;
        this.TenHopThit = TenHopThit;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.SoLuongTon = SoLuongTon;
        this.NgayDongGoi = NgayDongGoi;
        this.HSD = HSD;
        this.MoTa = MoTa;
        this.TrangThai = TrangThai;
        this.idThit = idThit;
        this.idLoaiThit = idLoaiThit;
        this.idXuatXu = idXuatXu;
        this.idNCC = idNCC;
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

    public String getTenHopThit() {
        return TenHopThit;
    }

    public void setTenHopThit(String TenHopThit) {
        this.TenHopThit = TenHopThit;
    }

    public Double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(Double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public Double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public Date getNgayDongGoi() {
        return NgayDongGoi;
    }

    public void setNgayDongGoi(Date NgayDongGoi) {
        this.NgayDongGoi = NgayDongGoi;
    }

    public int getHSD() {
        return HSD;
    }

    public void setHSD(int HSD) {
        this.HSD = HSD;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getIdThit() {
        return idThit;
    }

    public void setIdThit(String idThit) {
        this.idThit = idThit;
    }

    public String getIdLoaiThit() {
        return idLoaiThit;
    }

    public void setIdLoaiThit(String idLoaiThit) {
        this.idLoaiThit = idLoaiThit;
    }

    public String getIdXuatXu() {
        return idXuatXu;
    }

    public void setIdXuatXu(String idXuatXu) {
        this.idXuatXu = idXuatXu;
    }

    public String getIdNCC() {
        return idNCC;
    }

    public void setIdNCC(String idNCC) {
        this.idNCC = idNCC;
    }

    public ArrayList<HopThitView> getHt() {
        return ht;
    }

    public void setHt(ArrayList<HopThitView> ht) {
        this.ht = ht;
    }

    

    
    
    public HopThitView getHopThitID(String ma){
        for (HopThitView x : ht) {
            if (x.getId().equalsIgnoreCase(ma)) {
                return  x; 
            }
        }
        return null;
    }
    
    
}
