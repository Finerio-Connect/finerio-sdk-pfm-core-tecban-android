package com.openbanking.core.sdk.core.rows;

import com.openbanking.core.sdk.core.domain.Budget;
import com.openbanking.core.sdk.core.domain.OpenBankingImage;

public class BudgetRow extends OpenBankingImage {

  private Budget budget;
  private BudgetRowListener listener;

  public Budget getBudget() {
    return budget;
  }

  public void setBudget( Budget budget ) {
    this.budget = budget;
  }

  public BudgetRowListener getListener() {
    return listener;
  }

  public void setListener( BudgetRowListener listener ) {
    this.listener = listener;
  }

}
