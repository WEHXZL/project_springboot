package com.bdqn.sbproject.util;

public class Page {
  private Integer pageIndex;
  private Integer pageSize;
  private Integer rowCount;
  private Integer fromTo;

  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getRowCount() {
    return rowCount;
  }

  public void setRowCount(Integer rowCount) {
    this.rowCount = rowCount;
  }

  public Integer getFromTo() {
    return fromTo;
  }

  public void setFromTo(Integer fromTo) {
    this.fromTo = fromTo;
  }
}
