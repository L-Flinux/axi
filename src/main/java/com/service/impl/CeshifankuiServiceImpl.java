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


import com.dao.CeshifankuiDao;
import com.entity.CeshifankuiEntity;
import com.service.CeshifankuiService;
import com.entity.vo.CeshifankuiVO;
import com.entity.view.CeshifankuiView;

@Service("ceshifankuiService")
public class CeshifankuiServiceImpl extends ServiceImpl<CeshifankuiDao, CeshifankuiEntity> implements CeshifankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CeshifankuiEntity> page = this.selectPage(
                new Query<CeshifankuiEntity>(params).getPage(),
                new EntityWrapper<CeshifankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CeshifankuiEntity> wrapper) {
		  Page<CeshifankuiView> page =new Query<CeshifankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<CeshifankuiVO> selectListVO(Wrapper<CeshifankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CeshifankuiVO selectVO(Wrapper<CeshifankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CeshifankuiView> selectListView(Wrapper<CeshifankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CeshifankuiView selectView(Wrapper<CeshifankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<CeshifankuiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<CeshifankuiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<CeshifankuiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
