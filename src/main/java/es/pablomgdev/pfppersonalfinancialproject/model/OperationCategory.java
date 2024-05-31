package es.pablomgdev.pfppersonalfinancialproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "operations_categories")
public class OperationCategory {
    @Id
    @Column(name = "operation_internal_id")
    private Integer operationInternalId;

    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    public Integer getOperationInternalId() {
      return operationInternalId;
    }

    public void setOperationInternalId(Integer operationInternalId) {
      this.operationInternalId = operationInternalId;
    }

    public Integer getCategoryId() {
      return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
    }
}
