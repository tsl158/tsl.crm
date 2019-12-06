package cn.sm1234.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sm1234.dao.YuangongMapper;
import cn.sm1234.domain.Yuangong;
import cn.sm1234.service.YuangongService;

@Service
public class YuangongImpl implements YuangongService {
	
	@Autowired
	private YuangongMapper yuangongMapper;

	public List<Yuangong> findAll() {
		return yuangongMapper.findAll();
	}

}
