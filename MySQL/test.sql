select *
from t_genshin_role;

ALTER TABLE t_genshin_role
    ADD COLUMN new_column varchar(50) NOT NULL DEFAULT 'default_value';



CREATE TABLE t_genshin_role_detail
(
    id             INT NOT NULL UNIQUE COMMENT '主键;角色编号(自然标识)',
    sex            INT NOT NULL COMMENT '角色姓名;男(1),女(2),其他(3)...',
    elemental_type INT NOT NULL COMMENT '元素类型/神之眼属性;风(1),岩(2),雷(3)...',
    region         INT NOT NULL COMMENT '所属地区(七国);蒙德(1),璃月(2),稻妻(3)...',
    weapons_type   INT NOT NULL COMMENT '武器类型;单手剑(1),双手剑(2),弓(3),法器(4),长柄武器(5)...',
    PRIMARY KEY (id),
    CONSTRAINT fk_t_genshin_role FOREIGN KEY (id) REFERENCES t_genshin_role (id),
    CONSTRAINT fk_t_sex FOREIGN KEY (sex) REFERENCES t_sex (sno),
    CONSTRAINT fk_t_elemental_type FOREIGN KEY (elemental_type) REFERENCES t_elemental_type (tno),
    CONSTRAINT fk_t_genshin_region FOREIGN KEY (region) REFERENCES t_genshin_region (rno),
    CONSTRAINT fk_t_weapons_type FOREIGN KEY (weapons_type) REFERENCES t_weapons_type (tno)
) COMMENT ='角色信息详情表';

/*查询语句(有误)*/
SELECT M.id,
       t_genshin_role.name_c,
       t_genshin_region.region_c,
       t_sex.sex_c,
       t_elemental_type.type_c,
       t_weapons_type.weapons_c
FROM t_genshin_role_detail M
         LEFT JOIN t_genshin_role ON M.id = t_genshin_role.id
         LEFT JOIN t_genshin_region ON M.region = t_genshin_region.rno
         LEFT JOIN t_sex ON M.sex = t_sex.sno
         LEFT JOIN t_elemental_type on M.elemental_type = t_elemental_type.tno
         LEFT JOIN t_weapons_type on M.weapons_type = t_weapons_type.tno;

/*插入一条测试语句*/
insert into t_genshin_role_detail (id, sex, elemental_type, region, weapons_type)
VALUES ('4', '2', '4', '2', '5');

insert into t_genshin_role_detail (id, sex, elemental_type, region, weapons_type)
VALUES ('5', '2', '6', '1', '4');

insert into t_genshin_role_detail (id, sex, elemental_type, region, weapons_type)
VALUES ('7', '2', '4', '4', '4'),
       ('8', '2', '6', '1', '3'),
       ('9', '2', '5', '1', '4');

insert into t_genshin_role_detail (id, sex, elemental_type, region, weapons_type)
VALUES ('10', '2', '6', '2', '5'),
       ('11', '2', '5', '1', '4');
DROP TABLE t_genshin_role_detail;

/*消除外键约束*/
ALTER TABLE t_genshin_role_detail
    DROP FOREIGN KEY fk_t_sex;
/*修改属性*/
ALTER TABLE t_sex
    CHANGE sno no int(2);
/*添加外键约束*/
ALTER TABLE t_genshin_role_detail
    ADD CONSTRAINT fk_t_sex FOREIGN KEY (sex)
        REFERENCES t_sex (no);

ALTER TABLE t_genshin_role_detail
    DROP FOREIGN KEY fk_t_weapons_type;
ALTER TABLE t_weapons_type
    CHANGE tno no int(2);

ALTER TABLE t_genshin_role_detail
    ADD CONSTRAINT fk_t_weapons_type FOREIGN KEY (weapons_type)
        REFERENCES t_weapons_type (no);

ALTER TABLE t_genshin_role_detail
    DROP FOREIGN KEY fk_t_elemental_type;
ALTER TABLE t_genshin_role_detail
    DROP FOREIGN KEY fk_t_genshin_region;

ALTER TABLE t_elemental_type
    CHANGE tno no int(2);
ALTER TABLE t_genshin_region
    CHANGE rno no int(2);

ALTER TABLE t_genshin_role_detail
    ADD CONSTRAINT fk_t_elemental_type FOREIGN KEY (elemental_type)
        REFERENCES t_elemental_type (no);

