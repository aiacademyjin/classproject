SELECT `member`.`idx`,
    `member`.`userid`,
    `member`.`password`,
    `member`.`username`,
    `member`.`regdate`
FROM `project`.`member`;
SELECT * FROM project.member;

INSERT INTO `project`.`member`
(`idx`, `userid`, `password`, `username`, `regdate`) 
VALUES (<{idx: }>, <{userid: }>, <{password: }>, <{username: }>,  <{regdate: CURRENT_TIMESTAMP}>)
;

INSERT INTO `project`.`member`
(`userid`, `password`, `username`) 
VALUES ('king', '1111', 'KING')
;

UPDATE `project`.`member`
SET
`idx` = <{idx: }>,
`userid` = <{userid: }>,
`password` = <{password: }>,
`username` = <{username: }>,
`regdate` = <{regdate: CURRENT_TIMESTAMP}>
WHERE `idx` = <{expr}>;



UPDATE `project`.`member`
SET
`password` = '1234',
`username` = 'COOL'
WHERE `idx` = 1;


DELETE FROM `project`.`member`
WHERE <{where_expression}>;


DELETE FROM `project`.`member`
WHERE idx=1;

select * from project.member;

rollback;

commit;

CREATE TABLE `member` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `userid` varchar(12) NOT NULL,
  `password` varchar(16) NOT NULL,
  `username` varchar(45) NOT NULL,
  `regdate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='서비스의 이용자 : 회원의 정보를 저장합니다.';









