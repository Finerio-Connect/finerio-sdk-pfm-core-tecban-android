package com.openbanking.core.sdk.core.rows;

import com.openbanking.core.sdk.core.domain.OpenBankingImage;
import com.openbanking.core.sdk.core.domain.Transaction;

public class TransactionRow extends OpenBankingImage {

  private Transaction transaction;
  private Boolean canBeDeleted;
  private TransactionRowListener listener;

  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction( Transaction transaction ) {
    this.transaction = transaction;
  }

  public Boolean getCanBeDeleted() {
    return canBeDeleted;
  }

  public void setCanBeDeleted( Boolean canBeDeleted ) {
    this.canBeDeleted = canBeDeleted;
  }

  public TransactionRowListener getListener() {
    return listener;
  }

  public void setListener( TransactionRowListener listener ) {
    this.listener = listener;
  }

}
