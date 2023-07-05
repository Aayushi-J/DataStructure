public class Binary_Tree {
    Node root;
    class Node{
        Node left;
        Node right;
        int data;
        Node(){
            data=0;
            left=null;
            right=null;
        }
        
        Node(int a) {
            data = a;
            left = null;
            right = null;
        }
    }
    void insert(int a){
        root=insert(root,a);
    }
    Node insert(Node root, int a){
        if(root==null){
            root=new Node(a);
        }
        else{
            if(a<root.data){
                insert(root.left,a);
            }
            else{
                insert(root.right,a);
            }
        }
        return root;
    }
    void inorder(){
        inorder(root);
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
    }
    void search(Node root,int key){
        if(root==null){
            System.out.print("not found");
        }
        else{
            if(root.data==key){
                System.out.print("found");
            }
            else if(key<root.data){
                search(root.left,key);
            }
            else{
                search(root.right,key);
            }
        }
    }
    int external(Node root){
        if(root==null){
            return 0;
        }
        else if(root.left==null&&root.right==null){
            return 1;
        }
        else{
            int left=external(root.left);
            int right=external(root.right);
            return left+right;
        }
    }
    int internal(Node root){
        if(root==null||(root.left == null && root.right == null)){
            return 0;
        }
        else{
            int left = external(root.left);
            int right = external(root.right);
            return left + right+1;
        }
    }
    Node delete(Node root,int key){
        if(root==null){
            System.out.print("Nothing");
            return root;
        }
        else{
            if(key<root.data){
                root.left=delete(root.left,key);
            }
            else if(key>root.data){
                root.right=delete(root.right,key);
            }
            else{
                if(root.left==null){
                    return root.right;
                }
                else if(root.right==null){
                    return root.left;
                }
                else{
                    root.data=minval(root.right);
                    root.right=delete(root.right,root.data);
                }
            }
        }
        return root;
    }
int minval(Node root){
        int min=root.data;
        while(root.left!=null){
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
    void swap(Node root){
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        swap(root.left);
        swap(root.right);
        if(root.left!=null){
            System.out.print(root.left.data);
        }
        if (root.right != null) {
            System.out.print(root.right.data);
        }
    }
    int sum(Node root){
        if(root==null){
            return 0;
        }
        else{
            int left=sum(root.left);
            int right=sum(root.right);
            return left+right+root.data;
        }
    }
    int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            int left=height(root.left);
            int right=height(root.right);
            return Math.max(left,right)+1;
        }
    }
    int level(Node root,int key,int level){
        if(root==null){
            return 0;
        }
        else{
            if(key==root.data){
                return level;
            }
            else if(key<root.data){
                return level(root.left,key,level+1);
            }
            else{
                return level(root.right,key,level+1);
            }
        }
    }
    int min(Node root){
        if(root.left==null){
            return root.left.data;
        }
        else{
            return min(root.left);
        }
    }
    int count(Node root){
        if(root==null){
            return 0;
        }
        else{
            int left=count(root.left);
            int right=count(root.right);
            return left+right+1;
        }
    }
    Node delete1(Node root,int key){
        if(root==null){
            return root;
        }
        else{
            if(key>root.data){
                delete1(root.right,key);
            }
            else if(key<root.data){
                delete1(root.left,key);
            }
            else{
                root.data=minval1(root.right);
                root.right=delete1(root.right,root.data);
            }
        }
        return root;
    }
    int minval1(Node root){
        int min=root.data;
        while(root.left!=null){
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
    
}