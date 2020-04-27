package co.cjpark.shop.shopManager.web;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.cjpark.shop.shopManager.service.CompanyMasterVo;
import co.cjpark.shop.shopManager.service.ShopManagerService;

@Controller
public class ShopManagerController {

	@Autowired
	ShopManagerService shop;
	
	@RequestMapping("/memberJoin.do")
	public String memberJoin() {
		
		return "/shopManager/memberJoinForm";
	}
	
	@RequestMapping("/memberJoinOk.do")
	public String memberJoinOk(CompanyMasterVo vo) throws SQLException {
		int n = shop.insert(vo);
		String view;
		
		if( n != 0) {
			view ="shopManager/memberJoinOk";
		} else
			view = "shopManager/memberJoinFail";
		
		return view;
	}
	
	@RequestMapping("/memberList.do")
	public ModelAndView memberList () throws SQLException {
		ModelAndView mav = new ModelAndView();
		ArrayList<CompanyMasterVo> list = new ArrayList<CompanyMasterVo> ();
		list = shop.selectList();
		
		mav.addObject("list", list);
		mav.setViewName("shopManager/memberList");
		
		return mav;
	}
}
