package maskClone;

import java.util.List;

public class Module2 {

private long count;
private long page;
private List<StoreInfo> storeInfos = null;
private long totalCount;
private long totalPages;

public long getCount() {
return count;
}

public void setCount(long count) {
this.count = count;
}

public long getPage() {
return page;
}

public void setPage(long page) {
this.page = page;
}

public List<StoreInfo> getStoreInfos() {
return storeInfos;
}

public void setStoreInfos(List<StoreInfo> storeInfos) {
this.storeInfos = storeInfos;
}

public long getTotalCount() {
return totalCount;
}

public void setTotalCount(long totalCount) {
this.totalCount = totalCount;
}

public long getTotalPages() {
return totalPages;
}

public void setTotalPages(long totalPages) {
this.totalPages = totalPages;
}

}