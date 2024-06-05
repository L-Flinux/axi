package com.entity.view;

import com.entity.CeshifankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 测试反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-02 20:07:03
 */
@TableName("ceshifankui")
public class CeshifankuiView  extends CeshifankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CeshifankuiView(){
	}
 
 	public CeshifankuiView(CeshifankuiEntity ceshifankuiEntity){
 	try {
			BeanUtils.copyProperties(this, ceshifankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
