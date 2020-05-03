package airplane;


public class Body {

private Items items;
private long numOfRows;
private long pageNo;
private int totalCount;

public Items getItems() {
return items;
}

public void setItems(Items items) {
this.items = items;
}

public long getNumOfRows() {
return numOfRows;
}

public void setNumOfRows(long numOfRows) {
this.numOfRows = numOfRows;
}

public long getPageNo() {
return pageNo;
}

public void setPageNo(long pageNo) {
this.pageNo = pageNo;
}

public int getTotalCount() {
return totalCount;
}

public void setTotalCount(int totalCount) {
this.totalCount = totalCount;
}

}