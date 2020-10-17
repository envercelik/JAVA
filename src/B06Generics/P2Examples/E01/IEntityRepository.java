package B06Generics.P2Examples.E01;
                                   //sadece IEntity tipinde nesne alabilir. (sadece verş tabanı nesneleri)
public interface IEntityRepository<T extends IEntity> {
    public void add(T entity);
    public void delete(T entity);
    public void update(T entity);
}
