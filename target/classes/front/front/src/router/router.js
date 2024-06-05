import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import youxifenleiList from '../pages/youxifenlei/list'
import youxifenleiDetail from '../pages/youxifenlei/detail'
import youxifenleiAdd from '../pages/youxifenlei/add'
import youxixinxiList from '../pages/youxixinxi/list'
import youxixinxiDetail from '../pages/youxixinxi/detail'
import youxixinxiAdd from '../pages/youxixinxi/add'
import youxiwupinList from '../pages/youxiwupin/list'
import youxiwupinDetail from '../pages/youxiwupin/detail'
import youxiwupinAdd from '../pages/youxiwupin/add'
import baomingxinxiList from '../pages/baomingxinxi/list'
import baomingxinxiDetail from '../pages/baomingxinxi/detail'
import baomingxinxiAdd from '../pages/baomingxinxi/add'
import ceshifankuiList from '../pages/ceshifankui/list'
import ceshifankuiDetail from '../pages/ceshifankui/detail'
import ceshifankuiAdd from '../pages/ceshifankui/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'youxifenlei',
					component: youxifenleiList
				},
				{
					path: 'youxifenleiDetail',
					component: youxifenleiDetail
				},
				{
					path: 'youxifenleiAdd',
					component: youxifenleiAdd
				},
				{
					path: 'youxixinxi',
					component: youxixinxiList
				},
				{
					path: 'youxixinxiDetail',
					component: youxixinxiDetail
				},
				{
					path: 'youxixinxiAdd',
					component: youxixinxiAdd
				},
				{
					path: 'youxiwupin',
					component: youxiwupinList
				},
				{
					path: 'youxiwupinDetail',
					component: youxiwupinDetail
				},
				{
					path: 'youxiwupinAdd',
					component: youxiwupinAdd
				},
				{
					path: 'baomingxinxi',
					component: baomingxinxiList
				},
				{
					path: 'baomingxinxiDetail',
					component: baomingxinxiDetail
				},
				{
					path: 'baomingxinxiAdd',
					component: baomingxinxiAdd
				},
				{
					path: 'ceshifankui',
					component: ceshifankuiList
				},
				{
					path: 'ceshifankuiDetail',
					component: ceshifankuiDetail
				},
				{
					path: 'ceshifankuiAdd',
					component: ceshifankuiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
