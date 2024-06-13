class Node {
  constructor(element) {
    this.element = element;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
    this.size = 0;
  }

  // Add an element at the end of the list
  add(element) {
    let node = new Node(element);
    if (this.head === null) {
      this.head = node;
    } else {
      let current = this.head;
      while (current.next) {
        current = current.next;
      }
      current.next = node;
    }
    this.size++;
  }

  // Remove an element from a specific index
  removeFrom(index) {
    if (index < 0 || index >= this.size) return "Invalid index";
    let current = this.head;
    let prev = null;
    if (index === 0) {
      this.head = current.next;
    } else {
      for (let i = 0; i < index; i++) {
        prev = current;
        current = current.next;
      }
      prev.next = current.next;
    }
    this.size--;
    return current.element;
  }

  // Print the list elements
  printList() {
    let curr = this.head;
    let str = "";
    while (curr) {
      str += curr.element + " ";
      curr = curr.next;
    }
    return str;
  }
}

// Example usage
let linkedList = new LinkedList();
linkedList.add(10);
linkedList.add(20);
console.log(linkedList.printList()); // Output: 10 20
linkedList.removeFrom(1);
console.log(linkedList.printList()); // Output: 10
