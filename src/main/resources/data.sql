/* # category */
/* ## 최상위 category*/
insert into category(category_id, title, parent_category_id)
values (1, '메인요리', null),
       (2, '국물요리', null),
       (3, '밑반찬', null);

/*## 하위 category*/
insert into category(category_id, title, parent_category_id)
values (4, '육류요리', 1),
       (5, '해산물요리', 1);

insert into category(category_id, title, parent_category_id)
values (6, '국/탕/찌개', 2);

insert into category(category_id, title, parent_category_id)
values (7, '나물/무침', 3),
       (8, '조림/볶음', 3),
       (9, '절임/장아찌', 3);

/*## sidedish */

/*## 1메인요리 _4육류요리*/
INSERT INTO sidedish(sidedish_id, name, description, price, stock_quantity)
VALUES (1, '감칠맛 나는 매콤한 양념', '오리 주물럭_반조리', 15800, 1000);
INSERT INTO sidedish(sidedish_id, name, description, price, stock_quantity)
VALUES (2, '소갈비찜', '촉촉하게 밴 양념이 일품', 28900, 1000);
INSERT INTO sidedish(sidedish_id, name, description, price, stock_quantity)
VALUES (3, '쭈꾸미 한돈 제육볶음_반조리', '쫄깃한 쭈꾸미와 고소한 돼지고기가 일품', 16900, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (4, '잡채', '탱글한 면과 맛깔진 고명이 가득', 12900, 1000);

/*## 1메인요리 _5해산물요리*/
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (5, '간장 코다리조림', '쫀득한 코디를 국내산 간장소스로 맛있게 조렸어요', 14900, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (6, '새콤달콤 오징어무침', '국내산 오징어를 새콤달콤하게', 7500, 1000);

/*## 2국물요리_6국/탕/찌개*/
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (7, '한돈 돼지 김치찌개', '김치찌개에는 역시 돼지고기', 9300, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (8, '된장찌개', '특별하지 않아서 더 좋은 우리맛', 8800, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (9, '미역오이냉국', '여름엔 시원한 냉국이 최고', 7500, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (10, '동태찌개', '겨울철 보양식으로 안성맞춤', 10900, 1000);

/*## 3밑반찬_7나물/무침*/
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (11, '미나리무침', '향긋한 봄나물 밥도둑', 4300, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (12, '참외오이무침', '달콤 새콤 참외와 오이의 만남', 4300, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (13, '오이소박이', '여름 대표 음식 아삭한 오이 소박이', 7300, 1000);

/*## 3밑반찬_8조림/볶음*/
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (14, '호두 멸치볶음', '잔멸치와 호두가 만나 짭조름하지만 고소하게!', 5800, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (15, '한돈 매콤 안심장조림', '부드러운 한돈 안심살의 매콤함', 6900, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (16, '야채 어묵볶음', '첨가물 없는 순수어묵과 야채의 만남', 4900, 1000);

/*## 3밑반찬_9절임/장아찌*/
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (17, '오이 장아찌', '첨가물 없는 오이 장아찌', 7900, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (18, '마늘 장아찌', '첨가물 없는 육쪽 마늘 장아찌', 6900, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES (19, '무절임', '짜지 않은 아삭한 무절임', 9900, 1000);

/*## Sidedish Image*/
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(1,1,'https://imgur.com/a/kPivzgc',1);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(2,2,'https://imgur.com/a/kPivzgc',1);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(3,3,'https://imgur.com/a/kPivzgc',1);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(4,1,'https://imgur.com/a/kPivzgc',2);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(5,2,'https://imgur.com/a/kPivzgc',2);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(6,3,'https://imgur.com/a/kPivzgc',2);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(7,1,'https://imgur.com/a/kPivzgc',3);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(8,2,'https://imgur.com/a/kPivzgc',3);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(9,3,'https://imgur.com/a/kPivzgc',3);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(10,1,'https://imgur.com/a/kPivzgc',4);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(11,2,'https://imgur.com/a/kPivzgc',4);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(12,3,'https://imgur.com/a/kPivzgc',4);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(13,1,'https://imgur.com/a/kPivzgc',5);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(14,2,'https://imgur.com/a/kPivzgc',5);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(15,3,'https://imgur.com/a/kPivzgc',5);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(16,1,'https://imgur.com/a/kPivzgc',6);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(17,2,'https://imgur.com/a/kPivzgc',6);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(18,3,'https://imgur.com/a/kPivzgc',6);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(19,1,'https://imgur.com/a/kPivzgc',7);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(20,2,'https://imgur.com/a/kPivzgc',7);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(21,3,'https://imgur.com/a/kPivzgc',7);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(22,1,'https://imgur.com/a/kPivzgc',8);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(23,2,'https://imgur.com/a/kPivzgc',8);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(24,3,'https://imgur.com/a/kPivzgc',8);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(25,1,'https://imgur.com/a/kPivzgc',9);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(26,2,'https://imgur.com/a/kPivzgc',9);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(27,3,'https://imgur.com/a/kPivzgc',9);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(28,1,'https://imgur.com/a/kPivzgc',10);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(29,2,'https://imgur.com/a/kPivzgc',10);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(30,3,'https://imgur.com/a/kPivzgc',10);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(31,1,'https://imgur.com/a/kPivzgc',11);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(32,2,'https://imgur.com/a/kPivzgc',11);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(33,3,'https://imgur.com/a/kPivzgc',11);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(34,1,'https://imgur.com/a/kPivzgc',12);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(35,2,'https://imgur.com/a/kPivzgc',12);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(36,3,'https://imgur.com/a/kPivzgc',12);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(37,1,'https://imgur.com/a/kPivzgc',13);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(38,2,'https://imgur.com/a/kPivzgc',13);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(39,3,'https://imgur.com/a/kPivzgc',13);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(40,1,'https://imgur.com/a/kPivzgc',14);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(41,2,'https://imgur.com/a/kPivzgc',14);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(42,3,'https://imgur.com/a/kPivzgc',14);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(43,1,'https://imgur.com/a/kPivzgc',15);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(44,2,'https://imgur.com/a/kPivzgc',15);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(45,3,'https://imgur.com/a/kPivzgc',15);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(46,1,'https://imgur.com/a/kPivzgc',16);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(47,2,'https://imgur.com/a/kPivzgc',16);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(48,3,'https://imgur.com/a/kPivzgc',16);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(49,1,'https://imgur.com/a/kPivzgc',17);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(50,2,'https://imgur.com/a/kPivzgc',17);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(51,3,'https://imgur.com/a/kPivzgc',17);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(52,1,'https://imgur.com/a/kPivzgc',18);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(53,2,'https://imgur.com/a/kPivzgc',18);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(54,3,'https://imgur.com/a/kPivzgc',18);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(55,1,'https://imgur.com/a/kPivzgc',19);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(56,2,'https://imgur.com/a/kPivzgc',19);
INSERT INTO sidedish_image (sidedish_image_id, image_sequence, image_url, sidedish_id)
VALUES(57,3,'https://imgur.com/a/kPivzgc',19);

/*## Sidedish_Category*/
