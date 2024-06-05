package com.entity.vo;

import com.entity.CeshifankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 测试反馈
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-02-02 20:07:03
 */
public class CeshifankuiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 游戏分类
	 */
	
	private String youxifenlei;
		
	/**
	 * 游戏封面
	 */
	
	private String youxifengmian;
		
	/**
	 * 游戏厂商
	 */
	
	private String youxichangshang;
		
	/**
	 * 游戏时长
	 */
	
	private Integer youxishizhang;
		
	/**
	 * 游戏优点
	 */
	
	private String youxiyoudian;
		
	/**
	 * 游戏缺点
	 */
	
	private String youxiquedian;
		
	/**
	 * 个人体验
	 */
	
	private String gerentiyan;
		
	/**
	 * 游戏评分
	 */
	
	private String youxipingfen;
		
	/**
	 * 测试反馈
	 */
	
	private String ceshifankui;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 反馈日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fankuiriqi;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
		
	/**
	 * 回复内容
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：游戏分类
	 */
	 
	public void setYouxifenlei(String youxifenlei) {
		this.youxifenlei = youxifenlei;
	}
	
	/**
	 * 获取：游戏分类
	 */
	public String getYouxifenlei() {
		return youxifenlei;
	}
				
	
	/**
	 * 设置：游戏封面
	 */
	 
	public void setYouxifengmian(String youxifengmian) {
		this.youxifengmian = youxifengmian;
	}
	
	/**
	 * 获取：游戏封面
	 */
	public String getYouxifengmian() {
		return youxifengmian;
	}
				
	
	/**
	 * 设置：游戏厂商
	 */
	 
	public void setYouxichangshang(String youxichangshang) {
		this.youxichangshang = youxichangshang;
	}
	
	/**
	 * 获取：游戏厂商
	 */
	public String getYouxichangshang() {
		return youxichangshang;
	}
				
	
	/**
	 * 设置：游戏时长
	 */
	 
	public void setYouxishizhang(Integer youxishizhang) {
		this.youxishizhang = youxishizhang;
	}
	
	/**
	 * 获取：游戏时长
	 */
	public Integer getYouxishizhang() {
		return youxishizhang;
	}
				
	
	/**
	 * 设置：游戏优点
	 */
	 
	public void setYouxiyoudian(String youxiyoudian) {
		this.youxiyoudian = youxiyoudian;
	}
	
	/**
	 * 获取：游戏优点
	 */
	public String getYouxiyoudian() {
		return youxiyoudian;
	}
				
	
	/**
	 * 设置：游戏缺点
	 */
	 
	public void setYouxiquedian(String youxiquedian) {
		this.youxiquedian = youxiquedian;
	}
	
	/**
	 * 获取：游戏缺点
	 */
	public String getYouxiquedian() {
		return youxiquedian;
	}
				
	
	/**
	 * 设置：个人体验
	 */
	 
	public void setGerentiyan(String gerentiyan) {
		this.gerentiyan = gerentiyan;
	}
	
	/**
	 * 获取：个人体验
	 */
	public String getGerentiyan() {
		return gerentiyan;
	}
				
	
	/**
	 * 设置：游戏评分
	 */
	 
	public void setYouxipingfen(String youxipingfen) {
		this.youxipingfen = youxipingfen;
	}
	
	/**
	 * 获取：游戏评分
	 */
	public String getYouxipingfen() {
		return youxipingfen;
	}
				
	
	/**
	 * 设置：测试反馈
	 */
	 
	public void setCeshifankui(String ceshifankui) {
		this.ceshifankui = ceshifankui;
	}
	
	/**
	 * 获取：测试反馈
	 */
	public String getCeshifankui() {
		return ceshifankui;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：反馈日期
	 */
	 
	public void setFankuiriqi(Date fankuiriqi) {
		this.fankuiriqi = fankuiriqi;
	}
	
	/**
	 * 获取：反馈日期
	 */
	public Date getFankuiriqi() {
		return fankuiriqi;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
				
	
	/**
	 * 设置：回复内容
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}
			
}