ALTER TABLE t_genshin_role_detail
    ADD CONSTRAINT fk_t_genshin_region FOREIGN KEY (region)
        REFERENCES t_genshin_region (no);
/*插入*/
INSERT INTO t_genshin_role_detail (id, sex, elemental_type, region, weapons_type)
VALUES (13, 2, 1, 1, 1),
       (14, 2, 3, 2, 1);


/*查询语句(中文)*/
SELECT M.id,
       t_genshin_role.name_c,
       t_genshin_region.region_c,
       t_sex.sex_c,
       t_elemental_type.type_c,
       t_weapons_type.weapons_c,
       M.rarity
FROM t_genshin_role_detail M
         LEFT JOIN t_genshin_role ON M.id = t_genshin_role.id
         LEFT JOIN t_genshin_region ON M.region = t_genshin_region.no
         LEFT JOIN t_sex ON M.sex = t_sex.no
         LEFT JOIN t_elemental_type on M.elemental_type = t_elemental_type.no
         LEFT JOIN t_weapons_type on M.weapons_type = t_weapons_type.no;

/*查询语句(英文)*/
SELECT M.id,
       t_genshin_role.name,
       t_genshin_region.region,
       t_sex.sex,
       t_elemental_type.type,
       t_weapons_type.weapons,
       M.rarity
FROM t_genshin_role_detail M
         LEFT JOIN t_genshin_role ON M.id = t_genshin_role.id
         LEFT JOIN t_genshin_region ON M.region = t_genshin_region.no
         LEFT JOIN t_sex ON M.sex = t_sex.no
         LEFT JOIN t_elemental_type on M.elemental_type = t_elemental_type.no
         LEFT JOIN t_weapons_type on M.weapons_type = t_weapons_type.no;

INSERT INTO t_genshin_role_detail (id, sex, elemental_type, region, weapons_type)
VALUES (15, 2, 4, 4, 1),
       (16, 2, 7, 1, 3),
       (17, 1, 2, 2, 5),
       (18, 1, 1, 2, 5),
       (19, 2, 5, 2, 3),
       (20, 2, 6, 2, 5),
       (21, 1, 4, 2, 4),
       (22, 1, 7, 2, 2),
       (23, 2, 6, 2, 2);

INSERT INTO t_genshin_role_detail (id, sex, elemental_type, region, weapons_type)
VALUES (24, 1, 5, 2, 1),
       (25, 2, 7, 2, 5);

INSERT INTO t_genshin_role_detail (id, sex, elemental_type, region, weapons_type)
VALUES (26, 2, 7, 2, 3),
       (27, 2, 6, 2, 4),
       (28, 2, 3, 2, 2),
       (29, 2, 2, 2, 4),
       (30, 2, 2, 2, 5);

INSERT INTO t_genshin_role_detail (id, sex, elemental_type, region, weapons_type)
VALUES (31, 2, 7, 2, 1),
       (32, 1, 7, 1, 5),
       (33, 1, 2, 1, 1),
       (34, 1, 6, 1, 2),
       (35, 2, 2, 1, 2),
       (36, 2, 3, 1, 3),
       (37, 2, 7, 1, 5),
       (38, 2, 1, 1, 4),
       (39, 1, 6, 1, 1),
       (40, 1, 7, 1, 1);

ALTER TABLE t_genshin_role_detail
    ADD COLUMN rarity INT(2) COMMENT '角色稀有度(星级 5星/4星)';

INSERT INTO t_genshin_role_detail (id, sex, elemental_type, region, weapons_type, rarity)
VALUES (41, 2, 7, 1, 2, 5),
       (43, 1, 1, 1, 3, 5),
       (46, 1, 1, 3, 4, 4),
       (47, 2, 3, 3, 1, 4),
       (48, 2, 3, 3, 5, 5),
       (49, 1, 2, 3, 2, 5),
       (50, 2, 7, 3, 1, 5),
       (51, 1, 5, 3, 1, 5),
       (52, 2, 5, 3, 4, 5),
       (53, 1, 1, 3, 1, 5),
       (54, 2, 1, 3, 2, 4),
       (55, 1, 6, 3, 5, 4),
       (56, 2, 6, 3, 3, 5),
       (57, 2, 3, 3, 4, 5),
       (58, 1, 2, 3, 3, 4),
       (59, 2, 3, 3, 3, 4),
       (72, 2, 5, 4, 1, 5),
       (42, 2, 4, 1, 4, 4);

