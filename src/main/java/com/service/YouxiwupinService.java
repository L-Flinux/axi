package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxiwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxiwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxiwupinView;


/**
 * 游戏物品
 *
 * @author 
 * @email 
 * @date 2024-02-02 20:07:03
 */
public interface YouxiwupinService extends IService<YouxiwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxiwupinVO> selectListVO(Wrapper<YouxiwupinEntity> wrapper);
   	
   	YouxiwupinVO selectVO(@Param("ew") Wrapper<YouxiwupinEntity> wrapper);
   	
   	List<YouxiwupinView> selectListView(Wrapper<YouxiwupinEntity> wrapper);
   	
   	YouxiwupinView selectView(@Param("ew") Wrapper<YouxiwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxiwupinEntity> wrapper);

   	

}

