<template>
<div :style='{"width":"100%","padding":"100px 18% 60px","margin":"0px auto","position":"relative","background":"url(http://codegen.caihongy.cn/20231029/b89b677f7bba41d694305c19dc3b820d.jpg) no-repeat center top,#fff"}'>
    <el-form
	  :style='{"border":"1px solid #333","width":"100%","padding":"30px","position":"relative","background":"#fcfcfc"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="游戏名称" prop="youximingcheng">
            <el-input v-model="ruleForm.youximingcheng" 
                placeholder="游戏名称" clearable :disabled=" false  ||ro.youximingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="游戏分类" prop="youxifenlei">
            <el-select v-model="ruleForm.youxifenlei" placeholder="请选择游戏分类" :disabled=" false  ||ro.youxifenlei" >
              <el-option
                  v-for="(item,index) in youxifenleiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="游戏封面" v-if="type!='cross' || (type=='cross' && !ro.youxifengmian)" prop="youxifengmian">
            <file-upload
            tip="点击上传游戏封面"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.youxifengmian?ruleForm.youxifengmian:''"
            @change="youxifengmianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="游戏封面" prop="youxifengmian">
                <img v-if="ruleForm.youxifengmian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.youxifengmian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.youxifengmian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="游戏标签" prop="youxibiaoqian">
            <el-input v-model="ruleForm.youxibiaoqian" 
                placeholder="游戏标签" clearable :disabled=" false  ||ro.youxibiaoqian"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="视频介绍" v-if="type!='cross' || (type=='cross' && !ro.shipinjieshao)" prop="shipinjieshao">
            <file-upload
            tip="点击上传视频介绍"
            action="file/upload"
            :limit="1"
            :multiple="true"
            :fileUrls="ruleForm.shipinjieshao?ruleForm.shipinjieshao:''"
            @change="shipinjieshaoUploadChange"
            ></file-upload>
          </el-form-item>
		  <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="视频介绍" prop="shipinjieshao">
			<el-button v-if="ruleForm.shipinjieshao" @click="download(baseUrl + ruleForm.shipinjieshao)" type="success">预览</el-button>
			<el-button v-else disabled>暂无</el-button>
		  </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="游戏厂商" prop="youxichangshang">
            <el-input v-model="ruleForm.youxichangshang" 
                placeholder="游戏厂商" clearable :disabled=" false  ||ro.youxichangshang"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="游戏详情" prop="youxixiangqing">
            <editor 
                :style='{"minHeight":"250px","padding":"0","margin":"0","borderColor":"#1abc9e30","backgroundColor":"none","borderRadius":"0","borderWidth":"0px","background":"#fff","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.youxixiangqing" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#833cf6","width":"110px","lineHeight":"36px","fontSize":"14px","height":"36px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"0px solid #eee","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"4px","background":"#000","width":"110px","lineHeight":"36px","fontSize":"14px","height":"36px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				youximingcheng : false,
				youxifenlei : false,
				youxifengmian : false,
				youxibiaoqian : false,
				shipinjieshao : false,
				youxichangshang : false,
				youxixiangqing : false,
				clicktime : false,
				storeupnum : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          youximingcheng: '',
          youxifenlei: '',
          youxifengmian: '',
          youxibiaoqian: '',
          shipinjieshao: '',
          youxichangshang: '',
          youxixiangqing: '',
          clicktime: '',
          storeupnum: '',
        },
        youxifenleiOptions: [],


        rules: {
          youximingcheng: [
            { required: true, message: '游戏名称不能为空', trigger: 'blur' },
          ],
          youxifenlei: [
            { required: true, message: '游戏分类不能为空', trigger: 'blur' },
          ],
          youxifengmian: [
          ],
          youxibiaoqian: [
          ],
          shipinjieshao: [
          ],
          youxichangshang: [
          ],
          youxixiangqing: [
          ],
          clicktime: [
          ],
          storeupnum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='youximingcheng'){
              this.ruleForm.youximingcheng = obj[o];
              this.ro.youximingcheng = true;
              continue;
            }
            if(o=='youxifenlei'){
              this.ruleForm.youxifenlei = obj[o];
              this.ro.youxifenlei = true;
              continue;
            }
            if(o=='youxifengmian'){
              this.ruleForm.youxifengmian = obj[o].split(",")[0];
              this.ro.youxifengmian = true;
              continue;
            }
            if(o=='youxibiaoqian'){
              this.ruleForm.youxibiaoqian = obj[o];
              this.ro.youxibiaoqian = true;
              continue;
            }
            if(o=='shipinjieshao'){
              this.ruleForm.shipinjieshao = obj[o];
              this.ro.shipinjieshao = true;
              continue;
            }
            if(o=='youxichangshang'){
              this.ruleForm.youxichangshang = obj[o];
              this.ro.youxichangshang = true;
              continue;
            }
            if(o=='youxixiangqing'){
              this.ruleForm.youxixiangqing = obj[o];
              this.ro.youxixiangqing = true;
              continue;
            }
            if(o=='clicktime'){
              this.ruleForm.clicktime = obj[o];
              this.ro.clicktime = true;
              continue;
            }
            if(o=='storeupnum'){
              this.ruleForm.storeupnum = obj[o];
              this.ro.storeupnum = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.$http.get('option/youxifenlei/youxifenlei', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.youxifenleiOptions = res.data.data;
          }
        });

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`youxixinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('youxixinxi/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`youxixinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`youxixinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      youxifengmianUploadChange(fileUrls) {
          this.ruleForm.youxifengmian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
      shipinjieshaoUploadChange(fileUrls) {
          this.ruleForm.shipinjieshao = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #000;
	  font-weight: 500;
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #333;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: #fff;
	  width: auto;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #333;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: #fff;
	  width: auto;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px;
	  color: #666;
	  background: #fff;
	  width: auto;
	  font-size: 14px;
	  border-color: #333;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px 0 30px;
	  color: #666;
	  background: #fff;
	  width: auto;
	  font-size: 14px;
	  border-color: #333;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  cursor: pointer;
	  border-radius: 50px;
	  color: #333;
	  background: #fff;
	  width: 160px;
	  font-size: 32px;
	  border-color: #333;
	  border-width: 1px;
	  line-height: 60px;
	  border-style: solid;
	  text-align: center;
	  height: 60px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  cursor: pointer;
	  border-radius: 50px;
	  color: #333;
	  background: #fff;
	  width: 160px;
	  font-size: 32px;
	  border-color: #333;
	  border-width: 1px;
	  line-height: 60px;
	  border-style: solid;
	  text-align: center;
	  height: 60px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  cursor: pointer;
	  border-radius: 50px;
	  color: #333;
	  background: #fff;
	  width: 160px;
	  font-size: 32px;
	  border-color: #333;
	  border-width: 1px;
	  line-height: 60px;
	  border-style: solid;
	  text-align: center;
	  height: 60px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #333;
	  border-radius: 0px;
	  padding: 12px;
	  color: #666;
	  background: #fff;
	  width: auto;
	  font-size: 14px;
	  min-width: 500px;
	  height: 120px;
	}
</style>
