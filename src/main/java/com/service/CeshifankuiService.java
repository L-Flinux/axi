package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CeshifankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CeshifankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CeshifankuiView;


/**
 * 测试反馈
 *
 * @author 
 * @email 
 * @date 2024-02-02 20:07:03
 */
public interface CeshifankuiService extends IService<CeshifankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CeshifankuiVO> selectListVO(Wrapper<CeshifankuiEntity> wrapper);
   	
   	CeshifankuiVO selectVO(@Param("ew") Wrapper<CeshifankuiEntity> wrapper);
   	
   	List<CeshifankuiView> selectListView(Wrapper<CeshifankuiEntity> wrapper);
   	
   	CeshifankuiView selectView(@Param("ew") Wrapper<CeshifankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CeshifankuiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CeshifankuiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CeshifankuiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CeshifankuiEntity> wrapper);



}

