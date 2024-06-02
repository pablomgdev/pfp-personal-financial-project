package es.pablomgdev.pfppersonalfinancialproject.dto;

import java.math.BigDecimal;
import java.util.Date;

public class GetOperationsFilter {
    private BigDecimal amount;
    private Integer categoryId;
    private Date date;
    
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public Integer getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
}