INSERT INTO t_genshin_role_detail (id, sex, elemental_type, region, weapons_type, rarity)
VALUES (73, 2, 4, 4, 3, 4),
       (75, 1, 4, 4, 3, 5),
       (76, 1, 3, 4, 5, 5),
       (77, 2, 5, 4, 5, 4),
       (78, 2, 7, 4, 1, 4),
       (79, 2, 6, 4, 2, 5),
       (80, 2, 1, 4, 3, 4),
       (81, 1, 4, 4, 1, 5),
       (82, 1, 4, 4, 2, 4),
       (83, 1, 5, 7, 3, 5),
       (86, 2, 1, 1, 1, 5),
       (89, 1, 1, 1, 1, 5),
       (74, 2, 3, 4, 2, 4);

CREATE TABLE t_role_physique
(
    no         INT(2)       NOT NULL UNIQUE PRIMARY KEY COMMENT '主键;角色类型/体型编号(自然标识)',
    physique   VARCHAR(255) NOT NULL UNIQUE COMMENT '角色类型/体型(英文)',
    physique_c VARCHAR(255) NOT NULL UNIQUE COMMENT '角色类型/体型(中文)'

) COMMENT ='角色类型/体型表(1成男，2成女，3少男，4少女，5正太，6萝莉...)';

DESC t_role_physique;

insert into t_role_physique (no, physique, physique_c)
VALUES (0, 'Other Physique', '其他体型'),
       (1, 'Male', '成男'),
       (2, 'Female', '成女'),
       (3, 'Boy', '少男'),
       (4, 'Girl', '少女'),
       (5, 'Shota', '正太'),
       (6, 'Loli', '萝莉')

select *
from t_role_physique;

ALTER TABLE t_genshin_role_detail
    ADD COLUMN physique INT(2);

ALTER TABLE t_genshin_role_detail
    ADD COLUMN physique INT(2) COMMENT '角色类型/体型(1成男，2成女，3少男，4少女，5正太，6萝莉...)',
    ADD CONSTRAINT fk_t_role_physique FOREIGN KEY (physique) REFERENCES t_role_physique (no);

/*查询语句(中文)*/
SELECT M.id,
       t_genshin_role.name_c,
       t_genshin_region.region_c,
       t_sex.sex_c,
       t_elemental_type.type_c,
       t_weapons_type.weapons_c,
       M.rarity,
       t_role_physique.physique_c
FROM t_genshin_role_detail M
         LEFT JOIN t_genshin_role ON M.id = t_genshin_role.id
         LEFT JOIN t_genshin_region ON M.region = t_genshin_region.no
         LEFT JOIN t_sex ON M.sex = t_sex.no
         LEFT JOIN t_elemental_type on M.elemental_type = t_elemental_type.no
         LEFT JOIN t_weapons_type on M.weapons_type = t_weapons_type.no
         LEFT JOIN t_role_physique on M.physique = t_role_physique.no;

/*查询语句(英文)*/
SELECT M.id,
       t_genshin_role.name,
       t_genshin_region.region,
       t_sex.sex,
       t_elemental_type.type,
       t_weapons_type.weapons,
       M.rarity,
       t_role_physique.physique
FROM t_genshin_role_detail M
         LEFT JOIN t_genshin_role ON M.id = t_genshin_role.id
         LEFT JOIN t_genshin_region ON M.region = t_genshin_region.no
         LEFT JOIN t_sex ON M.sex = t_sex.no
         LEFT JOIN t_elemental_type on M.elemental_type = t_elemental_type.no
         LEFT JOIN t_weapons_type on M.weapons_type = t_weapons_type.no
         LEFT JOIN t_role_physique on M.physique = t_role_physique.no;

INSERT INTO t_role_physique (no, physique, physique_c)         VALUES(8,'Toddler','幼女');

UPDATE t_genshin_role_detail SET physique=6 WHERE id=31;
UPDATE t_genshin_role_detail SET physique=3 WHERE id=32;

UPDATE t_genshin_role_detail SET physique=3 WHERE id=33;
UPDATE t_genshin_role_detail SET physique=1 WHERE id=34;
UPDATE t_genshin_role_detail SET physique=4 WHERE id=35;
UPDATE t_genshin_role_detail SET physique=4 WHERE id=36;
UPDATE t_genshin_role_detail SET physique=2 WHERE id=37;
UPDATE t_genshin_role_detail SET physique=4 WHERE id=38;

