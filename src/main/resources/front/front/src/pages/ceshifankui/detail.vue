<template>
<div>
	<div :style='{"padding":"16px 18%","margin":"0 auto","borderColor":"#ddd","borderRadius":"0px","background":"#d8d8d8","borderWidth":"0 0 0px","width":"100%","borderStyle":"solid"}' class="breadcrumb-preview">
		<el-breadcrumb :separator="'-'" :style='{"fontSize":"14px","lineHeight":"1"}'>
			<el-breadcrumb-item class="item1" to="/"><a>首页</a></el-breadcrumb-item>
			<el-breadcrumb-item class="item2" v-for="(item, index) in breadcrumbItem" :key="index" to="/index/ceshifankui"><a>{{item.name}}</a></el-breadcrumb-item>
			<el-breadcrumb-item class="item3"><a href="javascript:void(0);">详情</a></el-breadcrumb-item>
		</el-breadcrumb>
	</div>
	<div :style='{"padding":"16px 18%","margin":"0 auto","borderColor":"#ddd","borderRadius":"0px","background":"#d8d8d8","borderWidth":"0 0 0px","width":"100%","borderStyle":"solid"}'>
		<el-button size="mini" @click="backClick">返回</el-button>
	</div>
	<div class="detail-preview" :style='{"padding":"0 18%","margin":"30px auto","alignItems":"flex-start","flexWrap":"wrap","display":"flex","width":"100%","position":"relative","justifyContent":"space-between"}'>
		<div class="attr" :style='{"padding":"0","margin":"0","flexWrap":"wrap","background":"none","flex":"1","display":"flex","width":"45%","position":"relative","justifyContent":"space-between","order":"2"}'>

			<div class="info" :style='{"width":"100%","padding":"0px","margin":"0","background":"#fff","flex":"1","order":"2"}'>
				<div class="item" :style='{"padding":"0","margin":"0 0 10px 0","background":"none"}'>
					<div :style='{"margin":"0 0 20px","overflow":"hidden","color":"#333","background":"none","width":"100%","fontSize":"20px","fontWeight":"600"}'>
                    {{detail.youximingcheng}}
                    </div>
				</div>
				<div class="item" :style='{"padding":"0 10px","margin":"0 0 0px 0","borderColor":"#eee","background":"none","borderWidth":"0 0 0px","display":"flex","borderStyle":"solid","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"auto","fontSize":"14px","lineHeight":"24px","height":"30px"}'>游戏分类</div>
					<div  :style='{"padding":"0px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","flex":"1","height":"auto"}'>{{detail.youxifenlei}}</div>
				</div>
				<div class="item" :style='{"padding":"0 10px","margin":"0 0 0px 0","borderColor":"#eee","background":"none","borderWidth":"0 0 0px","display":"flex","borderStyle":"solid","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"auto","fontSize":"14px","lineHeight":"24px","height":"30px"}'>游戏厂商</div>
					<div  :style='{"padding":"0px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","flex":"1","height":"auto"}'>{{detail.youxichangshang}}</div>
				</div>
				<div class="item" :style='{"padding":"0 10px","margin":"0 0 0px 0","borderColor":"#eee","background":"none","borderWidth":"0 0 0px","display":"flex","borderStyle":"solid","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"auto","fontSize":"14px","lineHeight":"24px","height":"30px"}'>游戏时长</div>
					<div  :style='{"padding":"0px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","flex":"1","height":"auto"}'>{{detail.youxishizhang}}</div>
				</div>
				<div class="item" :style='{"padding":"0 10px","margin":"0 0 0px 0","borderColor":"#eee","background":"none","borderWidth":"0 0 0px","display":"flex","borderStyle":"solid","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"auto","fontSize":"14px","lineHeight":"24px","height":"30px"}'>游戏优点</div>
					<div  :style='{"padding":"0px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","flex":"1","height":"auto"}'>{{detail.youxiyoudian}}</div>
				</div>
				<div class="item" :style='{"padding":"0 10px","margin":"0 0 0px 0","borderColor":"#eee","background":"none","borderWidth":"0 0 0px","display":"flex","borderStyle":"solid","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"auto","fontSize":"14px","lineHeight":"24px","height":"30px"}'>游戏缺点</div>
					<div  :style='{"padding":"0px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","flex":"1","height":"auto"}'>{{detail.youxiquedian}}</div>
				</div>
				<div class="item" :style='{"padding":"0 10px","margin":"0 0 0px 0","borderColor":"#eee","background":"none","borderWidth":"0 0 0px","display":"flex","borderStyle":"solid","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"auto","fontSize":"14px","lineHeight":"24px","height":"30px"}'>个人体验</div>
					<div  :style='{"padding":"0px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","flex":"1","height":"auto"}'>{{detail.gerentiyan}}</div>
				</div>
				<div class="item" :style='{"padding":"0 10px","margin":"0 0 0px 0","borderColor":"#eee","background":"none","borderWidth":"0 0 0px","display":"flex","borderStyle":"solid","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"auto","fontSize":"14px","lineHeight":"24px","height":"30px"}'>游戏评分</div>
					<div  :style='{"padding":"0px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","flex":"1","height":"auto"}'>{{detail.youxipingfen}}</div>
				</div>
				<div class="item" :style='{"padding":"0 10px","margin":"0 0 0px 0","borderColor":"#eee","background":"none","borderWidth":"0 0 0px","display":"flex","borderStyle":"solid","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"auto","fontSize":"14px","lineHeight":"24px","height":"30px"}'>用户名</div>
					<div  :style='{"padding":"0px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","flex":"1","height":"auto"}'>{{detail.yonghuming}}</div>
				</div>
				<div class="item" :style='{"padding":"0 10px","margin":"0 0 0px 0","borderColor":"#eee","background":"none","borderWidth":"0 0 0px","display":"flex","borderStyle":"solid","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"auto","fontSize":"14px","lineHeight":"24px","height":"30px"}'>反馈日期</div>
					<div  :style='{"padding":"0px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","flex":"1","height":"auto"}'>{{detail.fankuiriqi}}</div>
				</div>
				<div class="item" :style='{"padding":"0 10px","margin":"0 0 0px 0","borderColor":"#eee","background":"none","borderWidth":"0 0 0px","display":"flex","borderStyle":"solid","justifyContent":"spaceBetween"}' v-if="centerType">
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"auto","fontSize":"14px","lineHeight":"24px","height":"30px"}'>回复内容</div>
					<div :style='{"padding":"0px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","flex":"1","height":"auto"}'>{{detail.shhf}}</div>
				</div>
				<div class="btn" :style='{"padding":"10px 0","flexWrap":"wrap","display":"flex"}'>
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 5px 0 0","outline":"none","color":"#fff","borderRadius":"0px","background":"#1b1b1b","width":"auto","lineHeight":"36px","fontSize":"14px","height":"36px"}' v-if="btnAuth('ceshifankui','修改')" @click="editClick">修改</el-button>
					<el-button :style='{"border":"1px solid #333","cursor":"pointer","padding":"0 10px","margin":"0 5px 0 0","outline":"none","color":"#333","borderRadius":"8px","background":"none","width":"auto","lineHeight":"36px","fontSize":"14px","height":"36px"}' v-if="btnAuth('ceshifankui','删除')" @click="delClick">删除</el-button>
					<!-- hasChat 无 -->
					<el-button :style='{"border":"1px solid #333","cursor":"pointer","padding":"0 10px","margin":"0 5px 0 0","outline":"none","color":"#333","borderRadius":"8px","background":"none","width":"auto","lineHeight":"36px","fontSize":"14px","height":"36px"}' v-if="btnAuth('ceshifankui','审核')" @click="onSH" type="warning">回复</el-button>
				</div>
			</div>
		</div>
		
			<div class="swiper3" v-if="detailBanner.length" :style='{"width":"53%","margin":"0 2% 30px 0","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <div class="big" :style='{"border":"0px solid #1abc9e50","margin":"0px","background":"#fff","width":"calc(100% - 165px)","position":"relative","height":"470px","order":"2"}'>
				<img id="big" :style='{"width":"100%","objectFit":"cover","display":"block","height":"100%","zIndex":"1"}' :src="swiperBigUrl" class="image">
			  </div>
			  <div class="samll" :style='{"padding":"0","overflow":"hidden","flexWrap":"wrap","background":"#fff","display":"flex","width":"145px","justifyContent":"space-between","height":"412px"}'>
			    <div :style='{"border":"0px solid #1abc9e50","width":"100%","margin":"0 0 10px","position":"relative","background":"#fff","height":"90px"}' v-for="item in detailBanner" :key="item.id">
				  <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"100%","zIndex":"1"}' v-if="item.substr(0,4)=='http'" :src="item" @click="swiperClick3(item)" class="image">
				  <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"100%","zIndex":"1"}' v-else :src="baseUrl + item" @click="swiperClick3(baseUrl + item)" class="image">
			    </div>
			  </div>
			</div>


		

		
		<el-tabs class="detail" :style='{"border":"0px solid #1abc9e20","boxShadow":"1px 2px 4px #ccc","margin":"20px auto","borderRadius":"10px","background":"#fff","display":"block","width":"100%","order":"10"}' v-model="activeName" type="border-card">
																		<el-tab-pane label="测试反馈" name="first">
				<div v-html="detail.ceshifankui"></div>
			</el-tab-pane>
													</el-tabs>
		<el-dialog title="回复" :visible.sync="sfshVisiable" width="50%">
			<el-form ref="form" :model="form" label-width="80px">
				<el-form-item label="内容">
					<el-input type="textarea" :rows="8" v-model="shForm.shhf"></el-input>
				</el-form-item>
			</el-form>
			<span slot="footer" class="dialog-footer">
				<el-button @click="sfshVisiable = false">取 消</el-button>
				<el-button type="primary" @click="shHandler">确 定</el-button>
			</span>
		</el-dialog>
	</div>
	<div class="share_view" :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","position":"fixed","right":"0","bottom":"20%","background":"#fff","zIndex":"11"}'>
	</div>
