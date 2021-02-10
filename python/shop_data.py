import csv

line_counter = 0    # csv 파일의 총 행의 수
data_header = []    # 리스트의 해더
sample_list = []    # 리스트의 요소(행)
insert_count = 0    # 새로운 행이 몇개 입력되었는지 카운트

insert_list = []



# 07_24_05_P_1.csv -> sapmle_list 리스트에 저장
with open('07_24_05_P_1.csv') as file:
    while True:
        data = file.readline().strip('\n')

        # 마지막 줄 -> 더이상 가져올 데이터가 없으면 None 반환 -> 반복문을 탈출
        if not data:
            break

        if line_counter == 0 : # header 저장
            data_header = data.split(',')
            print(data_header)
        else:
            # 새로운 리스트에 추가할 행
            insert_list = data.split(',')
            #insert_list[6].strip()
            
            #print(insert_list)
            # 1-> 영업중, 3-> 폐업 , 커피숍, 서울지역
            if insert_list[1] == '1' and insert_list[4] == '커피숍' and insert_list[2].find(u'서울특별시') != -1:
                sample_list.append(insert_list)
                insert_count += 1

        line_counter += 1

print('total-Count', line_counter)
print('insert-count', insert_count)

for i in range(20):
    print('data-',i,':', sample_list[i])

with open('new_shop_coffe_seoul_data.csv', 'w', encoding='utf8') as new_file:
    writer = csv.writer(new_file, delimiter=',', quotechar="'", quoting=csv.QUOTE_ALL)

    # 해더 쓰기
    writer.writerow(data_header)
    for row in sample_list:
        writer.writerow(row)
    print('쓰기 완료')


# 현재 영업중인 서울시에 위치한 커피숍에서 스타벅스만 찾아 저장
for shop in sample_list:
    if shop[3].find(u'스타벅스') != -1:
        insert_list.append(shop)

with open('new_coffe_star_data.csv', 'w', encoding='utf-8') as star_file:
    for star_shop in insert_list:
       star_file.write(','.join(star_shop).strip('\n')+'\n') 
    print('서울_스타벅스_리스트 파일 생성')

print('파일작성이 완료되었습니다.')

for s_shop in insert_list:
    print(s_shop)




