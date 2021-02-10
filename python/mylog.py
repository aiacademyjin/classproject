import logging

# logger 생성
logger = logging.getLogger('myapp')

# log를 파일에 저장 : FileHandler
myapp_handler = logging.FileHandler('myapp.log')
# 출력용 문자열 포맷 정의
formatter = logging.Formatter('%(asctime)s %(levelname)s %(process)d %(message)s')
# 핸들러에 문자 포맷터 설정
myapp_handler.setFormatter(formatter)
# 로거에 핸들러를 등록
logger.addHandler(myapp_handler)
# 로거의 레벨 설정
logger.setLevel(logging.INFO)

logger.error('Error !!!')
logger.info('information')