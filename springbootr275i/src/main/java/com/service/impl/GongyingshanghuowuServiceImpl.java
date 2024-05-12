package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongyingshanghuowuDao;
import com.entity.GongyingshanghuowuEntity;
import com.service.GongyingshanghuowuService;
import com.entity.vo.GongyingshanghuowuVO;
import com.entity.view.GongyingshanghuowuView;

@Service("gongyingshanghuowuService")
public class GongyingshanghuowuServiceImpl extends ServiceImpl<GongyingshanghuowuDao, GongyingshanghuowuEntity> implements GongyingshanghuowuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyingshanghuowuEntity> page = this.selectPage(
                new Query<GongyingshanghuowuEntity>(params).getPage(),
                new EntityWrapper<GongyingshanghuowuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyingshanghuowuEntity> wrapper) {
		  Page<GongyingshanghuowuView> page =new Query<GongyingshanghuowuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyingshanghuowuVO> selectListVO(Wrapper<GongyingshanghuowuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyingshanghuowuVO selectVO(Wrapper<GongyingshanghuowuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyingshanghuowuView> selectListView(Wrapper<GongyingshanghuowuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyingshanghuowuView selectView(Wrapper<GongyingshanghuowuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
