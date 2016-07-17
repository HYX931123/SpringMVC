package com.cnpay.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnpay.mapper.HeYixuanMapper;
import com.cnpay.model.HeYixuan;
import com.cnpay.service.HeyixuanService;

@Service
@Transactional
public class HeyixuanServiceImpl implements HeyixuanService {

	@Resource
	private HeYixuanMapper heYixuanMapper;
	
	@Override
	public void insert(Map<String, Object> param) throws Exception {
		heYixuanMapper.insert(param);
	}
	
	@Override
	 public void insert() throws Exception{
	
		HeYixuan y222 = new HeYixuan();
		y222.setTitle("新闻联播dadadaasasdsadasdasd");
		y222.setContents("dadjakdjakdjakd");
		y222.setPushTime(new Date());
		y222.setCreateTime(new Date());
		y222.setCreateUser("何壹轩");
		
		HeYixuan yixuan = new HeYixuan();
		yixuan.setTitle("新");
		yixuan.setContents("dadjakdjakdjakd");
		yixuan.setPushTime(new Date());
		yixuan.setCreateTime(new Date());
		yixuan.setCreateUser("何壹轩");
		
		try {
			heYixuanMapper.insert(yixuan);
			heYixuanMapper.insert(y222);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) throws Exception {
		heYixuanMapper.delete(id);
	}

	@Override
	public void update(Map<String, Object> param) throws Exception {
		heYixuanMapper.update(param);

	}

	@Override
	public ArrayList<HeYixuan> search() {
		return heYixuanMapper.search();
	}

	@Override
	public ArrayList<HeYixuan> searchByTitle(String title) {
		return heYixuanMapper.searchByTitle(title);
	}

	@Override
	public HeYixuan searchById(int id) {
		return heYixuanMapper.searchById(id);
	}

}
