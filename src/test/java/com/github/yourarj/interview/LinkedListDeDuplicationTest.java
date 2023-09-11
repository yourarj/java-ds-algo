package com.github.yourarj.interview;

import org.junit.jupiter.api.Test;

class LinkedListDeDuplicationTest {

  // test 1 -> 1 -> 1 -> 2 -> 3 -> 3 -> 4
  @Test
  void deduplicateLinkedList() {
    LinkedListDeDuplication.SllNode input =
        LinkedListDeDuplication.SllNode.newFromArray(new int[] {1, 1, 1, 2, 3, 3, 4});
    System.out.println(input);
    LinkedListDeDuplication target = new LinkedListDeDuplication();

    LinkedListDeDuplication.SllNode output = target.deduplicateLinkedList(input);

    System.out.println(output);
  }

  // test 1 -> 1 -> 1 -> 2 -> 3 -> 3 -> 4 -> 4
  @Test
  void deduplicateLinkedList2() {
    LinkedListDeDuplication.SllNode input =
        LinkedListDeDuplication.SllNode.newFromArray(new int[] {1, 1, 1, 2, 3, 3, 4, 4});
    System.out.println(input);

    LinkedListDeDuplication target = new LinkedListDeDuplication();

    LinkedListDeDuplication.SllNode output = target.deduplicateLinkedList(input);

    System.out.println(output);
  }
}
