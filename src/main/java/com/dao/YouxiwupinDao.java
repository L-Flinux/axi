package com.dao;

import com.entity.YouxiwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxiwupinVO;
import com.entity.view.YouxiwupinView;


/**
 * 游戏物品
 * 
 * @author 
 * @email 
 * @date 2024-02-02 20:07:03
 */
public interface YouxiwupinDao extends BaseMapper<YouxiwupinEntity> {
	
	List<YouxiwupinVO> selectListVO(@Param("ew") Wrapper<YouxiwupinEntity> wrapper);
	
	YouxiwupinVO selectVO(@Param("ew") Wrapper<YouxiwupinEntity> wrapper);
	
	List<YouxiwupinView> selectListView(@Param("ew") Wrapper<YouxiwupinEntity> wrapper);

	List<YouxiwupinView> selectListView(Pagination page,@Param("ew") Wrapper<YouxiwupinEntity> wrapper);

	
	YouxiwupinView selectView(@Param("ew") Wrapper<YouxiwupinEntity> wrapper);
	

}
