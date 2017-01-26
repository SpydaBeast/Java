package com.Binary.Tree;

public class Main {

    Node root;

    public void addNode(){
        Node newNode = new Node(key, name);

        if(root == null){
            root = newNode;
        } else{
            Node focusNode = root;
            BIde parent
                    wihile(ture){
                parent = focusNode;
                if (key < focusNode.key){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = new ;
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
    }
}
class Node{

    int Key;
    String name;

    Node leftChild;
    Node RightChild;

    Node(int key, String name){
        this.Key = key;

    }

    @Override
    public String toString() {
        return name + " has a key " + key;
    }


}


