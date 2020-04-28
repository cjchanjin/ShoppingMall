package co.cjpark.shop.member;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.cjpark.shop.HomeController;
import co.cjpark.shop.member.Vo.MemberVo;

@Controller
public class MemberController {

	//로그정보 남기기 위함
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MemberVo memberVo;
	
		@RequestMapping("/login.do")
		public String login(Model model) {
			logger.info("loginForm 이 실행됨");
			return "member/loginForm";
		}
		
//		@RequestMapping("/loginCheck.do")
//		public ModelAndView loginCheck(@RequestParam("id") String id, @RequestParam("pw") String pw) {
//			ModelAndView mav = new ModelAndView();
//			mav.addObject("id", id);
//			mav.addObject("pw", pw);
//			
//			if(id.equals("park") && pw.equals("1234")) {
//				mav.setViewName("member/loginOk");
//			} else {
//				mav.setViewName("member/loginFail");
//			}
//			logger.info("loginCheck 이 실행됨");
//			return mav;
//		}
		
		
//		@RequestMapping("/loginCheck.do")
//		public ModelAndView loginCheck(HttpServletRequest request) {
//			ModelAndView mav = new ModelAndView();
//			mav.addObject("id", request.getParameter("id"));
//			mav.addObject("pw", request.getParameter("pw"));
//			
//			if(request.getParameter("id").equals("park") && request.getParameter("pw").equals("1234")) {
//				mav.setViewName("member/loginOk");
//			} else {
//				mav.setViewName("member/loginFail");
//			}
//			
//			return mav;
//		}
		
		@RequestMapping("/loginCheck.do")
		public ModelAndView loginCheck(HttpServletRequest request) {
			ModelAndView mav = new ModelAndView();
			
//			MemberVo vo = new MemberVo();		//위에서 autowired 해서 지역변수 선언 안해도 됨.
			memberVo.setId(request.getParameter("id"));
			memberVo.setPw(request.getParameter("pw"));
			mav.addObject("member", memberVo);
			
			if(request.getParameter("id").equals("park") && request.getParameter("pw").equals("1234")) {
				mav.setViewName("member/loginOk");
			} else {
				mav.setViewName("member/loginFail");
			}
			
			return mav;
		}
}
