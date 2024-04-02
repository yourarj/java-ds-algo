package com.github.yourarj.queue;

public interface ICustomQueue {
  boolean add(int integer);

  boolean offer(int integer);

  Integer remove();

  Integer poll();

  Integer element();

  Integer peek();
}
