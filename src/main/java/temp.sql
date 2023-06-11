INSERT INTO t_genshin_region(rno, region, region_c)
VALUES (1, 'Mondstadt', '蒙德'),
       (2, 'Liyue', '璃月'),
       (3, 'Inazuma', '稻妻'),
       (4, 'Sumeru', '须弥'),
       (5, 'Fontaine', '枫丹'),
       (6, 'Natlan', '纳塔'),
       (7, 'Snezhnaya', '至冬');
CREATE TABLE IF NOT EXISTS t_sex
(
    sno int(2)   not null UNIQUE,
    sex char(63) not null UNIQUE,
    PRIMARY KEY (sno)
);

insert into t_sex (sno, sex)
VALUES (1, 'man'),
       (2, 'women');

alter table t_sex
    ADD sex_c char(63) UNIQUE;

update t_sex
set sex_c='男'
where sno = 1;
update t_sex
set sex_c='女'
where sno = 2;
select *
from t_sex;

insert into t_sex
set sno=3,
    sex='other',
    sex_c='其他';

desc t_sex;

alter table t_genshin_role
    add name_c varchar(255) UNIQUE;

SELECT *
FROM t_genshin_region;

SELECT *
FROM t_genshin_role;

update t_genshin_role
SET name_c='安柏'
WHERE id = 8;
update t_genshin_role
SET name_c='芭芭拉'
WHERE id = 9;
update t_genshin_role
SET name='Barbara'
WHERE id = 9;
update t_genshin_role
SET name_c='阿贝多'
WHERE id = 33;
update t_genshin_role
SET name_c='白术'
WHERE id = 21;

update t_genshin_role
SET name_c='迪奥娜'
WHERE id = 16;

SET AUTOCOMMIT = false;
update t_genshin_role
SET name_c='瑶瑶'
WHERE id = 4;
update t_genshin_role
SET name_c='可莉'
WHERE id = 5;
update t_genshin_role
SET name_c='纳西妲'
WHERE id = 7;
update t_genshin_role
SET name_c='胡桃'
WHERE id = 10;
update t_genshin_role
SET name_c='莫娜'
WHERE id = 11;
COMMIT;

SET AUTOCOMMIT = false;
update t_genshin_role
SET name_c='巴巴托斯'
WHERE id = 12;
update t_genshin_role
SET name_c='琴'
WHERE id = 13;
update t_genshin_role
SET name_c='刻晴'
WHERE id = 14;
update t_genshin_role
SET name_c='琦良良'
WHERE id = 15;
update t_genshin_role
SET name_c='钟离'
WHERE id = 17;
COMMIT;

SELECT *
FROM t_genshin_role;

SET AUTOCOMMIT = false;
UPDATE t_genshin_role
SET name_c='霄'
WHERE id = 18;
UPDATE t_genshin_role
SET name_c='夜兰'
WHERE id = 19;
UPDATE t_genshin_role
SET name_c='香菱'
WHERE id = 20;
UPDATE t_genshin_role
SET name_c='重云'
WHERE id = 22;
UPDATE t_genshin_role
SET name_c='辛焱'
WHERE id = 23;
UPDATE t_genshin_role
SET name_c='行秋'
WHERE id = 24;
UPDATE t_genshin_role
SET name_c='申鹤'
WHERE id = 25;
UPDATE t_genshin_role
SET name_c='甘雨'
WHERE id = 26;
UPDATE t_genshin_role
SET name_c='烟绯'
WHERE id = 27;
UPDATE t_genshin_role
SET name_c='北斗'
WHERE id = 28;
UPDATE t_genshin_role
SET name_c='凝光'
WHERE id = 29;
UPDATE t_genshin_role
SET name_c='云堇'
WHERE id = 30;
UPDATE t_genshin_role
SET name_c='七七'
WHERE id = 31;
UPDATE t_genshin_role
SET name_c='米卡'
WHERE id = 32;
COMMIT;

UPDATE t_genshin_role
SET name_c='迪卢克'
WHERE id = 34;
UPDATE t_genshin_role
SET name_c='诺艾尔'
WHERE id = 35;
UPDATE t_genshin_role
SET name_c='菲谢尔'
WHERE id = 36;
UPDATE t_genshin_role
SET name_c='罗莎莉亚'
WHERE id = 37;
UPDATE t_genshin_role
SET name_c='砂糖'
WHERE id = 38;
UPDATE t_genshin_role
SET name_c='班尼特'
WHERE id = 39;
UPDATE t_genshin_role
SET name_c='凯亚'
WHERE id = 40;
UPDATE t_genshin_role
SET name_c='优菈'
WHERE id = 41;
UPDATE t_genshin_role
SET name_c='丽莎'
WHERE id = 42;
UPDATE t_genshin_role
SET name_c='温迪'
WHERE id = 43;
COMMIT;

