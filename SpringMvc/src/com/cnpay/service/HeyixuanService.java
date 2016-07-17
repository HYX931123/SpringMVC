package com.cnpay.service;

import java.util.ArrayList;
import java.util.Map;

import com.cnpay.model.HeYixuan;

public interface HeyixuanService {
	/**
	   * 添加信息
	   * 
	   * @param param
	   */
	  public void insert(Map<String, Object> param) throws Exception;

	  /**
	   * 添加信息
	   * 
	   * @param param
	 * @throws Exception 
	 * @throws Throwable 
	   */
	  public void insert() throws Exception;
	  
	  /**
	   * 删除信息
	   * 
	   * @param id
	   */
	  public void delete(int id) throws Exception;

	  /**
	   * 修改信息
	   * 
	   * @param param
	   */
	  public void update(Map<String, Object> param) throws Exception;

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
