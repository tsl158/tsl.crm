package cn.sm1234.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.sm1234.domain.Customer;
import cn.sm1234.domain.Yuangong;
import cn.sm1234.service.YuangongService;

@Controller
@RequestMapping("/yuangong")
public class YuangongController {
	@Autowired
	private YuangongService yuangongService;
	
	@RequestMapping("/findAll")
	@ResponseBody 
	public List<Yuangong> findAll(){
		List<Yuangong> list = yuangongService.findAll();
		return list;
	}
	private Map<String,Object> result = new HashMap<String,Object>();
	
	@RequestMapping("/listByPage")
	@ResponseBody
	public Map<String,Object> listByPage(Integer page,Integer rows){
		//设置分页参数
		PageHelper.startPage(page, rows);
		//查询所有数据
		List<Yuangong> list = yuangongService.findAll();
		
		//使用PageInfo封装查询结果
		PageInfo<Yuangong> pageInfo = new PageInfo<Yuangong>(list);
		
		//从PageInfo对象取出查询结果
		//总记录数
		long total = pageInfo.getTotal();
		//当前页数据列表
		List<Yuangong> custList = pageInfo.getList();
		
		result.put("total", total);
		result.put("rows", custList);
		
		return result;
	}
}
