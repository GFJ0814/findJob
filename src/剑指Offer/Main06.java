package 剑指Offer;

import javax.jnlp.IntegrationService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by acer on 2016/9/9.
 * 重建二叉树
 * 题目描述

 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 则重建二叉树并返回。
 */
public class Main06 {
    private Node root;
    private class Node{
     int data;
     Node leftChild;
     Node rightChild;
    }

   public Node rebuildTree(int[] preOrder,int[] inOrder,int length){
    Node node=null;
    if(preOrder==null||inOrder==null||length<0){
      return null;
    }
    return rebuildTreeCore(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
   }

   public Node rebuildTreeCore(int[] preOder,int[] inOder,int startPreIndex,int endPreIndex,int startInIndex,int endInIndex){
    //如果只有一个节点:
    Node node=new Node();
    node.data=preOder[startPreIndex];
    /*if(startPreIndex==endPreIndex){
         if(startPreIndex==endInIndex){
           return node;
         }else{
           throw new RuntimeException("输入无效");
         }
    }*/
    //在中序遍历中找到根
    int i=startInIndex;
    while(i<=endInIndex&&inOder[i]!=preOder[startPreIndex]){
     i++;
    }
    //如果能够找到最后一个并且值还没找到的话，就是说明在中序序列中不存在这个根节点
   /* if(i==endInIndex&&inOder[i]!=preOder[startInIndex]){
     throw new RuntimeException("输入无效");
    }*/
    //能走到这一步说明找到了,接下来需要确定几个参数，
    // 前序遍历的开始索引位置，结束索引位置,中序开始的索引位置，结束的索引位置
    int length=i-startInIndex;//左子树的节点的个数
    int newStartPreIndex=startPreIndex+1;
    int newEndPreIndex=startPreIndex+length;
    int newStartInorderIndex=startInIndex;
    int newEndInorderIndex=i-1;
    if(length>0){
       //构建左子树
        node.leftChild=rebuildTreeCore(preOder,inOder,newStartPreIndex,newEndPreIndex,newStartInorderIndex,newEndInorderIndex);
    }
    //length代表左子树节点的个数,其最大的个数便是整个前序遍历的节点个数,
    // 如果比总的小，说明还有一部分节点是右节点。说明了存在右子树
    if(length<endPreIndex-startPreIndex){
       node.rightChild=rebuildTreeCore(preOder, inOder, newEndPreIndex + 1, endPreIndex, i + 1,endInIndex);
    }

    return node;
   }

   //中序遍历
   private List<Integer> listInorder=new ArrayList<Integer>() ;
   public void inOderPrint(TreeNode node){
    TreeNode temp=node;
    if(temp==null){
       throw new RuntimeException();
    }
    if(temp.left!=null){
        inOderPrint(temp.left);
    }
    listInorder.add(temp.val);
    if(temp.right!=null){
       inOderPrint(temp.right);
    }
   }

   private List<Integer> listPreorder=new ArrayList<Integer>() ;
   public void prePrint(TreeNode node){
       TreeNode temp=node;
    if(temp==null){
     throw  new RuntimeException();
    }
    listPreorder.add(temp.val);
    if(temp.left!=null){
        prePrint(temp.left);
    }
    if(temp.right!=null){
        prePrint(temp.right);
    }
   }

   public void print(List<Integer> list){
       for(int i:list){
           System.out.print(i+"  ");
       }
       System.out.println();
   }



        class TreeNode {
                 int val;
                 TreeNode left;
                 TreeNode right;
                 TreeNode(int x) { val = x; }
             }
        public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
            return root;
        }
        //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
        private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
            //如果起始下标大于结束下标，无效输入，终止程序
            if(startPre>endPre||startIn>endIn)
                return null;
            //前序遍历找到根节点
            TreeNode root=new TreeNode(pre[startPre]);

            for(int i=startIn;i<=endIn;i++)
                if(in[i]==pre[startPre]){
                    //i-startIn是左子树节点的个数，前序遍历起始值加上这个就是终点值
                    //i-1就是中序遍历左子树的终点，起始值是从0一直从0开始
                    root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                    //前序右子树遍历的起始值:startPre+i-startIn+1 前序右子树遍历的终点值:endPre
                    //中序遍历右子树的起始值:i+1,endIn
                    root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                }

            return root;
        }



    public static void main(String[] args) {
        Main06 m=new Main06();
       int[] preOrder={1,2,4,7,3,5,6,8};
       int[] inOrder={4,7,2,1,5,3,8,6};
        TreeNode node=m.reConstructBinaryTree(preOrder,inOrder);
        m.prePrint(node);
        m.inOderPrint(node);
        m.print(m.listPreorder);
        m.print(m.listInorder);
    }

}

