package com.finerioconnect.core.sdk.core.domain;

public class Bank extends OpenBankingImage implements OpenBankingDomain {

  private String id;
  private String name;
  private String aggregationInstructions;

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId( String id ) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  public String getAggregationInstructions() {
    return aggregationInstructions;
  }

  public void setAggregationInstructions( String aggregationInstructions ) {
    this.aggregationInstructions = aggregationInstructions;
  }
}
