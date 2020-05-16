package dao;

import entity.Medicine;

import java.sql.SQLException;
import java.util.ArrayList;

public class MedicineDao extends BaseDao {
	public ArrayList<Medicine> select(String mname, int priceFrom, int priceTo) {
		ArrayList<Medicine> list = new ArrayList<Medicine>();
		String sql = "select * from Medicine where 1=1";
		if (!mname.equals("")) {
			sql += " and mname like ?";
		}
		if (priceFrom != 0) {
			sql += " and mprice > ?";
		}
		if (priceTo != 0) {
			sql += " and mprice < ?";
		}
		try {
			this.getCon();
			ps = con.prepareStatement(sql);
			int i = 1;
			if (!mname.equals("")) {
				ps.setString(i++, "%" + mname + "%");
			}
			if (priceFrom != 0) {
				ps.setInt(i++, priceFrom);
			}
			if (priceTo != 0) {
				ps.setInt(i++, priceTo);
			}
			rs = ps.executeQuery();
			while(rs.next()){
				Medicine m = new Medicine(rs.getInt(1), rs.getString(2),  rs.getString(3), rs.getString(4),rs.getInt(5),rs.getInt(6), rs.getString(7), rs.getString(8));
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return list;
	}

	public Medicine getById(int id) {
		Medicine m = null;
		String sql = "select * from Medicine where mid=?";
		try {
			this.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()){
				m = new Medicine(rs.getInt(1), rs.getString(2),  rs.getString(3), rs.getString(4),rs.getInt(5),rs.getInt(6), rs.getString(7), rs.getString(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return m;
	}

	public int add(Medicine m) {
		String sql = "insert into Medicine values(null,?,?,?,?,?,?,?)";
		return this.execute(sql, m.getMname(), m.getMsort(), m.getMshop(), m.getMcount(), m.getMprice(), m.getMdesc(), m.getMphoto());
	}

	public int addcount(Medicine m) {
		String sql = "update Medicine set mcount=? where mid=?";
		return this.execute(sql, m.getMprice(), m.getMid());
	}
	
	public int update(Medicine m) {
		String sql = "update Medicine set mname=?, msort=?, mshop=?, mcount=?, mprice=?, mdesc=?, mphoto=? where mid=?";
		return this.execute(sql, m.getMname(), m.getMsort(), m.getMshop(), m.getMcount(), m.getMprice(), m.getMdesc(), m.getMphoto(), m.getMid());
	}

	public int delete(int id) {
		String sql = "delete from Medicine where mid=?";
		return this.execute(sql, id);
	}
}
