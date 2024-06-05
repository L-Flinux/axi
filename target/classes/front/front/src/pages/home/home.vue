<template>
<div class="home-preview" :style='{"margin":"0px auto","flexWrap":"wrap","flexDirection":"column","background":"none","display":"flex","width":"100%","justifyContent":"center"}'>

	<!-- 搜索 -->
	<div id="search" class="search animate__animated" :style='{"padding":"0px 7% 0","margin":"0 0 10px","borderColor":"#eee","alignItems":"center","display":"flex","justifyContent":"center","flexWrap":"wrap","background":"none","borderWidth":"0 0 1px","width":"100%","lineHeight":"80px","borderStyle":"solid","height":"80px"}'>
		<div :style='{"margin":"0 10px 0 0","display":"inline-block"}' class="select">
			<el-select v-model="queryIndex">
				<el-option
				  v-for="(item,index) in queryList"
				  :key="index"
				  :label="item.queryName"
				  :value="index"
				></el-option>
			</el-select>
		</div>
		<div :style='{"margin":"0 10px 0 0","display":"inline-block"}' class="input" v-if="queryIndex==0">
			<el-input v-model="youxixinxiyouximingcheng" placeholder="游戏名称"></el-input>
		</div>
		<div :style='{"margin":"0","display":"inline-block"}' class="btn" v-if="queryIndex==0">
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 6px 0 10px","margin":"0","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#7c3ef3","width":"auto","lineHeight":"32px","fontSize":"16px","height":"34px"}' type="primary" @click="search('youxixinxi')">
				<span class="icon iconfont icon-chakan12" :style='{"color":"rgba(255, 255, 255, 1)","margin":"0 4px 0 0","fontSize":"24px"}'></span>
				
			</el-button>
		</div>
		<div :style='{"margin":"0 10px 0 0","display":"inline-block"}' class="input" v-if="queryIndex==1">
			<el-input v-model="youxiwupinwupinmingcheng" placeholder="物品名称"></el-input>
		</div>
		<div :style='{"margin":"0","display":"inline-block"}' class="btn" v-if="queryIndex==1">
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 6px 0 10px","margin":"0","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#7c3ef3","width":"auto","lineHeight":"32px","fontSize":"16px","height":"34px"}' type="primary" @click="search('youxiwupin')">
				<span class="icon iconfont icon-chakan12" :style='{"color":"rgba(255, 255, 255, 1)","margin":"0 4px 0 0","fontSize":"24px"}'></span>
				
			</el-button>
		</div>
	</div>
	<!-- 搜索 -->


		<!-- 关于我们 -->
		<div id="about" class="animate__animated" :style='{"padding":"60px 18% 80px","margin":"0 0 0px","alignItems":"flex-end","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","position":"relative","justifyContent":"space-between","height":"auto","order":"5"}'>
		  <div :style='{"margin":"10px 0 20px","color":"#333","textAlign":"center","background":"url(http://codegen.caihongy.cn/20231028/adba790f6d22416d983cce35b2c2d935.png) no-repeat center top / 50%","width":"100%","fontSize":"42px","lineHeight":"90px","fontWeight":"600","height":"90px"}'>{{aboutUsDetail.title}}</div>
		  <div :style='{"margin":"0 0 30px","color":"#888","textAlign":"left","display":"none","width":"100%","lineHeight":"1.5","fontSize":"16px"}'>{{aboutUsDetail.subtitle}}</div>
		  <div :style='{"padding":"0 0px","alignItems":"flex-end","flexWrap":"wrap","display":"flex","width":"40%","justifyContent":"space-between","height":"auto"}'>
		    <img :style='{"width":"48%","margin":"0 0px","objectFit":"cover","borderRadius":"10px","display":"block","height":"365px"}' :src="baseUrl + aboutUsDetail.picture1">
		    <img :style='{"width":"48%","margin":"0","objectFit":"cover","borderRadius":"10px","display":"block","height":"225px"}' :src="baseUrl + aboutUsDetail.picture2">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + aboutUsDetail.picture3">
		  </div>
		  <div :style='{"padding":"0px","margin":"0 0 10px 0","overflow":"hidden","color":"rgb(102, 102, 102)","background":"#fff","width":"56%","fontSize":"14px","textIndent":"2em","height":"196px","order":"2"}' v-html="aboutUsDetail.content"></div>
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"border":"0","cursor":"pointer","margin":"30px 0 0","textAlign":"center","background":"#1abc9e","display":"none","width":"150px","lineHeight":"40px","order":"11"}' @click="toDetail('aboutusDetail',aboutUsDetail)">
		    <span :style='{"color":"#f5f5f5","fontSize":"14px"}'>了解更多</span>
		    <span class="icon iconfont icon-gengduo1" :style='{"color":"#f5f5f5","fontSize":"12px"}'></span>
		  </div>
		</div>
		<!-- 关于我们 -->

		
	<!-- 新闻资讯 -->
	<div id="animate_newsnews" class="news animate__animated" :style='{"width":"100%","padding":"20px 18% 60px","margin":"0 auto","position":"relative","background":"#fff","order":"3"}'>
		<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
			<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		</div>
		
		<div class="title" :style='{"width":"100%","margin":"40px auto 0","lineHeight":"100px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20231028/908858580af646c596c0eddb8e994774.png) no-repeat center top / 50%","height":"100px"}'>
			<span :style='{"fontSize":"42px","lineHeight":"40px","color":"#333","fontWeight":"600"}'>游戏资讯</span>
		</div>
		
			
			
			
			
			
			
			
			
			
			
		






		<div v-if="newsList.length" class="list list17 index-pv1" :style='{"width":"100%","padding":"0","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
		  <div class="swiper" :style='{"width":"500px","background":"none","height":"auto"}'>
		    <div class="swiper-container newsSwiper17 new-list-17news">
		      <div class="swiper-wrapper">
				<template v-for="(item,index) in newsList">
		        <div v-if="index < 3" class="swiper-slide">
		          <div :style='{"width":"100%","position":"relative","borderRadius":"8px","height":"auto"}' @click="toDetail('newsDetail', item)">
		            <img :style='{"width":"100%","objectFit":"cover","borderRadius":"8px","display":"block","height":"330px"}' :src="baseUrl + item.picture">
		            <div :style='{"alignItems":"center","borderRadius":"0 0 8px 8px","left":"0","bottom":"0","background":"rgba(0,0,0,.3)","display":"flex","width":"100%","position":"absolute"}'>
		              <div :style='{"padding":"0 10px","overflow":"hidden","whiteSpace":"nowrap","color":"#fff","borderRadius":"0 0 8px 8px","background":"none","width":"calc(100% - 300px)","lineHeight":"44px","fontSize":"16px","textOverflow":"ellipsis"}'>{{item.title}}</div>
		              <div :style='{"padding":"0 10px"}'>
		                <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"14px","color":"#fff"}'></span>
		                <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"14px"}'>{{item.addtime}}</span>
		              </div>
		            </div>
		          </div>
		        </div>
				</template>
		      </div>
		      <!-- Add Pagination -->
		      <div class="swiper-pagination" :style='{"width":"100%","left":"0","textAlign":"right","bottom":"10px"}'></div>
		    </div>
		  </div>
		  <div class="right" :style='{"width":"calc(100% - 520px)","fontSize":"14px","color":"#999","background":"none","height":"auto"}'>
		    <div v-if="newsList.length > 3" :style='{"width":"100%","padding":"10px","margin":"0 0 10px 0","background":"url(http://codegen.caihongy.cn/20231028/a6146fe4c0b24c729a3a9e373015beb2.png) no-repeat right top,#d8d8d8","height":"auto"}' @click="toDetail('newsDetail', newsList[3])">
		      <div :style='{"overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"calc(100% - 50px)","lineHeight":"40px","fontSize":"16px","textOverflow":"ellipsis","fontWeight":"600"}' class="name">{{newsList[3].title}}</div>
		      <div :style='{"overflow":"hidden","color":"#666","display":"inline-block","width":"100%","lineHeight":"24px","fontSize":"14px","height":"48px"}' class="desc">{{newsList[3].introduction}}</div>
		      <div :style='{"padding":"0","margin":"0 10px 0 0","display":"none"}'>
		        <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		        <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{newsList[3].addtime}}</span>
		      </div>
		      <div :style='{"padding":"0","margin":"0 10px 0 0","display":"none"}'>
		        <span class="icon iconfont icon-geren16" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		        <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{newsList[3].name}}</span>
		      </div>
		      <div :style='{"padding":"0","margin":"0 10px 0 0","display":"none"}'>
		        <span class="icon iconfont icon-zan10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		        <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{newsList[3].thumbsupnum}}</span>
		      </div>
		      <div :style='{"padding":"0","margin":"0 10px 0 0","display":"none"}'>
		        <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		        <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{newsList[3].storeupnum}}</span>
		      </div>
		      <div :style='{"padding":"0","margin":"0 10px 0 0","display":"none"}'>
		        <span class="icon iconfont icon-chakan9" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		        <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{newsList[3].clicknum}}</span>
		      </div>
		    </div>
		    <div class="list" :style='{"width":" 100%","padding":"0","background":"none","height":"auto"}'>
			  <template v-for="(item,index) in newsList">
		      <div v-if="index > 3" :style='{"cursor":"pointer","padding":"0 10px 0 0","margin":"0 0 10px","alignItems":"center","background":"#d8d8d8","display":"flex","width":"100%","height":"44px"}' @click="toDetail('newsDetail', item)">
		        <div :style='{"width":"5px","margin":"0","borderRadius":"0","background":"#000","height":"44px"}'></div>
		        <div class="title">{{item.title}}</div>
		        <div :style='{"width":"135px","padding":"0 5px","textAlign":"right","display":"none"}'>
		          <span class="icon iconfont icon-shijian21" :style='{"color":"inherit","lineHeight":"44px","fontSize":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"44px","fontSize":"inherit"}'>{{item.addtime}}</span>
		        </div>
		      </div>
			  </template>
		    </div>
		  </div>
		</div>





		<div @click="moreBtn('news')" :style='{"border":"0px solid #ddd","cursor":"pointer","margin":"90px auto","top":"0","textAlign":"center","background":"#fff","display":"block","width":"auto","lineHeight":"36px","position":"absolute","right":"18%"}'>
			<span :style='{"padding":"0 0 3px","borderColor":"#000","fontSize":"16px","color":"#333","borderStyle":"solid","borderWidth":"0 0 2px"}'>查看更多</span>
			<i :style='{"color":"#333","fontSize":"12px","display":"none"}' class="icon iconfont icon-gengduo1"></i>
		</div>
		
		</div>
	<!-- 新闻资讯 -->


