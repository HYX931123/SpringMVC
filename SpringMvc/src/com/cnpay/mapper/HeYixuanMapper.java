package com.cnpay.mapper;

import java.util.ArrayList;
import java.util.Map;

import com.cnpay.model.HeYixuan;

public interface HeYixuanMapper {
	
	 /**
	   * 添加信息
	   * 
	   * @param param
	   */
	  public void insert(Map<String, Object> param);

	  /**
	   * 添加信息
	   * 
	   * @param param
	   */
	  public void insert(HeYixuan yixuan);
	  
	  /**
	   * 删除信息
	   * 
	   * @param id
	   */
	  public void delete(int id);

	  /**
	   * 修改信息
	   * 
	   * @param param
	   */
	  public void update(Map<String, Object> param);

	  /**
	   * 查询信息(后台)
	   * 
	   * @return ArrayList<HeYixuan>
	   */
	  public ArrayList<HeYixuan> search();

	  /**
	   * 根据标题查询信息(后台)
	   * 
	   * @return ArrayList<HeYixuan>
	   */
	  public ArrayList<HeYixuan> searchByTitle(String title);

	  /**
	   * 根据编号查询用户信息
	   * 
	   * @param id
	   * @return HeYixuan
	   */
	  public HeYixuan searchById(int id);
}
