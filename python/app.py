from flask import Flask

# 웹서버 생성
app = Flask(__name__) # main

# URL Mapping
@app.route('/')  # 사용자가 url / 요청이 오면 아래 함수가 실행되어 응답 한다.
def index():
    return 'Hello~ Python'

@app.route('/hello')
def hello():
    return '<h1>/hello 요청의 응답입니다.</a>'

if __name__ == '__main__':
    app.run(debug=True, port=8000)
