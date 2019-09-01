package com.suri.microservices.limitsservice.bean;

/**
 * @Author: atekumar
 * @Current-Version: 1.0.0
 * @Creation-Date: 31/08/19
 * @Description: (Overwrite)
 * 1. Please describe the business usage of the class.
 * 2. Please describe the technical usage of the class.
 * @History:
 */
public class LimitConfiguration {

  private int minimum;
  private int maximum;

  public LimitConfiguration(int minimum, int maximum) {
    this.minimum = minimum;
    this.maximum = maximum;
  }

  public int getMinimum() {
    return minimum;
  }

  public void setMinimum(int minimum) {
    this.minimum = minimum;
  }

  public int getMaximum() {
    return maximum;
  }

  public void setMaximum(int maximum) {
    this.maximum = maximum;
  }
}