<!-- 商品推荐 -->
<div id="animate_recommendyouxixinxi" class="recommend animate__animated" :style='{"padding":"30px 0","margin":"0 auto","borderColor":"#ddd","background":"#1c1d21","borderWidth":"1px 0","width":"100%","position":"relative","borderStyle":"solid","order":"2"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"64%","margin":"20px auto","lineHeight":"100px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20231027/0187890556a14e55a820899d09e229e5.png) no-repeat center top / 50%","height":"100px"}'>
		<span :style='{"fontSize":"42px","lineHeight":"40px","color":"#fff","fontWeight":"600"}'>游戏信息推荐</span>
	</div>
	
	
	
	
	
	
	
	
	
	



	<div v-if="youxixinxiRecommend.length" class="list list12 index-pv1 list12youxixinxi" :style='{"width":"100%","padding":"0 18%","background":"none","height":"auto"}'>
	  <div class="list" :style='{"padding":"20px 0","margin":"0","overflow":"hidden","flexWrap":"wrap","flex":"1","background":"none","display":"flex","justifyContent":"space-between","height":"auto"}'>
	    <div :style='{"cursor":"pointer","padding":"20px","margin":"0 0 30px","borderColor":"#d8d8d8","overflow":"hidden","borderRadius":"10px","background":"#fff","borderWidth":"0 0 8px","width":"23%","position":"relative","borderStyle":"solid","height":"auto"}' class="item list-item animation-box" v-for="item,index in youxixinxiRecommend" :key="index" @click="toDetail('youxixinxiDetail', item)">
			<img :name="item.id" :style='{"width":"100%","margin":"0 0 6px","objectFit":"cover","display":"block","height":"200px"}' v-if="preHttp(item.youxifengmian)" :src="item.youxifengmian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","margin":"0 0 6px","objectFit":"cover","display":"block","height":"200px"}' v-else :src="baseUrl + (item.youxifengmian?item.youxifengmian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","whiteSpace":"nowrap","color":"#333","textAlign":"center","overflow":"hidden","borderWidth":"0 0 0px","background":"#fff","width":"100%","lineHeight":"24px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.youximingcheng}}</div>
	    </div>
	  </div>
	</div>




	
	<div @click="moreBtn('youxixinxi')" :style='{"border":"0px solid #ddd","cursor":"pointer","margin":"80px 0 0","top":"0px","textAlign":"center","background":"none","display":"block","width":"auto","lineHeight":"36px","position":"absolute","right":"18%"}'>
		<span :style='{"padding":"0 0 3px","borderColor":"#fff","fontSize":"16px","color":"#fff","borderStyle":"solid","borderWidth":"0 0 2px"}'>查看更多</span>
		<i :style='{"color":"#fff","fontSize":"14px","display":"none"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->


