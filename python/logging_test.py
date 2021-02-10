import logging

# 로거 정의 
logger = logging.getLogger('main')
# 메시지의 출력 방법 정의
stream_handler = logging.StreamHandler()
# 출력 방법을 등록
logger.addHandler(stream_handler)
# 출력 레벨을 설정
logger.setLevel(logging.WARNING)

logger.debug('틀림!!')
logger.info('처리되었음!! 확인하세요~!!')
logger.warning('조심~!!')
logger.error('에러 발생~!!')
logger.critical('프로그램이 사망!!!!')




