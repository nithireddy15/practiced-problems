import java.util.*;
import java.io.*;

public class  BinaryTree{
    static class Node{
        int data;
         Node left;
        Node right;
        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    public static Node root;
    public static void main(String[] args){
        //BinaryTree tree=new BinaryTree();
       root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.left=new Node(6);
       root.right.right=new Node(7);
    }
}