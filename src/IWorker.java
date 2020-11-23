public interface IWorker {
    void Accept(IIncreaseVisitor iIncreaseVisitor);
    void Accept(ISortVisitor iSortVisitor);
}
