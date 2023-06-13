package mybatis.sot;

/**
 * 修改一条数据
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public interface UpdateSOT<P> extends SqlOperationTemplate {

    /**
     * 修改一条数据(插入到数据库表中)
     * @param pojo 要修改的数据
     * @return int 修改完成后受影响的数据条数(1表示修改成功)
     * */
    int update(P pojo);
}