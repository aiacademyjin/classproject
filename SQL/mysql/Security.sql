select * from open.member;

select idx, memberid, password from open.member;
select idx, memberid, password, md5(password) from open.member order by password;
#select idx, memberid, password, password(idx) from open.member order by password;
select idx, memberid, password, sha1(password) from open.member order by password;


# 암호화
insert into open.member (memberid, password, membername )
values ('test54321', 
HEX(aes_encrypt('1111', SHA2('key_value', 512))) , 
HEX(aes_encrypt('tester', SHA2('key_value', 512)))
);

# 복호화
select memberid,
convert(aes_decrypt(UNHEX(password), SHA2('key_value', 512)) using utf8),
convert(aes_decrypt(UNHEX(membername), SHA2('key_value', 512)) using utf8)
from open.member
where idx=60;