<!-- 特价商品 -->
<div id="animate_listyouxiwupin" class="lists animate__animated" :style='{"margin":"40px 0 30px","background":"#fff","order":"1"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"64%","margin":"10px auto","lineHeight":"100px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20231027/0187890556a14e55a820899d09e229e5.png) no-repeat center top / 50%","height":"100px"}'>
	  <span :style='{"fontSize":"42px","lineHeight":"40px","color":"#333","fontWeight":"600","font":"\"宋体\""}'>游戏物品展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	


	<div v-if="youxiwupinList.length" class="list list11 index-pv1" :style='{"padding":"0 18% 0px","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
	  <div class="list" :style='{"flexWrap":"wrap","flex":"1","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","padding":"20px","margin":"0 0 30px","overflow":"hidden","borderRadius":"8px","background":"#d8d8d8","width":"31%","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in youxiwupinList" :key="index" @click="toDetail('youxiwupinDetail', item)">
			<img :name="item.id" :style='{"width":"180px","margin":"0 auto 6px","objectFit":"cover","borderRadius":"100%","display":"block","height":"180px"}' v-if="preHttp(item.wupintupian)" :src="item.wupintupian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"180px","margin":"0 auto 6px","objectFit":"cover","borderRadius":"100%","display":"block","height":"180px"}' v-else :src="baseUrl + (item.wupintupian?item.wupintupian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","whiteSpace":"nowrap","color":"#333","textAlign":"center","overflow":"hidden","borderWidth":"0 0 0px","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid","fontWeight":"600","height":"30px"}'>{{item.wupinmingcheng}}</div>
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","whiteSpace":"nowrap","color":"#333","textAlign":"center","overflow":"hidden","borderWidth":"0 0 0px","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid","fontWeight":"600","height":"30px"}'>游戏名称:{{item.youximingcheng}}</div>
	    </div>
	  </div>
	</div>




	
	
	<div @click="moreBtn('youxiwupin')" :style='{"border":"0px solid #ddd","cursor":"pointer","margin":"40px 0 0","top":"0","textAlign":"right","background":"#fff","display":"block","width":"auto","lineHeight":"36px","position":"absolute","right":"18%"}'>
		<span :style='{"padding":"0 0 3px","borderColor":"#000","fontSize":"16px","color":"#000","borderStyle":"solid","borderWidth":"0 0 2px"}'>查看更多</span>
		<i :style='{"color":"#333","fontSize":"14px","display":"none"}' class="icon iconfont icon-jinru"></i>
	</div>
	

</div>
<!-- 特价商品 -->
	
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        queryList:[
          {
              queryName:"游戏名称",
          },
          {
              queryName:"物品名称",
          },
        ],
        queryIndex: 0,
        youxixinxiyouximingcheng: '',
        youxiwupinwupinmingcheng: '',
        newsList: [],
        youxixinxiRecommend: [],

        youxiwupinList: [],

		newListSwiper17news: null,

		recommendIndex12youxixinxi: 0,
		recommendList12youxixinxi: [],
		recommendColumn12youxixinxi: '',


      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getNewsList();
		this.getAboutUs();
		this.getList();
		this.youxixinxiRecommendCate()
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			if (this['newListSwiper17news']) this['newListSwiper17news'].destroy()
			setTimeout(()=>{
				this['newListSwiper17news'] = new Swiper(".new-list-17news", {"pagination":{"el":".swiper-pagination","clickable":true}})
			},750)
		},
		youxixinxiRecommendCate(){
			this.$http.get('youxifenlei/list',{}).then(res => {
			  if (res.data.code == 0) {
				this.recommendList12youxixinxi = res.data.data.list
			  }
			});
			this.recommendColumn12youxixinxi = 'youxifenlei'
		},
		recommendIndexClick12(index, name) {
			this['recommendIndex12' + name] = index
			this.getList()
			
			document.querySelectorAll('.recommend .list12' + name + ' .list .item').forEach(el => {
			  el.classList.remove("active")
			})
			setTimeout(() => {
			  document.querySelectorAll('.recommend .list12' + name + ' .list .item').forEach(el => {
			    el.classList.add("active")
			  })
			}, 1);
		},

		listIndexClick11(index, name) {
			this['listIndex11' + name] = index[this['listColumn11' + name]]
			this.getList()
		},

		handleScroll() {
			let arr = [
				{id:'search',css:'animate__bounceInDown'},
				{id:'about',css:'animate__flipInX'},
				{id:'system',css:'animate__flipInY'},
				{id:'animate_recommendyouxixinxi',css:'animate__flipInY'},
				{id:'animate_listyouxiwupin',css:'animate__flipInX'},
				{id:'animate_newsnews',css:'animate__flipInX'},
				{id:'msgs',css:'animate__flipInX'},
				{id:'friendly',css:'animate__flipInY'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
      search(tablename) {
        if (this.queryIndex == 0 && this.youxixinxiyouximingcheng) {
          this.$router.push({path: '/index/' + tablename, query: {indexQueryCondition: this.youxixinxiyouximingcheng}});
        }
        if (this.queryIndex == 1 && this.youxiwupinwupinmingcheng) {
          this.$router.push({path: '/index/' + tablename, query: {indexQueryCondition: this.youxiwupinwupinmingcheng}});
        }
      },
		getNewsList() {
			let data = {
				page: 1,
				limit: 10,
                sort: 'addtime',
				order: 'desc'
			}
			this.$http.get('news/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "youxixinxi/autoSort";
          if(localStorage.getItem('frontToken')) {
              autoSortUrl = "youxixinxi/autoSort2";
          }
			data = {
				page: 1,
				limit: 8,
			}
			if(this.recommendIndex12youxixinxi != 0){
				data.youxifenlei = this.recommendList12youxixinxi[this.recommendIndex12youxixinxi - 1].youxifenlei
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.youxixinxiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get('youxiwupin/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.youxiwupinList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select /deep/ .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 4px;
			padding: 0 30px 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 180px;
			font-size: 14px;
			height: 36px;
		}
		
		.search .input /deep/ .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 4px;
			padding: 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 480px;
			font-size: 14px;
			height: 36px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.02) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	



	.home-preview .news .list17 .newsSwiper17 .swiper-pagination /deep/ span.swiper-pagination-bullet {
				border-radius: 100%;
				margin: 0 4px;
				background: #fff;
				display: inline-block;
				width: 10px;
				opacity: .2;
				height: 10px;
			}
	
	.home-preview .news .list17 .newsSwiper17 .swiper-pagination /deep/ span.swiper-pagination-bullet:hover {
				background: red;
				opacity: 1;
			}
	
	.home-preview .news .list17 .newsSwiper17 .swiper-pagination /deep/ span.swiper-pagination-bullet.swiper-pagination-bullet-active {
				background: red;
				opacity: 1;
			}
	
	.home-preview .news .list17 .right .list .title {
				padding: 0 0 0 10px;
				overflow: hidden;
				color: #666;
				white-space: nowrap;
				background: none;
				width: calc(100% - 0px);
				font-size: inherit;
				line-height: 44px;
				text-overflow: ellipsis;
				transition: 0.3s;
			}
	
	.home-preview .news .list17 .right .list .title:hover {
				transform: translate3d(10px, 0px, 0px);
			}




	.home-preview .recommend .list12 .tab .item {
				cursor: pointer;
				border: 0;
				padding: 0 20px;
				margin: 0;
				width: auto;
				line-height: 24px;
				text-align: center;
			}
	
	.home-preview .recommend .list12 .tab .item:hover {
				color: #6d19f6;
				border-color: #F5BB00;
				border-width: 0 0 0px 0;
				border-style: solid;
			}
	
	.home-preview .recommend .list12 .tab .item.active {
				color: #6d19f6;
				border-color: #F5BB00;
				border-width: 0 0 0px 0;
				border-style: solid;
			}
	
	.home-preview .recommend .list12 .tab .more {
				cursor: pointer;
				padding: 5px 10px;
				margin: 0 10px;
				color: #666;
				background: #fff;
				display: none;
				line-height: 44px;
				align-items: center;
			}
	
	.home-preview .recommend .list12 .tab .more:hover {
				color: red;
			}
	
	.home-preview .recommend .list12 .item.active {
	  animation-name: mymove;
	
	  &:nth-of-type(1) {
	    animation-duration: 1s;
	  }
	  &:nth-of-type(2) {
	    animation-duration: 1.2s;
	  }
	  &:nth-of-type(3) {
	    animation-duration: 1.4s;
	  }
	  &:nth-of-type(4) {
	    animation-duration: 1.6s;
	  }
	  &:nth-of-type(5) {
	    animation-duration: 1.8s;
	  }
	  &:nth-of-type(6) {
	    animation-duration: 2s;
	  }
	}
	
	@keyframes mymove
	{
		from {top: 320px;}
		to {top: 0;}
	}



</style>
