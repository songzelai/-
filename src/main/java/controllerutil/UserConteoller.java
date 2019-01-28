package controllerutil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import controller.ResponseResult;


@Controller
@RequestMapping("user")
public class UserConteoller {
@RequestMapping(value="handlreg.do")
@ResponseBody
public ResponseResult<Void> handlreg(String username){
	ResponseResult<Void> rr=new ResponseResult<Void>();

	 if("root".equals(username)) {
		
		rr.setState(1);
		rr.setMassage("用户名已经存在");
		
	}
	 return rr;
	
	
}
}
