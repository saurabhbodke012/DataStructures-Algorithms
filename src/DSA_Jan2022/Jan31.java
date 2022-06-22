package DSA_Jan2022;

import java.util.LinkedList;
import java.util.Queue;

public class Jan31 {

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

    private static int maxLevel=0;

    public static int maximumTree(Node root){

        if(root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.key, Math.max(maximumTree(root.left), maximumTree(root.right)));

    }

    public static void leftView(Node root, int level){
        if(root ==  null){
            return;
        }

        if(maxLevel< level){
            System.out.print(root.key + " ");
            maxLevel= level;
        }
        leftView(root.left, level+1);
        leftView(root.right, level+1);
    }

    public static int maxWidthOfTree(Node root){
        if(root==null){
            return 0;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int width=0;
        while(q.size()>1){
            Node curr=q.poll();
            if(curr==null){
                width= Math.max(width, q.size());
                q.add(null);
                continue;
            }

            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }

        return width;
    }



    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.left.left=new Node(80);
        root.right.right=new Node(60);
        root.right.left= new Node(50);


//        System.out.println(maximumTree(root));
//        leftView(root,1);
        System.out.println(maxWidthOfTree(root));
    }

}
