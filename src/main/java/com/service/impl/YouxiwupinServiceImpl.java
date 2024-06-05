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


import com.dao.YouxiwupinDao;
import com.entity.YouxiwupinEntity;
import com.service.YouxiwupinService;
import com.entity.vo.YouxiwupinVO;
import com.entity.view.YouxiwupinView;

@Service("youxiwupinService")
public class YouxiwupinServiceImpl extends ServiceImpl<YouxiwupinDao, YouxiwupinEntity> implements YouxiwupinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxiwupinEntity> page = this.selectPage(
                new Query<YouxiwupinEntity>(params).getPage(),
                new EntityWrapper<YouxiwupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxiwupinEntity> wrapper) {
		  Page<YouxiwupinView> page =new Query<YouxiwupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YouxiwupinVO> selectListVO(Wrapper<YouxiwupinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxiwupinVO selectVO(Wrapper<YouxiwupinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxiwupinView> selectListView(Wrapper<YouxiwupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxiwupinView selectView(Wrapper<YouxiwupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
