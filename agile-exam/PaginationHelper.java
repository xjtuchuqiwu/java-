package test;

import java.util.List;

// TODO: 完成这个类

public class PaginationHelper<I> {
    private List<I> collection=null;
    private int itemsPerPage = 0;

    /**
     * 构造函数包含
     * 1）数组collection，表示需要分页的所有元素
     * 2）数字itemsPerPage，表示每页的元素个数
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection =collection;
        this.itemsPerPage =itemsPerPage;
    }

    /**
     * 返回collection中所有元素的个数
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * 返回页数 从1开始计数
     */
    public int pageCount() {
        if(collection.size()%itemsPerPage == 0){
            return collection.size()/itemsPerPage;
        }
        return  collection.size()/itemsPerPage+1;
    }

    /**
     * 返回当前页pageIndex中所包含的元素个数
     * pageIndex从0开始计数
     * 如果pageIndex为非法值则返回-1
     */
    public int pageItemCount(int pageIndex) {
        int pages = pageCount();
        if(pageIndex>pages-1 || pageIndex<0){
            return -1;
        }
        //最后一页单独处理
        if(pageIndex == (pages-1)){
            return collection.size()-(pages-1)*itemsPerPage;
        }
        return itemsPerPage;
    }

    /**
     * 返回第itemIndex个元素所在的页数
     * pageIndex从0开始计数
     * 如果itemIndex为非法值则返回-1
     */
    public int pageIndex(int itemIndex) {
        if(itemIndex<0 || itemIndex>collection.size()){
            return -1;
        }
        return (itemIndex+1)/itemsPerPage;
    }
}