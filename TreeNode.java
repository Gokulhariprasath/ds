class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val= val;
    }
    public static void InorderTraversal(TreeNode root)
    {
        if(root!=null)
        {
            InorderTraversal(root.left);
            System.out.println(root.val+"");
            InorderTraversal(root.right);
        }
    }
    public static void preorderTraversal(TreeNode root)
    {
        if(root!=null)
        {
            System.out.println(root.val+"");
            preorderTraversal(root.left);
            
           preorderTraversal(root.right);
        }
    }
    public static void postorderTraversal(TreeNode root)
    {
        if(root!=null)
        {
            
          postorderTraversal(root.left);
            
           postorderTraversal(root.right);
           System.out.println(root.val+"");
 
        }
    }
    public static void main(String args[])
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.println("inorder tarversal");
        InorderTraversal(root);
        System.out.println();
        System.out.println("preorder trvarsal");
        preorderTraversal(root);
        System.out.println();
        System.out.println("podtorder traversal");
        postorderTraversal(root);
        System.out.println();
    }
}