package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YouxiwupinEntity;
import com.entity.view.YouxiwupinView;

import com.service.YouxiwupinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 游戏物品
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-02 20:07:03
 */
@RestController
@RequestMapping("/youxiwupin")
public class YouxiwupinController {
    @Autowired
    private YouxiwupinService youxiwupinService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouxiwupinEntity youxiwupin,
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<YouxiwupinEntity> ew = new EntityWrapper<YouxiwupinEntity>();
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = youxiwupinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxiwupin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouxiwupinEntity youxiwupin, 
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<YouxiwupinEntity> ew = new EntityWrapper<YouxiwupinEntity>();
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = youxiwupinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxiwupin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouxiwupinEntity youxiwupin){
       	EntityWrapper<YouxiwupinEntity> ew = new EntityWrapper<YouxiwupinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youxiwupin, "youxiwupin")); 
        return R.ok().put("data", youxiwupinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouxiwupinEntity youxiwupin){
        EntityWrapper< YouxiwupinEntity> ew = new EntityWrapper< YouxiwupinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youxiwupin, "youxiwupin")); 
		YouxiwupinView youxiwupinView =  youxiwupinService.selectView(ew);
		return R.ok("查询游戏物品成功").put("data", youxiwupinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YouxiwupinEntity youxiwupin = youxiwupinService.selectById(id);
        return R.ok().put("data", youxiwupin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YouxiwupinEntity youxiwupin = youxiwupinService.selectById(id);
        return R.ok().put("data", youxiwupin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouxiwupinEntity youxiwupin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(youxiwupin);
        youxiwupinService.insert(youxiwupin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouxiwupinEntity youxiwupin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(youxiwupin);
        youxiwupinService.insert(youxiwupin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YouxiwupinEntity youxiwupin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youxiwupin);
        youxiwupinService.updateById(youxiwupin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youxiwupinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
