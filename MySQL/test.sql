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
VALUES
    ('7', '2', '4', '4', '4'),
    ('8', '2', '6', '1', '3'),
    ('9', '2', '5', '1', '4');

insert into t_genshin_role_detail (id, sex, elemental_type, region, weapons_type)
VALUES
    ('10', '2', '6', '2', '5'),
    ('11', '2', '5', '1', '4');
DROP TABLE t_genshin_role_detail;

/*消除外键约束*/
ALTER TABLE t_genshin_role_detail DROP FOREIGN KEY fk_t_sex;
/*修改属性*/
ALTER TABLE t_sex CHANGE sno no int(2);
/*添加外键约束*/
ALTER TABLE t_genshin_role_detail ADD CONSTRAINT fk_t_sex FOREIGN KEY (sex)
    REFERENCES t_sex (no);

ALTER TABLE t_genshin_role_detail DROP FOREIGN KEY fk_t_weapons_type;
ALTER TABLE t_weapons_type CHANGE tno no int(2);

ALTER TABLE t_genshin_role_detail ADD CONSTRAINT fk_t_weapons_type FOREIGN KEY (weapons_type)
    REFERENCES t_weapons_type(no);

ALTER TABLE t_genshin_role_detail DROP FOREIGN KEY fk_t_elemental_type;
ALTER TABLE t_genshin_role_detail DROP FOREIGN KEY fk_t_genshin_region;

ALTER TABLE t_elemental_type CHANGE tno no int(2);
ALTER TABLE t_genshin_region CHANGE rno no int(2);

ALTER TABLE t_genshin_role_detail ADD CONSTRAINT fk_t_elemental_type FOREIGN KEY (elemental_type)
    REFERENCES t_elemental_type(no);

ALTER TABLE t_genshin_role_detail ADD CONSTRAINT fk_t_genshin_region FOREIGN KEY (region)
    REFERENCES t_genshin_region(no);
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
       t_weapons_type.weapons_c
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
       t_weapons_type.weapons
FROM t_genshin_role_detail M
         LEFT JOIN t_genshin_role ON M.id = t_genshin_role.id
         LEFT JOIN t_genshin_region ON M.region = t_genshin_region.no
         LEFT JOIN t_sex ON M.sex = t_sex.no
         LEFT JOIN t_elemental_type on M.elemental_type = t_elemental_type.no
         LEFT JOIN t_weapons_type on M.weapons_type = t_weapons_type.no;