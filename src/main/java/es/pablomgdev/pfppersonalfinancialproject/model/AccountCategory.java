package es.pablomgdev.pfppersonalfinancialproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts_categories")
public class AccountCategory {
    @Id
    @Column(name = "account_internal_id")
    private Integer accountInternalId;

    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    public Integer getAccountInternalId() {
      return accountInternalId;
    }

    public void setAccountInternalId(Integer accountInternalId) {
      this.accountInternalId = accountInternalId;
    }

    public Integer getCategoryId() {
      return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
    }
}
