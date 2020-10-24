package B06Generics.P2Examples.E02;
                                   //sadece IEntity tipinde nesne alabilir. (sadece veri tabanı nesneleri)
public interface IEntityRepository<T extends IEntity> {
    public void add(T entity);
    public void delete(T entity);
    public void update(T entity);
}
