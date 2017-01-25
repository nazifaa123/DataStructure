/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author nazifabegum
 */
public class WordStoreImp implements WordStore
{
    private Node root;
    public WordStoreImp(int n)
    {
        root = null;
    }

    public void add(String data)
    {
        root = insert(root, data);
    }

    public Node insert(Node root, String data)
    {
        if (root == null)
            root = new Node(data);
        else
        {
            if(data.equals(root.data))
            {
                root.occurrence++;
            }
            else if (data.compareTo(root.data) > 0)
                root.right = insert(root.right, data);
            else
                root.left = insert(root.left, data);             
        }
        return root;
    }

    public int count(String data)
    {
        Node current = root;
        while(current!=null){
            if((current.data).equals(data))
                return current.occurrence;
            else if(data.compareTo(current.data) < 0)
                current = current.left;
            else
                current = current.right;
        }
        return 0;
    }

    public void remove(String data)
    {
        root = delete(root,data);
    }

    public Node delete(Node root, String data)
    {
        //if tree is null
        if (root == null)  
            return null;  
        //if node is found
        if(root.data.equals(data) && root.occurrence > 1)
        {
            root.occurrence--;
        }
        else if(root.data.equals(data))
        {
            //if node has 2 children
            if(root.left != null && root.right != null)
            {
                Node current = root;
                //finding minimum element from the right
                Node replacement = minRight(current.right);
                //replacing current node with minimum element from right subtree
                root.data = replacement.data;
                root.occurrence = replacement.occurrence;
                //deleting minimum node from the right
                delete(root.right, replacement.data);//root=
            }
            //if node has left child
            else if(root.left != null)
            {
                root = root.left;
            }
            //if node has right child
            else if(root.right != null)
            {
                root = root.right;
            }
            //if node does not have a child
            else
            {
                root = null;
            }
        }
        //if node is to the left of the root
        else if (data.compareTo(root.data) < 0) 
        {  
            root.left = delete(root.left, data);  
        } 
        //if node is to the right of the root
        else if (data.compareTo(root.data) > 0) 
        {  
            root.right = delete(root.right, data);  
        }
        return root;
    }

    //get minimum element
    public Node minRight(Node root)
    {
        if(root.left == null)
        {
            return root;
        }
        else
        {
            return minRight(root.left);
        }
    }

    public void display(Node root)
    {
        if(root!=null){
            display(root.left);
            System.out.println(root.occurrence +". " + root.data);
            display(root.right);
        }
    }

    class Node
    {
        String data;
        Node left;
        Node right; 
        int occurrence;
        public Node(String data){
            this.data = data;
            left = null;
            right = null;
            occurrence = 1;
        }

        public void setData(String d) {
            this.data = d;
        }

        public String getData() {
            return data;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getLeft() {
            return left;
        }

        public void setRight(Node right ) {
            this.right = right;
        }

        public Node getRight() {
            return right;
        }
    }

}