</div>
</template>

<script>
  import CountDown from '@/components/CountDown';
  import axios from 'axios'
  import Swiper from "swiper";
  
  export default {
    //数据集合
    data() {
      return {
        tablename: 'ceshifankui',
        baseUrl: '',
        breadcrumbItem: [
          {
            name: '测试反馈'
          }
        ],
        title: '',
        detailBanner: [],
		id: 0,
        detail: {},
        activeName: 'first',
        total: 1,
        pageSize: 5,
		pageSizes: [10,20,30,50],
        totalPage: 1,
        buynumber: 1,
        sfshVisiable: false,
        shForm: {
          sfsh: '是',
          shhf: ''
        },
		centerType: false,
		shareUrl: location.href,
		swiperBigUrl: null,
      }
    },
    created() {
		if(this.$route.query.centerType) {
			this.centerType = true
		}
		
        this.init();
    },
	mounted() {
	},
    //方法集合
    methods: {
		swiperClick3(src) {
			this.swiperBigUrl = src
		},
        init() {
		  this.id = this.$route.query.id
          this.baseUrl = this.$config.baseUrl;
          this.$http.get(this.tablename + '/detail/'  + this.id, {}).then(res => {
            if (res.data.code == 0) {
              this.detail = res.data.data;
              this.title = this.detail.youximingcheng;
              this.detailBanner = this.detail.youxifengmian ? this.detail.youxifengmian.split(",") : [];
              this.$forceUpdate();

				if(localStorage.getItem('frontToken')){
				}

            }
			if (this.detailBanner.length) {
				if (this.detailBanner[0].substr(0,4)=='http') {
					this.swiperBigUrl = this.detailBanner[0]
				} else {
					this.swiperBigUrl = this.baseUrl + this.detailBanner[0]
				}
			}
          });
        },
      onSH() {
        this.sfshVisiable = true;
      },
      shHandler(){
        this.$confirm(`确定操作?`, "提示", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(() => {
          this.detail.shhf = this.shForm.shhf;
          this.$http.post(`${this.tablename}/update`, this.detail).then(res => {
            if (res.data.code == 0) {
              this.sfshVisiable = false;
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
              });
            }
          });
        });
      },
      curChange(page) {
        this.getDiscussList(page);
      },
      prevClick(page) {
        this.getDiscussList(page);
      },
      nextClick(page) {
        this.getDiscussList(page);
      },
		// 返回按钮
		backClick(){
			history.back()
		},
		// 下载
		download(file){
			if(!file) {
				this.$message({
				  type: 'error',
				  message: '文件不存在',
				  duration: 1500,
				});
				return;
			}
		  let arr = file.replace(new RegExp('upload/', "g"), "")
		  axios.get(this.baseUrl + '/file/download?fileName=' + arr, {
		  	headers: {
		  		token: localStorage.getItem("frontToken")
		  	},
		  	responseType: "blob"
		  }).then(({
		  	data
		  }) => {
		  	const binaryData = [];
		  	binaryData.push(data);
		  	const objectUrl = window.URL.createObjectURL(new Blob(binaryData, {
		  		type: 'application/pdf;chartset=UTF-8'
		  	}))
		  	const a = document.createElement('a')
		  	a.href = objectUrl
		  	a.download = arr
		  	// a.click()
		  	// 下面这个写法兼容火狐
		  	a.dispatchEvent(new MouseEvent('click', {
		  		bubbles: true,
		  		cancelable: true,
		  		view: window
		  	}))
		  	window.URL.revokeObjectURL(data)
		  },err=>{
			  axios.get((location.href.split(this.$config.name).length>1 ? location.href.split(this.$config.name)[0] :'') + this.$config.name + '/file/download?fileName=' + arr, {
			  	headers: {
			  		token: localStorage.getItem("frontToken")
			  	},
			  	responseType: "blob"
			  }).then(({
			  	data
			  }) => {
			  	const binaryData = [];
			  	binaryData.push(data);
			  	const objectUrl = window.URL.createObjectURL(new Blob(binaryData, {
			  		type: 'application/pdf;chartset=UTF-8'
			  	}))
			  	const a = document.createElement('a')
			  	a.href = objectUrl
			  	a.download = arr
			  	// a.click()
			  	// 下面这个写法兼容火狐
			  	a.dispatchEvent(new MouseEvent('click', {
			  		bubbles: true,
			  		cancelable: true,
			  		view: window
			  	}))
			  	window.URL.revokeObjectURL(data)
			  })
		  })
      },


		// 权限判断
		btnAuth(tableName,key){
			if(this.centerType){
				return this.isBackAuth(tableName,key)
			}else{
				return this.isAuth(tableName,key)
			}
		},
		// 修改
		editClick(){
			this.$router.push(`/index/ceshifankuiAdd?type=edit&&id=${this.detail.id}`);
		},
		// 删除
		delClick(){
			this.$confirm('是否删除此测试反馈？')
			  .then(_ => {
			    this.$http.post('ceshifankui/delete', [this.detail.id]).then(res => {
			      if (res.data.code == 0) {
			        this.$message({
			          type: 'success',
			          message: '删除成功!',
			          duration: 1500,
					  onClose: () => {
						  history.back()
					  }
			        });
			      }
			    });
			  }).catch(_ => {});
		},
    },
    components: {
      CountDown
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.editor /deep/ .avatar-uploader {
		height: 0;
		line-height: 0;
	}
	
	.detail-preview {
	
	  .attr {
	    .el-carousel /deep/ .el-carousel__indicator button {
	      width: 0;
	      height: 0;
	      display: none;
	    }
	
	    .el-input-number__decrease:hover:not(.is-disabled)~.el-input .el-input__inner:not(.is-disabled), .el-input-number__increase:hover:not(.is-disabled)~.el-input .el-input__inner:not(.is-disabled) {
	      border-color: none;
	    }
	  }
	
	  .detail {
	    & /deep/ .el-tabs__header .el-tabs__nav-wrap {
	      margin-bottom: 0;
	    }
	
	    & .add .el-textarea {
	      width: auto;
	    }
	  }
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left:hover {
		background: red;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right:hover {
		background: red;
	}

	.attr .el-carousel /deep/ .el-carousel__indicators {
		padding: 0;
		margin: 0;
		z-index: 2;
		position: absolute;
		list-style: none;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 0.4;
		transition: 0.3s;
		height: 12px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li:hover {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 24px;
		opacity: 0.7;
		height: 12px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li.is-active {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 24px;
		opacity: 1;
		height: 12px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__decrease {
		cursor: pointer;
		z-index: 1;
		display: flex;
		border-color: #DCDFE6;
		border-radius: 0px 0 0 0px;
		top: 2px;
		left: 1px;
		background: #8a8a8a;
		width: 40px;
		justify-content: center;
		border-width: 0 1px 0 0;
		align-items: center;
		position: absolute;
		border-style: solid;
		text-align: center;
		height: 32px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__decrease i {
		color: #fff;
		font-size: 14px;
	}

	.attr .el-input-number /deep/ .el-input-number__increase {
		cursor: pointer;
		z-index: 1;
		display: flex;
		border-color: #DCDFE6;
		right: 1px;
		border-radius: 0 0px 0px 0;
		top: 2px;
		background: #833cf7;
		width: 40px;
		justify-content: center;
		border-width: 0 0 0 1px;
		align-items: center;
		position: absolute;
		border-style: solid;
		text-align: center;
		height: 32px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__increase i {
		color: #fff;
		font-size: 14px;
	}
	
	.attr .el-input-number /deep/ .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		border-radius: 0px;
		padding: 0 10px;
		outline: none;
		color: #666;
		background: #fff;
		display: inline-block;
		width: 100%;
		font-size: 14px;
		line-height: 34px;
		text-align: center;
		height: 34px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header {
		border-radius: 10px 10px 0 0;
		padding: 0 16px;
		margin: 0;
		background: #000;
		border-color: #1abc9e20;
		border-width: 0 0 1px 0;
		border-style: solid;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item {
		border: 0;
		padding: 0 20px;
		margin: 0;
		color: #999;
		background: transparent;
		font-weight: 500;
		display: inline-block;
		font-size: 14px;
		line-height: 40px;
		position: relative;
		list-style: none;
		height: 40px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
		border: 0;
		color: #fff;
		background: #7c3ef3;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
		border: 0;
		color: #fff;
		background: #7c3ef3;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__content {
		padding: 15px;
	}
	
	.detail-preview .detail.el-tabs .add /deep/ .el-form-item__label {
		padding: 0 10px 0 0;
		color: #666;
		width: 80px;
		font-size: 14px;
		line-height: 40px;
		text-align: right;
	}
	
	.detail-preview .detail.el-tabs .add /deep/ .el-textarea__inner {
	}
	
	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__separator {
		margin: 0 9px;
		color: #999;
		font-weight: 500;
	}
	
	.breadcrumb-preview .el-breadcrumb .item1 /deep/ .el-breadcrumb__inner a {
		color: #7c3ef3;
		display: inline-block;
	}
	
	.breadcrumb-preview .el-breadcrumb .item2 /deep/ .el-breadcrumb__inner a {
		color: #333;
		display: inline-block;
	}
		
	.breadcrumb-preview .el-breadcrumb .item3 /deep/ .el-breadcrumb__inner a {
		color: #666;
		display: inline-block;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__total {
		margin: 0 10px 0 0;
		color: #666;
		font-weight: 400;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-prev {
		border: none;
		border-radius: 2px;
		padding: 0 10px;
		margin: 0 5px;
		color: #666;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-next {
		border: none;
		border-radius: 2px;
		padding: 0 10px;
		margin: 0 5px;
		color: #666;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-prev:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 2px;
		padding: 0 10px;
		margin: 0 5px;
		color: #C0C4CC;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-next:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 2px;
		padding: 0 10px;
		margin: 0 5px;
		color: #C0C4CC;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pager {
		padding: 0;
		margin: 0;
		display: inline-block;
		vertical-align: top;
	}
	
	#pagination.el-pagination /deep/ .el-pager .number {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #666;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #f4f4f5;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pager .number:hover {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #fff;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #833cf7;
		text-align: center;
		min-width: 30px;
		height: 28px;
}

#pagination.el-pagination /deep/ .el-pager .number.active {
		cursor: default;
		padding: 0 4px;
		margin: 0 5px;
		color: #FFF;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #833cf7;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes {
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input {
		margin: 0 5px;
		width: 100px;
		position: relative;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 25px 0 8px;
		color: #606266;
		display: inline-block;
		font-size: 13px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input span.el-input__suffix {
		top: 0;
		position: absolute;
		right: 0;
		height: 100%;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__suffix .el-select__caret {
		cursor: pointer;
		color: #C0C4CC;
		width: 25px;
		font-size: 14px;
		line-height: 28px;
		text-align: center;
	}

	#pagination.el-pagination /deep/ .el-pagination__jump {
		margin: 0 0 0 24px;
		color: #606266;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__jump .el-input {
		border-radius: 3px;
		padding: 0 2px;
		margin: 0 2px;
		display: inline-block;
		width: 50px;
		font-size: 14px;
		line-height: 18px;
		position: relative;
		text-align: center;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__jump .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 3px;
		color: #606266;
		display: inline-block;
		font-size: 14px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
	.share_view{
		position: fixed;
		right:0;
		bottom: 20%;
		background: #fff;
		box-shadow: 0 4px 6px rgba(0,0,0,.1);
		.share{
			width: 40px;
			height: 40px;
			display: flex;
			align-items: center;
			justify-content: center;
			border-bottom: 1px solid #eee;
			cursor: pointer;
		}
		.share:last-of-type{
			border:none;
		}
	}


	.detail-preview .el-rate /deep/ .el-rate__item {
				cursor: pointer;
				margin: 0 5px 0 0;
				display: inline-block;
				vertical-align: middle;
				font-size: 0;
				position: relative;
			}
	
	.detail-preview .el-rate /deep/ .el-rate__item .el-rate__icon {
				margin: 0 3px;
				display: block;
				font-size: 18px;
				position: relative;
				transition: .3s;
			}
</style>
