package com.entity.vo;

import com.entity.YouxiwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 游戏物品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-02-02 20:07:03
 */
public class YouxiwupinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物品分类
	 */
	
	private String wupinfenlei;
		
	/**
	 * 游戏名称
	 */
	
	private String youximingcheng;
		
	/**
	 * 物品图片
	 */
	
	private String wupintupian;
		
	/**
	 * 物品介绍
	 */
	
	private String wupinjieshao;
		
	/**
	 * 物品用途
	 */
	
	private String wupinyongtu;
		
	/**
	 * 价格
	 */
	
	private Double price;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：物品分类
	 */
	 
	public void setWupinfenlei(String wupinfenlei) {
		this.wupinfenlei = wupinfenlei;
	}
	
	/**
	 * 获取：物品分类
	 */
	public String getWupinfenlei() {
		return wupinfenlei;
	}
				
	
	/**
	 * 设置：游戏名称
	 */
	 
	public void setYouximingcheng(String youximingcheng) {
		this.youximingcheng = youximingcheng;
	}
	
	/**
	 * 获取：游戏名称
	 */
	public String getYouximingcheng() {
		return youximingcheng;
	}
				
	
	/**
	 * 设置：物品图片
	 */
	 
	public void setWupintupian(String wupintupian) {
		this.wupintupian = wupintupian;
	}
	
	/**
	 * 获取：物品图片
	 */
	public String getWupintupian() {
		return wupintupian;
	}
				
	
	/**
	 * 设置：物品介绍
	 */
	 
	public void setWupinjieshao(String wupinjieshao) {
		this.wupinjieshao = wupinjieshao;
	}
	
	/**
	 * 获取：物品介绍
	 */
	public String getWupinjieshao() {
		return wupinjieshao;
	}
				
	
	/**
	 * 设置：物品用途
	 */
	 
	public void setWupinyongtu(String wupinyongtu) {
		this.wupinyongtu = wupinyongtu;
	}
	
	/**
	 * 获取：物品用途
	 */
	public String getWupinyongtu() {
		return wupinyongtu;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Double getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
