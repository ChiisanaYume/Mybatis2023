##开发我的第一个MyBatis程序

##开发步骤

* 第一步：打包方式jar

* 第二步：引入依赖
  - mybatis依赖（3.5.10）
  - mysql驱动程序依赖（8.0.30）

* 第三步：编写mybatis核心配置文件(mybatis-config.xml)
  - 从 xml 文件中配置SqlSessionFactory(mybatis-config.xml)
  - mybatis有一个很重要的对象 SqlSessionFactory
  - SqlSessionFactory对象的创建需要一个xml文件

  - mybatis中有两个主要的配置文件
  - mybatis-config.xml 核心配置文件，主要配置连接数据库的信息等...(一个)
  - XxxMapper.xml文件 专门用来编写sql语句的配置文件(一个表对应一个)

* 第四步：编写XxxMapper.xml文件
  - 这个文件名不是固定的，放的位置也不是固定的
  - 这里我们暂时起名 CarMapper.xml，放在类的根路径下

* 第五步：在mybatis-config.xml文件中指定(配置)XxxMapper.xml的路径
  - <mapper resource="CarMapper.xml"/>
  - 这个路径默认以类路径为根

* 第六步：编写MyBatis程序
  - 在MyBatis中,负责执行SQL语句的对象叫 SqlSession
  - SqlSession是专门用来执行SQL语句的，是Java程序和虚拟机的一次会话

  - 要想获取SqlSession对象，要先获取SqlSessionFactory对象
  - 通过SqlSessionFactory工厂来生产SqlSession对象
  - 要想获取SqlSessionFactory对象，要先获取SqlSessionFactoryBuilder对象
  - 通过执行SqlSessionFactoryBuilder的build()方法来获取SqlSessionFactory对象

* 细节
  - MyBatis配置文件中的 SQL语句 分号; 可以省略(也可以不省略，都不会报错);

  - Resources.getResourceAsStream() 从类的根路径开始加载资源
  - 小技巧：resources这个单词，一般都是从类的根路径开始加载资源
  - 使用这种方式获取流有很强的可移植性(从window系统移植到linux系统,代码不需要改变，因为文件就在这个根路径下)
  - InputStream is = new FileInputStream("mybatis-config.xml")
  - 使用这种方式获取流也可以，不过类的移植性较差
  - InputStream is = ClassLoader.getSystemResourceAsStream("mybatis-config.xml"); // 系统的类加载器
  - Resources.getResourceAsStream()底层的源代码↑↑↑

  - Mybatis核心配置文件的文件名不一定是 mybatis-config.xml，可以是别的文件
  - Mybatis核心配置文件的文件路径也不一定放在根路径，可以放在别的位置
  - 但为了项目的移植性和健壮性，最好放在根路径

  - XxxMapper也是一样↑↑↑

  - <mapper resource="CarMapper.xml"/>
  - 从类路径加载加载资源↑
  - <mapper url="file:///D:/study/Mybatis2023/MyBatis-001-introduction/src/main/resources/CarMapper.xml"/>
  - 从绝对路径加载资源(很少使用)↑