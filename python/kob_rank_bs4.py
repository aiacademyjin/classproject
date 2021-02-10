#import urllib.request as req
from urllib import request
from bs4 import BeautifulSoup 
import re

url = 'https://sports.news.naver.com/kbaseball/record/index.nhn?category=kbo'

target = request.urlopen(url)

soup = BeautifulSoup(target, 'html.parser')

#print(soup.title)
#print(soup.title.string)

#print(soup.img)
#print(soup.img['src'])

# 검색 함수
# find() : 해당 테그의 첫번째 테그의 정보만 반환
# find_all() : 여러개의 테그 정보를 반환 - list로 반환

# find() : 하나의 테그 추출
#print(soup.find('a'))
#print(soup.find('a', class_='logo'))
##print(soup.find(id='team_LG'))

# 여러개 테그를 추출
tag_1 = soup.find_all(text='순위')
#print(tag_1)

tag_2 = soup.find_all(text=re.compile('순위'))
#print(tag_2)

print('---------------------------------------------------------------')
for tag in soup.find_all('a'):
    #print(tag)
    pass

for tag in soup.find_all('a', attrs={'class', 'logo'}):
    #print(tag)
    pass

for tag in soup.find_all(['a', 'img']):
    #print(tag)
    pass

for i, tag in enumerate(soup.select('td>div>span[id]'), start=1):
    print(i, '위', tag.string)