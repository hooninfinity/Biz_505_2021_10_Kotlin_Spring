$(function () {
    $("nav li").on("click",function (){
        const className = $(this).attr("class")
        const tagId = $(this).attr("id")
        const tagName = $(this).attr("name")
        const text = $(this).text()

        let href = `${rootPath}`
        if (text === "독서리스트") {
            href += "list"
        } else if (text === "글쓰기") {
            href += "insert"
        } else if (text === "내 정보") {
            href += "member/mypage"
        }
        location.href = `${href}`
    })
})