You are given a collection of singly-linked lists (SLLs). Return true of any if them share a common node (or
“intersect”), or false otherwise.

### Additional notes:

- Please don’t use recursion. Assume the SLLs might be very large in length (in the millions).
- Stop traversing and return immediately if you detect a common node.
- If a cycle is detected, please throw an error.
- Aim to be as efficient as possible from a time complexity perspective.

Implement this function with this signature:

```java
DoLinkedListsIntersect(Collection<SinglyLinkedList>)returns bool
```

Input:
Your program should read lines of text from the standard input in `Codevue`. The first lines of the input will describe
the singly-linked-lists in a directed acyclic graph (DAG) format. The graph description language is a similar idea to
the GraphViz graph description language, see: https://en.wikipedia.org/wiki/DOT_(graph_description_language).

Each node is described as a string token, which is a unique identifier for the node. So `“a->b”` means a DAG with
node `“a”` directionally connected to node `“b”`. As we are describing singly-linked-lists, take it as a given that the
out degree of every node is either zero or one.

After each of the edges has been described, then each subsequent line will include set of SLL starting nodes to traverse
from. We advise that you draw a diagram to help you understand the example more clearly.

`Note: we have added an attachment image to show this visually.`

### Output:

For each SLL print `'True'` or `'False'` based on the return value of your function

```
-> true prints True
-> false prints False
-> On throwing an error print Error  Thrown!
```

**Test 1**

```
Test Input
a->b
r->s
b->c
x->c
q->r
y->x
w->z
a,q,w
a,c,r
y,z,a,r
a,w

Expected Output
False
True
True
False
```

**Test 2**

```
Test Input
A->B
G->B
B->C
C->D
D->E
H->J
J->F
A,G,E
H,A

Expected Output
True
False
```

**Test 3**

```
Test Input
ABC->BCD
BCD->CDE
DEF->EFG
EFG->BCD
123->456
ABC,CDE
123,DEF
ABC,DEF

Expected Output
True
False
True
```

**Test 4**

```
Test Input
X->Y
Y->X
A->B
B->C
X,A

Expected Output
Test 4 Output
Error Thrown!
```