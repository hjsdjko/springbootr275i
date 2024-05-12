package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyingshanghuowuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyingshanghuowuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyingshanghuowuView;


/**
 * 供应商货物
 *
 * @author 
 * @email 
 * @date 2023-03-08 08:50:08
 */
public interface GongyingshanghuowuService extends IService<GongyingshanghuowuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyingshanghuowuVO> selectListVO(Wrapper<GongyingshanghuowuEntity> wrapper);
   	
   	GongyingshanghuowuVO selectVO(@Param("ew") Wrapper<GongyingshanghuowuEntity> wrapper);
   	
   	List<GongyingshanghuowuView> selectListView(Wrapper<GongyingshanghuowuEntity> wrapper);
   	
   	GongyingshanghuowuView selectView(@Param("ew") Wrapper<GongyingshanghuowuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyingshanghuowuEntity> wrapper);
   	

}

