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
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity_quantity)
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
VALUES ('오이 장아찌', '첨가물 없는 오이 장아찌', 7900, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES ('마늘 장아찌', '첨가물 없는 육쪽 마늘 장아찌', 6900, 1000);
INSERT INTO sidedish (sidedish_id, name, description, price, stock_quantity)
VALUES ('무절임', '짜지 않은 아삭한 무절임', 9900, 1000);
