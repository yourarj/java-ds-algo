package com.github.yourarj.interview;

import org.junit.jupiter.api.Assertions;
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
    Assertions.assertEquals("2->4->", output.toString());
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
    Assertions.assertEquals("2->", output.toString());
  }
  @Test
  void removeNoElementsFromAllUniqueLinkedList() {
    LinkedListDeDuplication.SllNode input =
        LinkedListDeDuplication.SllNode.newFromArray(new int[] {1, 2, 3, 4});
    System.out.println(input);

    LinkedListDeDuplication target = new LinkedListDeDuplication();

    LinkedListDeDuplication.SllNode output = target.deduplicateLinkedList(input);

    System.out.println(output);
    Assertions.assertEquals("1->2->3->4->", output.toString());
  }

  @Test
  void doNothingOnEmptyLinkedList() {
    LinkedListDeDuplication.SllNode input =
            LinkedListDeDuplication.SllNode.newFromArray(new int[] {});
    System.out.println(input);

    LinkedListDeDuplication target = new LinkedListDeDuplication();

    LinkedListDeDuplication.SllNode output = target.deduplicateLinkedList(input);

    System.out.println(output);
    Assertions.assertEquals(null, output);
  }
  @Test
  void RemoveEverythingFromAllDuplicatedLinkedList() {
    LinkedListDeDuplication.SllNode input =
            LinkedListDeDuplication.SllNode.newFromArray(new int[] {100,100});
    System.out.println(input);

    LinkedListDeDuplication target = new LinkedListDeDuplication();

    LinkedListDeDuplication.SllNode output = target.deduplicateLinkedList(input);

    System.out.println(output);
    Assertions.assertEquals(null, output);
  }
}
