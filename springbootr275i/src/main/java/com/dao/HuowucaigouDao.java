package com.dao;

import com.entity.HuowucaigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowucaigouVO;
import com.entity.view.HuowucaigouView;


/**
 * 货物采购
 * 
 * @author 
 * @email 
 * @date 2023-03-08 08:50:08
 */
public interface HuowucaigouDao extends BaseMapper<HuowucaigouEntity> {
	
	List<HuowucaigouVO> selectListVO(@Param("ew") Wrapper<HuowucaigouEntity> wrapper);
	
	HuowucaigouVO selectVO(@Param("ew") Wrapper<HuowucaigouEntity> wrapper);
	
	List<HuowucaigouView> selectListView(@Param("ew") Wrapper<HuowucaigouEntity> wrapper);

	List<HuowucaigouView> selectListView(Pagination page,@Param("ew") Wrapper<HuowucaigouEntity> wrapper);
	
	HuowucaigouView selectView(@Param("ew") Wrapper<HuowucaigouEntity> wrapper);
	

}
