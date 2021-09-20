package Binary_Tree;


public class MergeTwoTrees  {
    int data;
    MergeTwoTrees left;
    MergeTwoTrees right;

    public MergeTwoTrees(int data, MergeTwoTrees left, MergeTwoTrees right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /* Helper method that allocates a new node with the
    given data and NULL left and right pointers. */
    static MergeTwoTrees newNode(int data)
    {
        return new MergeTwoTrees(data, null, null);
    }
   static public void Inorder(MergeTwoTrees root)
    {
        if(root==null)return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
  static   public MergeTwoTrees MergeTree(MergeTwoTrees root1, MergeTwoTrees root2)
    {
        if(root1==null)return root2;
        if(root2==null) return root1;
        root1.data+=root2.data;
        root1.left=MergeTree(root1.left,root2.left);
        root1.right=MergeTree(root1.right,root2.right);
        return root1;
    }

    public static void main(String[] args) {

        MergeTwoTrees root1 = newNode(1);
        root1.left = newNode(3);
        root1.right = newNode(2);
        root1.left.left = newNode(5);



        MergeTwoTrees root2 = newNode(2);
        root2.left = newNode(1);
        root2.right = newNode(3);
        root2.left.right = newNode(4);
        root2.right.right = newNode(7);
        //Inorder(root2);

        MergeTwoTrees root3=MergeTree(root1,root2);
       Inorder(root3);

    }





}
