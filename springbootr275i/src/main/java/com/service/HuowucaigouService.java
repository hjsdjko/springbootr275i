package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuowucaigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuowucaigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuowucaigouView;


/**
 * 货物采购
 *
 * @author 
 * @email 
 * @date 2023-03-08 08:50:08
 */
public interface HuowucaigouService extends IService<HuowucaigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowucaigouVO> selectListVO(Wrapper<HuowucaigouEntity> wrapper);
   	
   	HuowucaigouVO selectVO(@Param("ew") Wrapper<HuowucaigouEntity> wrapper);
   	
   	List<HuowucaigouView> selectListView(Wrapper<HuowucaigouEntity> wrapper);
   	
   	HuowucaigouView selectView(@Param("ew") Wrapper<HuowucaigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowucaigouEntity> wrapper);
   	

}

