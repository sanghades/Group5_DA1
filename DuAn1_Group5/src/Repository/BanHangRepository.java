/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import DomainModels.HopThitDomain;
import Untility.DBContext;
import ViewModels.HoaDonThanhToan;
import ViewModels.LayIDHD;
import ViewModels.SanPhamThanhToan;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author acer
 */
public class BanHangRepository {
     public List<SanPhamThanhToan> getALLSP() {
        List<SanPhamThanhToan> listHD = new ArrayList<>();
        String sql = "select S.Ma, S.Ten ,lt.Ten, thit.TEN, xx.NoiXX, ncc.Ten, s.SOLUONGTON, s.GiaBan from HopThit s join Thit thit on s.IdThit = thit.Id join LoaiThit lt on s.IdLoaiThit = lt.Id join NhaCungCap ncc on s.IdNhaCungCap = ncc.Id join XuatXu xx on s.IdXuatXu = xx.Id where s.SOLUONGTON > 0";

        try {
            Connection con = DBContext.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listHD.add(new SanPhamThanhToan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDouble(8)));
            }
        } catch (Exception e) {
            System.out.println("Loi khi lay danh sach ht");
        }
        return listHD;
    }
     
     public List<SanPhamThanhToan> getALLSPCB(String ten) {
        List<SanPhamThanhToan> listHD = new ArrayList<>();
        String sql = "select S.Ma, S.Ten ,lt.Ten, thit.TEN, xx.NoiXX, ncc.Ten, s.SOLUONGTON, s.GiaBan from HopThit s join Thit thit on s.IdThit = thit.Id join LoaiThit lt on s.IdLoaiThit = lt.Id join NhaCungCap ncc on s.IdNhaCungCap = ncc.Id join XuatXu xx on s.IdXuatXu = xx.Id where tl.TEN = ? and s.SOLUONGTON > 0";

        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(sql)) {
            sttm.setString(1, ten);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
//                listHD.add( new SanPhamThanhToan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDouble(7)));
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     
     public List<SanPhamThanhToan> search(String ten) {
        List<SanPhamThanhToan> listHD = new ArrayList<>();
        String sql = "select S.Ma, S.Ten ,lt.Ten, thit.TEN, xx.NoiXX, ncc.Ten, s.SOLUONGTON, s.GiaBan from HopThit s join Thit thit on s.IdThit = thit.Id join LoaiThit lt on s.IdLoaiThit = lt.Id join NhaCungCap ncc on s.IdNhaCungCap = ncc.Id join XuatXu xx on s.IdXuatXu = xx.Id where s.TEN like N'%"+ten+"%'";

        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(sql)) {
            sttm.setString(1, ten);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                listHD.add(new SanPhamThanhToan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDouble(8)));
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
     
     public List<HoaDonThanhToan> getAllHD() {
        List<HoaDonThanhToan> listHD = new ArrayList<>();
        String sql = "select hd.MAHD, hd.NGAYTAO, nv.HoTen, hd.TrangThai from HOADON hd join NHANVIEN nv on hd.IdNV = nv.Id where hd.TrangThai = 0 order by NGAYTAO desc";

        try {
            Connection con = DBContext.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listHD.add(new HoaDonThanhToan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (Exception e) {
            System.out.println("Loi khi lay danh sach hoa don");
        }
        return listHD;
    }
     
    public List<LayIDHD> getIDHD() {
        List<LayIDHD> listID = new ArrayList<>();
        String sql = "select ID, MAHD from HOADON";
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(sql)) {
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                listID.add(new LayIDHD(rs.getString(1), rs.getString(2)));
            }
            return listID;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     
     public int createHDChoRepository(HoaDon hd) {
         String insert = "insert into HOADON(MAHD, NGAYTAO, IDNV ,TRANGTHAI) values (?, ?, ?, ?)";
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(insert)) {
            sttm.setString(1, hd.getMa());
            sttm.setString(2, hd.getNgayTao());
            sttm.setString(3, hd.getIdNV());
            sttm.setInt(4, 0);
            ketQuaTruyVan = sttm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }
     
     public int createHDCTRepository(HoaDonCT hd) {
         String insert = "insert into HOADONCHITIET(IdHT, IdHd, SOLUONG, DONGIA, TIENTHUA) values(?, ?, ?, ?, ?)";
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(insert)) {
            sttm.setString(1, hd.getIdHT());
            sttm.setString(2, hd.getIdHD());
            sttm.setInt(3, hd.getSoLuong());
            sttm.setDouble(4, hd.getDonGia());
            sttm.setDouble(5, hd.getTienThua());
            ketQuaTruyVan = sttm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }
     
     public int updateHDRepository(HoaDon hd){
         String update = "update HOADON set NGAYTHANHTOAN =?, TIENKHACHDUA = ?, TONGTIEN = ?, TRANGTHAI = ? where MAHD = ?";
        int ketQuaTruyVan = -1;
        try (Connection con = DBContext.getConnection(); PreparedStatement sttm = con.prepareStatement(update)){
            sttm.setString(1, hd.getNgayThanhToan());
            sttm.setDouble(2, hd.getTienKhachDua());
            sttm.setDouble(3, hd.getTongTien());
            sttm.setInt(4, 1);
            sttm.setString(5, hd.getMa());
            ketQuaTruyVan = sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }
     public int updateSLHT(int i, String ma){
         String update = "update HopThit set SOLUONGTON -= ? where MA = ?";
        int ketQuaTruyVan = -1;
        try (Connection con = DBContext.getConnection(); PreparedStatement sttm = con.prepareStatement(update)){
            sttm.setInt(1, i);
            sttm.setString(2, ma);
            ketQuaTruyVan = sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }
     
}
