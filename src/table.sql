--상품목록 테이블
create table itemList(
                         p_num       number              primary key,        --제품 번호
                         p_name      varchar2(20)        not null,           --제품명
                         amount      number              default 0,          --제품 수량
                         price       number              default 0           --제품 가격
);

--상품번호 시퀀스 생성
create sequence items_seq increment by 1 start with 1;

insert into itemList values(items_seq.nextval, '미니선풍기', 5, 19900);
insert into itemList values(items_seq.nextval, '텀블러', 20, 24500);
insert into itemList values(items_seq.nextval, '알새우칩', 100, 1500);
insert into itemList values(items_seq.nextval, '보습크림', 15, 9900);
insert into itemList values(items_seq.nextval, '마스크50EA', 200, 30000);

drop table ORDERLIST;
--주문목록 테이블
create table orderList(
                          orderNum   number                  primary key,    --주문 번호
                          usrId      varchar2(20)            not null,       --유저 ID
                          usrName    varchar2(20)            not null,       --유저 이름
                          usrAddress varchar2(100)           not null,       --주소
                          pName      varchar2(20),                           --제품 명
                          pAmount    number,                                 --제품 수량
                          pPrice      number,                                 --제품 가격
                          pNum       REFERENCES itemList(p_num)              --제품 번호
);

--주문번호 시퀀스 생성
create sequence orders_seq increment by 1 start with 1;


select * from orderList;
select * from itemList;
