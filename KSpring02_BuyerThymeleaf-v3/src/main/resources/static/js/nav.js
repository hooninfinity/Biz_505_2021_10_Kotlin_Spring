$(function(){

//    $("li.login").on("click",function(){
//        location.href = "/login"
//    })
//    $("li.pay").on("click",function(){
//        location.href = "/pay"
//    })
//    $("li.home").on("click",function(){
//        location.href = "/"
//    })

    $("nav li").on("click",function(){
        // this : js 에서 e.currentTarget 과 같다
        // 클릭된 곳에서 class, id값, name값, text값 추출해올때는 이렇게 쓴다
        const className = $(this).attr("class")
        const tagId = $(this).attr("id")
        const tagName = $(this).attr("name")
        const text = $(this).text()

        /*
        JS Debugging
        여러개 변수 데이터를 alert() 으로 보고 싶을때
        데이터들을 JSON 객체로 만들고
        JSON.stringify() 문자열로 바꿔서 alert() 에 표시
        */
//        const tagInform = {
//            tagName, tagId, className, text
//        }
//        alert(JSON.stringify(tagInform))

        let href = "/"
        if(text === "주문관리") {
            href += "order"
        } else if(text === "결제관리") {
            href += "pay"
        } else if(text === "로그인") {
            href += "login"
        }
        location.href = `${href}`
    })




})