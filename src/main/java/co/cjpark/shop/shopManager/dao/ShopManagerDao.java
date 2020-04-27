package co.cjpark.shop.shopManager.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.cjpark.shop.shopManager.service.ShopManagerService;
import co.cjpark.shop.shopManager.service.CompanyMasterMapper;
import co.cjpark.shop.shopManager.service.CompanyMasterVo;

@Repository 
public class ShopManagerDao implements ShopManagerService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private String INSERT = "insert into companymaster values (?,?,?,?,?,?,?,?,?,?,?,'단일사용자',1)";
	private String SELECT_LIST = "select * from companymaster";
	private String SELECT = "select * from companymaster where mregister=?";
	
	@Override
	public ArrayList<CompanyMasterVo> selectList() throws SQLException {

		return (ArrayList<CompanyMasterVo>) jdbcTemplate.query(SELECT_LIST, new CompanyMasterMapper());
	}

	@Override
	public CompanyMasterVo getSelect(String key) throws SQLException {
		
		return (CompanyMasterVo) jdbcTemplate.queryForList(SELECT, key, new CompanyMasterMapper());
	}

	@Override
	public int insert(CompanyMasterVo vo) throws SQLException {
		int n = jdbcTemplate.update(INSERT, 
				vo.getmRegister(), 
				vo.getmAdminId(), 
				vo.getmName(), 
				vo.getmCeo(), 
				vo.getmBusinessType(), 
				vo.getmBusinessCategory(), 
				vo.getmAddress(), 
				vo.getmTel(), 
				vo.getmCellphone(), 
				vo.getmEmail(), 
				vo.getmAdminPassword());
		return n;
	}

	@Override
	public int update(CompanyMasterVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(CompanyMasterVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
