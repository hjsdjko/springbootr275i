package com.dao;

import com.entity.GongyingshanghuowuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyingshanghuowuVO;
import com.entity.view.GongyingshanghuowuView;


/**
 * 供应商货物
 * 
 * @author 
 * @email 
 * @date 2023-03-08 08:50:08
 */
public interface GongyingshanghuowuDao extends BaseMapper<GongyingshanghuowuEntity> {
	
	List<GongyingshanghuowuVO> selectListVO(@Param("ew") Wrapper<GongyingshanghuowuEntity> wrapper);
	
	GongyingshanghuowuVO selectVO(@Param("ew") Wrapper<GongyingshanghuowuEntity> wrapper);
	
	List<GongyingshanghuowuView> selectListView(@Param("ew") Wrapper<GongyingshanghuowuEntity> wrapper);

	List<GongyingshanghuowuView> selectListView(Pagination page,@Param("ew") Wrapper<GongyingshanghuowuEntity> wrapper);
	
	GongyingshanghuowuView selectView(@Param("ew") Wrapper<GongyingshanghuowuEntity> wrapper);
	

}
