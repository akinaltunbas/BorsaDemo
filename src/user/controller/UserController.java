package user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.Hisse;
import domain.Kullanici;
import user.service.UserHiseeServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserHiseeServiceImpl hisseService;
	
	
	@RequestMapping(value="/listShare",method=RequestMethod.GET)
	public String ListHisse(Model model) {
		model.addAttribute("allShares", hisseService.getAllHisses());
		return "/sharesUser";
		
	}
	
	@RequestMapping(value = "/addShare", method = RequestMethod.GET)
    // http://localhost:8080/../admin/addUser
	public String getNewSharerForm(@ModelAttribute("newShare") Hisse newShare) {
		return "/shareAddUser";
	}
	@RequestMapping(value = "/addShare", method = RequestMethod.POST)
	public String processAddNewShare(@ModelAttribute("newShare") Hisse shareToBeAdded) {
		System.out.println(shareToBeAdded);
		hisseService.addHisse(shareToBeAdded);
		return "redirect:/user/listShare";
	}
	

@ModelAttribute("kodList")
public List<String> prepareKodNameList() {
	List<String> kodList=new ArrayList<String>();
	 for(Hisse his :hisseService.getAllHisses()) {
		 kodList.add(his.getKod());
	 }
	 return kodList;
}

}
