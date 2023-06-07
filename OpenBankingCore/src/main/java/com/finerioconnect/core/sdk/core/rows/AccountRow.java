package com.finerioconnect.core.sdk.core.rows;

import com.finerioconnect.core.sdk.core.domain.Account;
import com.finerioconnect.core.sdk.core.domain.OpenBankingImage;

public class AccountRow extends OpenBankingImage {

  private Account account;
  private AccountRowListener listener;

  public Account getAccount() {
    return account;
  }

  public void setAccount( Account account ) {
    this.account = account;
  }

  public AccountRowListener getListener() {
    return listener;
  }

  public void setListener( AccountRowListener listener ) {
    this.listener = listener;
  }

}
