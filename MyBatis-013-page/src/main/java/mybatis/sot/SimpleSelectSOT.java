package mybatis.sot;


/**
 * 包括根据主键查一条数据和查所有的简单查询接口
 * @author faintdream
 * @version 1.0
 * */
public interface SimpleSelectSOT<P,KEY> extends SelectByKeySOT<P,KEY>, SelectAllSOT<P> {
}
