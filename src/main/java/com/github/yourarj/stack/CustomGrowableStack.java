package com.github.yourarj.stack;

public class CustomGrowableStack extends CustomStack {
  public CustomGrowableStack() {
    super();
  }

  public CustomGrowableStack(int size) {
    super(size);
  }

  @Override
  public int push(int item) throws IllegalStateException {
    if (isFull()) {
      int[] grownData = new int[this.data.length * 2];
      System.arraycopy(this.data, 0, grownData, 0, this.data.length);
      this.data = grownData;
    }
    super.push(item);
    return item;
  }
}
