-- 입력 sql
INSERT INTO `open`.`guestbook_message` (guest_name, password, message) VALUES ('test','1234', '반갑습니다.');
-- INSERT INTO guestbook_message (guest_name, password, message) VALUES (?,?,?);


-- 질의 sql
SELECT * FROM open.guestbook_message;
-- SELECT * FROM guestbook_message;


-- 삭제 sql
DELETE FROM `open`.`guestbook_message` WHERE message_id=1;
-- DELETE FROM guestbook_message WHERE message_id=?;
