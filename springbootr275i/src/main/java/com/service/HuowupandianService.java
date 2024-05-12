package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuowupandianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuowupandianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuowupandianView;


/**
 * 货物盘点
 *
 * @author 
 * @email 
 * @date 2023-03-08 08:50:09
 */
public interface HuowupandianService extends IService<HuowupandianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowupandianVO> selectListVO(Wrapper<HuowupandianEntity> wrapper);
   	
   	HuowupandianVO selectVO(@Param("ew") Wrapper<HuowupandianEntity> wrapper);
   	
   	List<HuowupandianView> selectListView(Wrapper<HuowupandianEntity> wrapper);
   	
   	HuowupandianView selectView(@Param("ew") Wrapper<HuowupandianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowupandianEntity> wrapper);
   	

}

