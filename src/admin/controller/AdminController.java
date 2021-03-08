package admin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import admin.service.HisseServiceImpl;
import admin.service.KullaniciServiceImpl;
import domain.Hisse;
import domain.Kullanici;
import domain.UserType;



@Controller
@RequestMapping("/admin")
public class AdminController  {
	
	
	@Autowired
	private KullaniciServiceImpl kullaniciService;
	@Autowired
	private HisseServiceImpl hisseService;
	
	@RequestMapping(value="/listUser",method=RequestMethod.GET)
	public String ListUser(Model model) {
		model.addAttribute("allUsers", kullaniciService.getKullanicis());
		return "users";
		
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
    // http://localhost:8080/../admin/addUser
	public String getNewUserForm(@ModelAttribute("newUser") Kullanici newUser) {
		return "/userAddAdmin";
	}
	
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String processAddNewUser(@ModelAttribute("newUser") Kullanici userToBeAdded) {
		System.out.println(userToBeAdded);
		kullaniciService.addKullanici(userToBeAdded);
		return "redirect:/admin/listUser";
	}
	
	@RequestMapping(value="/deleteUser{userId}",method=RequestMethod.GET)
	public String deleteProduct(@RequestParam("userId") int id) {	
		kullaniciService.deleteKullanici(id);
		return "redirect:/admin/listUser";
	}
	
	@RequestMapping(value="/updateUser{userId}",method=RequestMethod.GET)
	public String updateUser(@RequestParam("userId") int id, Model model) {	
		model.addAttribute("updateUser",kullaniciService.getKullaniciById(id));
		
		return "/userUpdateAdmin";
	}
	
	@RequestMapping(value="/updateUser",method=RequestMethod.POST)
	public String updateUserPost(@ModelAttribute("updateUser") Kullanici updatedUser) {
		System.out.println("Admin#UpdateUserPost: "+updatedUser);
		
		kullaniciService.updateKullanici(updatedUser);
		return "redirect:/admin/listUser";
	}
	
	
	
	//---------------------------------------------------------------------------------------
	@RequestMapping(value="/listShare",method=RequestMethod.GET)
	public String ListHisse(Model model) {
		model.addAttribute("allShares", hisseService.getAllHisses());
		return "/sharesAdmin";
		
	}
	
	@RequestMapping(value = "/addShare", method = RequestMethod.GET)
    // http://localhost:8080/../admin/addUser
	public String getNewSharerForm(@ModelAttribute("newShare") Hisse newShare) {
		return "/shareAddAdmin";
	}
	
	
	@RequestMapping(value = "/addShare", method = RequestMethod.POST)
	public String processAddNewShare(@ModelAttribute("newShare") Hisse shareToBeAdded) {
		System.out.println(shareToBeAdded);
		hisseService.addHisse(shareToBeAdded);
		return "redirect:/admin/listShare";
	}
	
	@RequestMapping(value="/deleteShare{shareId}",method=RequestMethod.GET)
	public String deleteShare(@RequestParam("shareId") int id) {	
		hisseService.deleteHisse(id);;
		return "redirect:/admin/listShare";
	}
	
	@RequestMapping(value="/updateShare{userId}",method=RequestMethod.GET)
	public String updateShare(@RequestParam("shareId") int id, Model model) {	
		model.addAttribute("updateShare",hisseService.getHisseById(id));
		
		return "/shareUpdateAdmin";
	}
	
	@RequestMapping(value="/updateShare",method=RequestMethod.POST)
	public String updateSharePost(@ModelAttribute("updateShare") Hisse updatedShare) {
		System.out.println("Admin#UpdateSharePost: "+updatedShare);
		
		hisseService.updateHisse(updatedShare);
		return "redirect:/admin/listShare";
	}
	
	
	//---------------------------------------------------------------------------------------
	
	@ModelAttribute("typeList")
	public List<UserType> prepareroleList() {
	List<UserType> typeList=new ArrayList<UserType>();	
	for(UserType userType: UserType.values()) {
		typeList.add(userType);
		}
	return typeList;
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