SET AUTOCOMMIT = true;
delete
from t_genshin_role
where name_c = '巴巴托斯';
commit;

UPDATE t_genshin_role
SET name_c='卡维'
WHERE id = 82;
UPDATE t_genshin_role
SET name_c='艾尔海森'
WHERE id = 81;
UPDATE t_genshin_role
SET name_c='珐露姗'
WHERE id = 80;
UPDATE t_genshin_role
SET name_c='迪希雅'
WHERE id = 79;
UPDATE t_genshin_role
SET name_c='莱依拉'
WHERE id = 78;
UPDATE t_genshin_role
SET name_c='坎蒂丝'
WHERE id = 77;
UPDATE t_genshin_role
SET name_c='赛诺'
WHERE id = 76;
UPDATE t_genshin_role
SET name_c='多莉'
WHERE id = 74;
UPDATE t_genshin_role
SET name_c='妮露'
WHERE id = 72;
UPDATE t_genshin_role
SET name_c='九条裟罗'
WHERE id = 59;

UPDATE t_genshin_role
SET name_c='柯莱'
WHERE id = 73;
UPDATE t_genshin_role
SET name_c='提纳里'
WHERE id = 75;
UPDATE t_genshin_role
SET name_c='托马'
WHERE id = 55;
UPDATE t_genshin_role
SET name_c='早柚'
WHERE id = 54;

UPDATE t_genshin_role
SET name_c='神里凌华'
WHERE id = 50;
UPDATE t_genshin_role
SET name_c='神里凌人'
WHERE id = 51;

UPDATE t_genshin_role
SET name_c='珊瑚宫心海'
WHERE id = 52;

UPDATE t_genshin_role
SET name_c='枫原万叶'
WHERE id = 53;
UPDATE t_genshin_role
SET name_c='鹿目院平藏'
WHERE id = 46;
UPDATE t_genshin_role
SET name_c='久岐忍'
WHERE id = 47;

UPDATE t_genshin_role
SET name_c='雷电将军'
WHERE id = 48;
UPDATE t_genshin_role
SET name_c='荒泷一斗'
WHERE id = 49;

UPDATE t_genshin_role
SET name_c='达达利亚'
WHERE id = 83;
UPDATE t_genshin_role
SET name_c='五郎'
WHERE id = 58;

UPDATE t_genshin_role
SET name_c='宵宫'
WHERE id = 56;
UPDATE t_genshin_role
SET name_c='八重神子'
WHERE id = 57;
UPDATE t_genshin_role
SET name_c='魈'
WHERE id = 18;

show tables;

CREATE TABLE IF NOT EXISTS t_elemental_type
(
    tno    INT(2)       NOT NULL UNIQUE,
    type   varchar(255) NOT NULL UNIQUE,
    type_c varchar(255) NOT NULL UNIQUE,
    PRIMARY KEY (tno)
);

desc t_sex;

INSERT INTO t_elemental_type (tno, type, type_c)
VALUES (1, 'Anemo', '风'),
       (2, 'Geo', '岩'),
       (3, 'Electro', '雷'),
       (4, 'Dendro', '草'),
       (5, 'Hydro', '水'),
       (6, 'Pyro', '火'),
       (7, 'Cryo', '冰');

INSERT INTO t_elemental_type (tno, type, type_c)
VALUES (0, 'nothing', '无');
drop table t_elemental_type;

SELECT *
FROM t_elemental_type;

ALTER TABLE t_elemental_type
    COMMENT '元素类型/神之眼属性';

show create table t_elemental_type;

DESC t_elemental_type;
DESCRIBE t_elemental_type;

ALTER TABLE t_elemental_type
    MODIFY COLUMN tno INT(2) NOT NULL COMMENT '主键;自然标识';
ALTER TABLE t_elemental_type
    MODIFY COLUMN type varchar(255) NOT NULL COMMENT '元素类型;神之眼(神之心)类型';
ALTER TABLE t_elemental_type
    MODIFY COLUMN type_c varchar(255) NOT NULL COMMENT '元素类型;神之眼(神之心)类型(中文)';

CREATE TABLE IF NOT EXISTS t_weapons_type
(
    tno       INT(2)       NOT NULL UNIQUE COMMENT '主键;自然标识',
    weapons   varchar(255) NOT NULL UNIQUE COMMENT '武器类型',
    weapons_c varchar(255) NOT NULL UNIQUE COMMENT '武器类型(中文)',
    PRIMARY KEY (tno)
) COMMENT ='武器类型表:单手剑,双手剑,弓,法器,长柄武器...';

INSERT INTO t_weapons_type (tno, weapons, weapons_c)
VALUES (1, 'Sword', '单手剑'),
       (2, 'Claymore', '双手剑'),
       (3, 'Bow', '弓'),
       (4, 'Catalyst', '法器'),
       (5, 'Polearm', '长柄武器'),
       (0, 'Other', '其他');

SELECT *
FROM t_weapons_type;

