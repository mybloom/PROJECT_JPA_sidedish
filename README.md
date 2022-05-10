# JPA Project - sidedish 

온라인 반찬가게 프로젝트
- API 개발 : Spring Boot , JPA

## 요구사항 분석 

- [요구사항 분석서](docs/Requirement.md)

## DB 설계서

- ERD
  ![jpa_online_sidedish_store_erd_v2](https://user-images.githubusercontent.com/55780251/167534854-902d2771-aff6-43a3-8728-2bce085142b3.jpg)

### API 명세서

- [API목록 및 명세](https://docs.google.com/spreadsheets/d/1TktG_6pXnqeaH53Gtxi-5Z3_1cS_CxB0vGncvn4hCrg/edit?usp=sharing)


| no  |구분1|구분2|기능|HTTP Method|URI|URI 추가 제공 파라미터|
|-----|---|----|-----|-------------|----|-----------|
| 1   | 카테고리|최상위 카테고리에 대한 카테고리 목록 제공|GET|/categories/|
| 2   | 기획전|기획전에 대한 카테고리 목록 제공|GET	|/categories/exhibition/|
| 3   | 상품 목록|최상위 카테고리	|선택한 최상위 카테고리에 대한 반찬목록 제공|	GET|/sidedishes/category/{categoryId}?super=true|	page={pageNo}&page_count={pageCountNum}|
| 4   | 상품 목록|하위 카테고리|	선택한 하위 카테고리에 대한 반찬목록 제공	GET	/sidedishes/category/{categoryId}?super=false|	page={pageNo}&page_count={pageCountNum}|
| 5   | 상품 목록|기획전 특정 카테고리	|선택한 기획전 하위 카테고리에 대한 반찬목록 제공	GET	/sidedishes/exhibition/{categoryId}?sub_category={categoryId}|	page={pageNo}&page_count={pageCountNum}|
| 6   | 상품 상세|선택한 상품의 상세 정보 제공|	GET|	/sidedishes/{sidedishId}| |
| 7   | 주문	|로그인한 회원의 상품 주문|	POST	|/orders/	| |


