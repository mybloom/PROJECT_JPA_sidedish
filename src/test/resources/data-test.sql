/* # category */
/* ## 최상위 category*/
insert into category(category_id, title, parent_category_id)
values(1, '메인요리_테스트',null), (2, '국물요리_테스트',null),(3, '밑반찬_테스트',null);

/*## 하위 category*/
insert into category(category_id, title, parent_category_id)
values(4, '육류요리',1),(5, '해산물요리',1);

insert into category(category_id, title, parent_category_id)
values(6, '국/탕/찌개',2);

insert into category(category_id, title, parent_category_id)
values(7, '나물/무침',3),(8, '조림/볶음',3),(9, '절임/장아찌',3);

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

/*## Sidedish_Category*/
INSERT INTO sidedish_category (sidedish_category_id, category_id, sidedish_id)
VALUES
    (1,4,1),
    (2,4,2),
    (3,4,3),
    (4,4,4);

