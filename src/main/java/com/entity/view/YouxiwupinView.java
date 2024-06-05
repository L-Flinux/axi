package com.entity.view;

import com.entity.YouxiwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 游戏物品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-02 20:07:03
 */
@TableName("youxiwupin")
public class YouxiwupinView  extends YouxiwupinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxiwupinView(){
	}
 
 	public YouxiwupinView(YouxiwupinEntity youxiwupinEntity){
 	try {
			BeanUtils.copyProperties(this, youxiwupinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
