package com.dao;

import com.entity.CeshifankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CeshifankuiVO;
import com.entity.view.CeshifankuiView;


/**
 * 测试反馈
 * 
 * @author 
 * @email 
 * @date 2024-02-02 20:07:03
 */
public interface CeshifankuiDao extends BaseMapper<CeshifankuiEntity> {
	
	List<CeshifankuiVO> selectListVO(@Param("ew") Wrapper<CeshifankuiEntity> wrapper);
	
	CeshifankuiVO selectVO(@Param("ew") Wrapper<CeshifankuiEntity> wrapper);
	
	List<CeshifankuiView> selectListView(@Param("ew") Wrapper<CeshifankuiEntity> wrapper);

	List<CeshifankuiView> selectListView(Pagination page,@Param("ew") Wrapper<CeshifankuiEntity> wrapper);

	
	CeshifankuiView selectView(@Param("ew") Wrapper<CeshifankuiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CeshifankuiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CeshifankuiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CeshifankuiEntity> wrapper);



}
