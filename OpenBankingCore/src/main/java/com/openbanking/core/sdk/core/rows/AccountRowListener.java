package com.openbanking.core.sdk.core.rows;

interface AccountRowListener {

  public void onDeleteAccount( AccountRow accountRow );
  public void onAccountDeleted( AccountRow accountRow );

}
