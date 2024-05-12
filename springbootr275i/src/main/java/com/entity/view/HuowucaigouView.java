package com.entity.view;

import com.entity.HuowucaigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 货物采购
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 08:50:08
 */
@TableName("huowucaigou")
public class HuowucaigouView  extends HuowucaigouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuowucaigouView(){
	}
 
 	public HuowucaigouView(HuowucaigouEntity huowucaigouEntity){
 	try {
			BeanUtils.copyProperties(this, huowucaigouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
