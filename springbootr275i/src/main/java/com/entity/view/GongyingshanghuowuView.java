package com.entity.view;

import com.entity.GongyingshanghuowuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 供应商货物
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 08:50:08
 */
@TableName("gongyingshanghuowu")
public class GongyingshanghuowuView  extends GongyingshanghuowuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongyingshanghuowuView(){
	}
 
 	public GongyingshanghuowuView(GongyingshanghuowuEntity gongyingshanghuowuEntity){
 	try {
			BeanUtils.copyProperties(this, gongyingshanghuowuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
