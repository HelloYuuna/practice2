// 상세보기로 이동
function gotoDetail(pnum) {
    console.log(pnum);
    location.href = 'detail?pnum=' + pnum;
}

// 장바구니로 이동
function gotoCart() {
    // console.log(pnum);

    return confirm("물건을 담으시겠습니까?");
}