function deleteCart(num) {
    // console.log(num);

    /* hidden속성 : 제품넘버 */
    let pNum = document.getElementById('pNum');
    pNum.value = num;                                       // 히든 속성에 받아온 num값 넘김
    // console.log(pNum.value);

    location.href = 'deleteCart?pNum=' + num;
}