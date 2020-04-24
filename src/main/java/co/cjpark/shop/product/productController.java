package co.cjpark.shop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.cjpark.shop.product.cal.Calculator;

@Controller
public class productController {

		@Autowired
		Calculator cal;
		@RequestMapping("/sum.do")
		public String product(Model model) {
			//TODO 서비스 할 형태를 작성한다
			int result = cal.sum(10,  10);
			model.addAttribute("sum", result);
			
			return "sumResult";
		}
//		
//		@RequestMapping("")
//		public ModelAndView product_(Model model) {
//			ModelAndView mav = new ModelAndView();
//			//TODO 서비스 할 형태를 작성한다
//			
//			mav.addObject("a", "b");
//			mav.setViewName("viewName");
//			
//			return mav;
//		}
}
