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


import com.dao.HuowucaigouDao;
import com.entity.HuowucaigouEntity;
import com.service.HuowucaigouService;
import com.entity.vo.HuowucaigouVO;
import com.entity.view.HuowucaigouView;

@Service("huowucaigouService")
public class HuowucaigouServiceImpl extends ServiceImpl<HuowucaigouDao, HuowucaigouEntity> implements HuowucaigouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuowucaigouEntity> page = this.selectPage(
                new Query<HuowucaigouEntity>(params).getPage(),
                new EntityWrapper<HuowucaigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuowucaigouEntity> wrapper) {
		  Page<HuowucaigouView> page =new Query<HuowucaigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuowucaigouVO> selectListVO(Wrapper<HuowucaigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuowucaigouVO selectVO(Wrapper<HuowucaigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuowucaigouView> selectListView(Wrapper<HuowucaigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuowucaigouView selectView(Wrapper<HuowucaigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
