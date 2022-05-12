/* # category */
/* ## 최상위 category*/
insert into category(category_id, title, parent_category_id)
values(1, '메인요리',null), (2, '메인요리',null),(3, '메인요리',null);

/*## 하위 category*/
insert into category(category_id, title, parent_category_id)
values(4, '육류요리',1),(5, '해산물요리',1);

insert into category(category_id, title, parent_category_id)
values(6, '국/탕/찌개',2);

insert into category(category_id, title, parent_category_id)
values(7, '나물/무침',3),(8, '조림/볶음',3),(9, '절임/장아찌',3);


