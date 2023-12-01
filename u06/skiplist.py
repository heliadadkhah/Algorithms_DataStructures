import random
import time

class Node:
    def __init__(self, k, v=None):
        self.key = k
        self.value = v
        self.succ = None
        self.down = None

class SkipList:
    def __init__(self, p=0.5):
        #  Zu Beginn besteht die Skipliste nur aus der untersten Liste,
        #  welche aus den Pseudoknoten besteht.
        self.p = p
        self.head = Node(float('-inf'))
        self.tail = Node(float('inf'))
        self.head.succ = self.tail
        self.max_level = 1

    def search(self, k):
        Q = []
        node = self.head
        print (node.succ)
        #here try to use while
        for level in range(self.max_level, 0,-1):
            while node.succ is not None and node.succ.key <= k:
                node = node.succ
            #appending the last visited node of each layer to the stack
            Q.append(node)
            if node.down :
                node = node.down
        print("--------------")
        return Q
    

    def insert(self, k, v=None, h=None):
        preds = self.search(k)
        pred_node = preds.pop()

        #if key's already there, just updating tha value
        if pred_node.key == k:
            pred_node.value = v
            return
        
        #insert a new node if not found, after pred
        #if the node is not found, we can infer that
        #we are located in the lowest level
        new_node = Node(k,v)
        new_node.succ = pred_node.succ
        pred_node.succ = new_node
        
        #adding the new node randomly to the higher levels
        #starting from the lowest level
        #in case the height is determined
        if h != None:
            #creates the necessary number of levels
            if len(preds) != h:
                new_level_head = Node(float('-inf'),None)
                new_level_tail = Node(float('inf'),None)
                new_level_head.succ = new_level_tail
                new_level_head.down = self.head
                self.head = new_level_head
                self.max_level += 1
                preds.append(self.head)
            #insert to the higher level
            pred_node = preds.pop()
            upper_node = Node(k,v)
            upper_node.succ = pred_node.succ
            pred_node.succ = upper_node
            upper_node.down = new_node
            new_node = upper_node
        else:
            while random.random() <= self.p:
                if len(preds) == 1:
                    new_level_head = Node(float('-inf'),None)
                    new_level_tail = Node(float('inf'),None)
                    new_level_head.succ = new_level_tail
                    new_level_head.down = self.head
                    self.head = new_level_head
                    self.max_level += 1
                    preds.append(self.head)
                #insert to the higher level
                pred_node = preds.pop()
                upper_node = Node(k,v)
                upper_node.succ = pred_node.succ
                pred_node.succ = upper_node
                upper_node.down = new_node
                new_node = upper_node

    def remove(self, k):
        preds = self.search(k)
        node = preds.pop()

        if node.succ is None or node.succ.key != k:
            raise Exception("Key not found")
        while node:
            if node.succ and node.succ.key == k:
                node.succ = node.succ.succ
            if not preds:
                break
            node = preds.pop()
        
        while self.head.succ is self.tail and self.max.level > 1:
            self.head = self.head.down
            self.max_level -= 1
    #chatgpt generated print
    def print_skip_list(self):
        node = self.head
        level = 1
        while node:
            print(f"Level {level}: ", end='')
            current = node.succ
            while current and current.key != float('inf'):
                print(f"{current.key} ", end='')
                current = current.succ
            print()
            node = node.down
            level += 1

# Test from A55
skiplist = SkipList(p=0.4)
skiplist.insert(1, h=1)
skiplist.insert(3,h=2)
skiplist.insert(5, h= 4)
skiplist.insert(6, h=3)
skiplist.insert(8, h=6)
skiplist.insert(9, h=1)
skiplist.insert(10, h=1)
print(skiplist.search(4))
print(skiplist.search(6))
skiplist.insert(2, h=3)
skiplist.print_skip_list()