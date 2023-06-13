package mybatis.sot;

/**
 * 查询(根据id)
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public interface SelectByIdSOT<P,ID> extends SqlOperationTemplate {
    /**
     * 查询(根据id)
     * @param id 查询id
     * @return pojo 对象
     * */
    public P selectById(ID id);
}
