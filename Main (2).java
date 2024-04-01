/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
import java.io.*;

public class  Main{
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
    public static void levelOrderTraversal(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.remove();
            System.out.println(temp.data+" ");
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);

        }
    }
    public static void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }
    public static void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.println(root.data);
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args){
        //BinaryTree tree=new BinaryTree();
       root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.left=new Node(6);
       root.right.right=new Node(7);
       levelOrderTraversal();
       inOrderTraversal(root);
       preOrderTraversal(root);
       postOrderTraversal(root);
    }
}