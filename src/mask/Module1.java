package mask;

import java.util.List;

public class Module1 {
	private long count;
	private String page;
	private List<StoreInfo> storeInfos = null;
	private long totalCount;
	private long totalPages;
	
	public long getCount() {
		return count;
	}
	
	public void setCoung(long count) {
		this.count = count;
	}
	
	public String getPage() {
		return page;
	}
	
	public void setPage(String page) {
		this.page = page;
	}
	
	public List<StoreInfo> getStoreInfos(){
		return storeInfos;
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
