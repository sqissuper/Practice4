package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BTNode {
    public int val;
    public BTNode left;
    public BTNode right;

    public BTNode(int val) {
        this.val = val;
    }
}
public class Main1 {
    //从前序与中序遍历序列构造二叉树
//    public int predex = 0;
//    public TreeNode buildTreeC(int[] preorder, int[] inorder, int begin, int end) {
//        if(begin > end) return null;
//        TreeNode root = new TreeNode(preorder[predex]);
//        int index = findTravel(inorder,begin,end,preorder[predex]);
//        predex++;
//        root.left = buildTreeC(preorder,inorder,begin,index - 1);
//        root.right = buildTreeC(preorder,inorder,index + 1,end);
//        return root;
//    }
//    public int findTravel(int[] inorder,int begin,int end,int key) {
//        for(int i = begin; i <= end; i++) {
//            if(inorder[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        if(preorder == null || inorder == null) return null;
//        if(preorder.length == 0 || inorder.length == 0) return null;
//        int begin = 0, end = preorder.length - 1;
//        return buildTreeC(preorder,inorder,begin,end);
//    }

    //先中序遍历添加到链表
//    List<Integer> list = new ArrayList<>();
//    public void midTree(TreeNode root) {
//        if(root == null) return;
//        midTree(root.left);
//        list.add(root.val);
//        midTree(root.right);
//    }
//
//    public TreeNode increasingBST(TreeNode root) {
//        midTree(root);
//        if(!list.isEmpty()) {
//            TreeNode node = new TreeNode(list.get(0));
//            TreeNode head = new TreeNode(0,null,node);
//            for(int i = 1; i < list.size(); i++) {
//                node.right = new TreeNode(list.get(i));
//                node = node.right;
//            }
//            return head.right;
//        }
//        return null;
//    }

    //二叉树的层序遍历
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> list = new ArrayList<>();
//        if(root == null) return list;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()) {
//            List<Integer> ret = new ArrayList<>();
//            int size = queue.size();
//            while(size != 0) {
//                TreeNode cur = queue.poll();
//                ret.add(cur.val);
//                if(cur.left != null) {
//                    queue.offer(cur.left);
//                }
//                if(cur.right != null) {
//                    queue.offer(cur.right);
//                }
//                size--;
//            }
//            list.add(ret);
//
//        }
//        return list;
//
//    }

    //相同的树
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p == null && q != null || p != null && q == null) return false;
//        if(p == null && q == null) return true;
//        if(p.val != q.val) return false;
//
//        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//    }

    //另一棵树的子树
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p == null && q != null || p != null && q == null) return false;
//        if(p == null && q == null) return true;
//        if(p.val != q.val) return false;
//
//        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//    }
//    public boolean isSubtree(TreeNode s, TreeNode t) {
//        if(s == null || t == null) return false;
//        if(isSameTree(s,t)) return true;
//        if(isSubtree(s.left,t)) return true;
//        if(isSubtree(s.right,t)) return true;
//        return false;
//    }

    //对称二叉树
//    public boolean isSymmetricChild(TreeNode left,TreeNode right) {
//        if(left == null && right != null || right == null && left != null) return false;
//        if(left == null && right == null) return true;
//        if(left.val != right.val) return false;
//        return isSymmetricChild(left.left,right.right) && isSymmetricChild(right.left,left.right);
//
//    }
//    public boolean isSymmetric(TreeNode root) {
//        if(root == null) return true;
//        return isSymmetricChild(root.left,root.right);
//    }

    //平衡二叉树
//    public int getHigh(TreeNode root) {
//        if(root == null) return 0;
//        int lh = getHigh(root.left);
//        int rh = getHigh(root.right);
//        return lh > rh ? lh + 1 : rh + 1;
//    }
//    public boolean isBalanced(TreeNode root) {
//        if(root == null) return true;
//        int left = getHigh(root.left);
//        int right = getHigh(root.right);
//        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
//    }

    //找最近公共祖先
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root == null) return null;
//        if(root == q || root == p) return root;
//        TreeNode left = lowestCommonAncestor(root.left,p,q);
//        TreeNode right = lowestCommonAncestor(root.right,p,q);
//        if(left != null && right != null) return root;
//        if(left != null) {
//            return left;
//        }
//        if(right != null) {
//            return right;
//        }
//        return null;
//    }

    //将二叉搜索树转换为双向链表
//    public TreeNode prev = null;
//    public void ConvertChild(TreeNode Tree) {
//        if(Tree == null) return;
//        ConvertChild(Tree.left);
//        Tree.left = prev;
//        if(prev != null) {
//            prev.right = Tree;
//        }
//        prev = Tree;
//        ConvertChild(Tree.right);
//    }
//    public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree == null) return null;
//        ConvertChild(pRootOfTree);
//        TreeNode head = pRootOfTree;
//        while(head.left != null) {
//            head = head.left;
//        }
//        return head;
//    }

    //根据二叉树创建字符串
//    public void tree2strC(TreeNode t,StringBuilder sb) {
//        if(t == null) return;
//        sb.append(t.val);
//        if(t.left == null) {
//            if(t.right == null) {
//                return;
//            } else {
//                sb.append("()");
//            }
//
//        } else {
//            sb.append("(");
//            tree2strC(t.left,sb);
//            sb.append(")");
//        }
//        if(t.right == null) {
//            return;
//        } else {
//            sb.append("(");
//            tree2strC(t.right,sb);
//            sb.append(")");
//        }
//    }
//    public String tree2str(TreeNode t) {
//        StringBuilder sb = new StringBuilder();
//
//        tree2strC(t,sb);
//        return sb.toString();
//    }
    public static void main(String[] args) {

    }
}