UPDATE t_genshin_role_detail SET physique=3 WHERE id=39;
UPDATE t_genshin_role_detail SET physique=1 WHERE id=40;
UPDATE t_genshin_role_detail SET physique=2 WHERE id=41;
UPDATE t_genshin_role_detail SET physique=2 WHERE id=42;

UPDATE t_genshin_role_detail SET physique=3 WHERE id=43;
UPDATE t_genshin_role_detail SET physique=3 WHERE id=46;

UPDATE t_genshin_role_detail SET physique=4 WHERE id=47;
UPDATE t_genshin_role_detail SET physique=2 WHERE id=48;
UPDATE t_genshin_role_detail SET physique=1 WHERE id=49;
UPDATE t_genshin_role_detail SET physique=4 WHERE id=50;
UPDATE t_genshin_role_detail SET physique=1 WHERE id=51;
UPDATE t_genshin_role_detail SET physique=4 WHERE id=52;

UPDATE t_genshin_role_detail SET physique=3 WHERE id=53;
UPDATE t_genshin_role_detail SET physique=6 WHERE id=54;
UPDATE t_genshin_role_detail SET physique=1 WHERE id=55;
UPDATE t_genshin_role_detail SET physique=4 WHERE id=56;
UPDATE t_genshin_role_detail SET physique=3 WHERE id=58;
UPDATE t_genshin_role_detail SET physique=2 WHERE id=59;

UPDATE t_genshin_role_detail SET physique=4 WHERE id=72;

UPDATE t_genshin_role_detail SET physique=4 WHERE id=72;
UPDATE t_genshin_role_detail SET physique=4 WHERE id=73;
UPDATE t_genshin_role_detail SET physique=6 WHERE id=74;
UPDATE t_genshin_role_detail SET physique=3 WHERE id=75;
UPDATE t_genshin_role_detail SET physique=3 WHERE id=76;

UPDATE t_genshin_role_detail SET physique=2 WHERE id=77;
UPDATE t_genshin_role_detail SET physique=4 WHERE id=78;
UPDATE t_genshin_role_detail SET physique=2 WHERE id=79;
UPDATE t_genshin_role_detail SET physique=4 WHERE id=80;

UPDATE t_genshin_role_detail SET physique=1 WHERE id=81;
UPDATE t_genshin_role_detail SET physique=1 WHERE id=82;
UPDATE t_genshin_role_detail SET physique=1 WHERE id=83;

UPDATE t_genshin_role_detail SET physique=4 WHERE id=86;
UPDATE t_genshin_role_detail SET physique=3 WHERE id=89;

UPDATE t_genshin_role_detail SET physique=4 WHERE id=90;

INSERT INTO t_genshin_role (name,name_c) VALUES('Charlotte','夏洛蒂');

INSERT INTO t_genshin_role_detail SET id=91,sex=2,elemental_type=7,region=5,weapons_type=5,rarity=4,physique=4;

SELECT M.id,
       t_genshin_role.name_c,
       t_genshin_region.region_c,
       t_sex.sex_c,
       t_elemental_type.type_c,
       t_weapons_type.weapons_c,
       M.rarity,
       t_role_physique.physique_c
FROM t_genshin_role_detail M
         LEFT JOIN t_genshin_role ON M.id = t_genshin_role.id
         LEFT JOIN t_genshin_region ON M.region = t_genshin_region.no
         LEFT JOIN t_sex ON M.sex = t_sex.no
         LEFT JOIN t_elemental_type on M.elemental_type = t_elemental_type.no
         LEFT JOIN t_weapons_type on M.weapons_type = t_weapons_type.no
         LEFT JOIN t_role_physique on M.physique = t_role_physique.no
WHERE M.id=86;

SELECT M.id,                t_genshin_role.name_c,                t_genshin_region.region_c,                t_sex.sex_c,                t_elemental_type.type_c,                t_weapons_type.weapons_c,                M.rarity,                t_role_physique.physique_c         FROM t_genshin_role_detail M                  LEFT JOIN t_genshin_role ON M.id = t_genshin_role.id                  LEFT JOIN t_genshin_region ON M.region = t_genshin_region.no                  LEFT JOIN t_sex ON M.sex = t_sex.no                  LEFT JOIN t_elemental_type on M.elemental_type = t_elemental_type.no                  LEFT JOIN t_weapons_type on M.weapons_type = t_weapons_type.no                  LEFT JOIN t_role_physique on M.physique = t_role_physique.no               LIMIT 5*8 - 1, 8;
