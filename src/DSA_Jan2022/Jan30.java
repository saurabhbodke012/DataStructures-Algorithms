package DSA_Jan2022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Jan30 {

    static class Node
    {
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
            left=right=null;
        }
    }


    public static int heightTree(Node root, int[] diameter){
        if(root ==  null){
            return 0;
        }
        int left= heightTree(root.left,diameter);
        int right= heightTree(root.right, diameter);

        diameter[0]= Math.max(diameter[0], left+right);

        return 1+ Math.max(left,right);
    }

    public static int diameter(Node root){
        int[] diameter=new int[1];
        heightTree(root, diameter);
        return diameter[0];
    }


    public static int sizeTree(Node root){
        if(root==null){
            return 0;
        }
        return 1+ sizeTree(root.left)+ sizeTree(root.right);
    }


    public static boolean childrenSum(Node root){

        if (root == null){
            return true;
        }

        if(root.left == null && root.right== null){
            return true;
        }

        int sum=0;
        if(root.left != null){
            sum = sum+root.left.key;
        }

        if(root.right!= null){
            sum = sum +root.right.key;
        }

        return (root.key == sum && childrenSum(root.left) && childrenSum(root.right));

    }

    public static void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr=q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }

    }

    private static Node prev=null;
    private static Node first=null, second=null;
    public static void fixBST(Node root){
        if(root==null){
            return;
        }

        fixBST(root.left);

        if(prev!= null && root.key< prev.key){
            if(first == null){
                first= prev;
            }
            second= root;
        }
        prev=root;
        fixBST(root.right);

    }

    public static void inorder(Node root){
        if (root ==  null){
            return;
        }

        inorder(root.left);
        System.out.println(root.key+ " ");
        inorder(root.right);
    }



    public static void main(String args[])
    {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(22);
        root.left.left=new Node(4);
        root.left.right=new Node(26);
        root.right.right=new Node(10);

        System.out.println(diameter(root));

    }
}
