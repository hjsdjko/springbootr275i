package com.dao;

import com.entity.ShangpinchukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinchukuVO;
import com.entity.view.ShangpinchukuView;


/**
 * 商品出库
 * 
 * @author 
 * @email 
 * @date 2023-03-08 08:50:08
 */
public interface ShangpinchukuDao extends BaseMapper<ShangpinchukuEntity> {
	
	List<ShangpinchukuVO> selectListVO(@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
	
	ShangpinchukuVO selectVO(@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
	
	List<ShangpinchukuView> selectListView(@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);

	List<ShangpinchukuView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
	
	ShangpinchukuView selectView(@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
	

}
