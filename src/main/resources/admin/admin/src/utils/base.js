const base = {
    get() {
        return {
            url : "http://localhost:8080/springboott9jh4c61/",
            name: "springboott9jh4c61",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboott9jh4c61/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Spring Boot的游戏推荐系统"
        } 
    }
}
export default base
