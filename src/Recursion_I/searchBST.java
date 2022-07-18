package Recursion_I;

public class searchBST {
    public TreeNode searchBST(TreeNode root, int val) {

        if(root == null || root.val == val){
            return root;
        }

        return val<root.val ? searchBST(root.left,val) :  searchBST(root.right, val);

    }

}
