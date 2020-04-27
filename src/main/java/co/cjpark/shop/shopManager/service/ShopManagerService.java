package co.cjpark.shop.shopManager.service;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ShopManagerService {
	public ArrayList<CompanyMasterVo> selectList() throws SQLException;
	public CompanyMasterVo getSelect(String key) throws SQLException;
	public int insert(CompanyMasterVo vo) throws SQLException;
	public int update(CompanyMasterVo vo) throws SQLException;
	public int delete(CompanyMasterVo vo) throws SQLException;
}
