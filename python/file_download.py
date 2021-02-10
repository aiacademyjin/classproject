import urllib.request as req

# 다운로드 주소
url = 'http://storage.googleapis.com/patents/grant_full_text/2014/ipg140107.zip'

fname, header = req.urlretrieve(url, 'ipg140107.zip')

print(fname)
print(header)
