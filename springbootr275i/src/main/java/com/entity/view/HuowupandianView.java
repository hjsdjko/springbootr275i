package com.entity.view;

import com.entity.HuowupandianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 货物盘点
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 08:50:09
 */
@TableName("huowupandian")
public class HuowupandianView  extends HuowupandianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuowupandianView(){
	}
 
 	public HuowupandianView(HuowupandianEntity huowupandianEntity){
 	try {
			BeanUtils.copyProperties(this, huowupandianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
