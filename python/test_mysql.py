import pymysql


project_db = pymysql.connect(
user='aia',
passwd='aia',
host='127.0.0.1',
db='open',
charset='utf8'
)

cursor1 = project_db.cursor()
key_word = 'cool'

sql = "SELECT membername FROM member where membername like \'%시원한%\'" 
cursor1.execute(sql) 
result1 = cursor1.fetchall()

print(result1)
