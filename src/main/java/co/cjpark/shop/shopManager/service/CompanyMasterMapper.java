package co.cjpark.shop.shopManager.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CompanyMasterMapper implements RowMapper<CompanyMasterVo> {

	@Override
	public CompanyMasterVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		CompanyMasterVo vo = new CompanyMasterVo();
		vo.setmRegister(rs.getString("mRegister"));
		vo.setmAdminId(rs.getString("mAdminId"));
		vo.setmName(rs.getString("mName"));
		vo.setmCeo(rs.getString("mCeo"));
		vo.setmBusinessType(rs.getString("mBusinessType"));
		vo.setmBusinessCategory(rs.getString("mBusinessCategory"));
		vo.setmAddress(rs.getString("mAddress"));
		vo.setmTel(rs.getString("mTel"));
		vo.setmCellphone(rs.getString("mCellphone"));
		vo.setmEmail(rs.getString("mEmail"));
		vo.setmAuthority(rs.getString("mAuthority"));
		vo.setmEmployeeNum(rs.getInt("mEmployeeNum"));
		return vo;
	}

}
