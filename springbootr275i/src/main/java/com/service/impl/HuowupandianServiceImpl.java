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


import com.dao.HuowupandianDao;
import com.entity.HuowupandianEntity;
import com.service.HuowupandianService;
import com.entity.vo.HuowupandianVO;
import com.entity.view.HuowupandianView;

@Service("huowupandianService")
public class HuowupandianServiceImpl extends ServiceImpl<HuowupandianDao, HuowupandianEntity> implements HuowupandianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuowupandianEntity> page = this.selectPage(
                new Query<HuowupandianEntity>(params).getPage(),
                new EntityWrapper<HuowupandianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuowupandianEntity> wrapper) {
		  Page<HuowupandianView> page =new Query<HuowupandianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuowupandianVO> selectListVO(Wrapper<HuowupandianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuowupandianVO selectVO(Wrapper<HuowupandianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuowupandianView> selectListView(Wrapper<HuowupandianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuowupandianView selectView(Wrapper<HuowupandianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
