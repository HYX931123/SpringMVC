package com.cnpay.controller;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cnpay.service.HeyixuanService;

@Controller
@RequestMapping("/hyx")
public class HeYixuanController {
	
	private Logger logger=Logger.getLogger(this.getClass());
	@Autowired
	private HeyixuanService heyixuanService;
	
	@RequestMapping("/insert")
	public String insert() throws Throwable{
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("title", "新闻直播间");
		param.put("contents", "新闻直播间新闻直播间新闻直播间");
		param.put("pushTime", new Date());
		param.put("createTime", new Date());
		param.put("createUser", "HeYixuan");
		heyixuanService.insert(param);	
		return "success";
	}

	@RequestMapping("/add")
	public String add(){
		
		try {
			heyixuanService.insert();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("新闻添加对象方法：", e);
		}
		return "success";
		
	}

	/*@RequestMapping("/serachById")
	public String searchById(@RequestParam Integer id){
		y=heyixuanService.searchById(id);
		y.toString();
		return "success";
		
	}*/
}
