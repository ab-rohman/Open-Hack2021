package JavaBinaryTree;

/**
 *
 * @author LENOVO
 */
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        root = null;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public void add(int data){
       if(isEmpty()){
           root = new Node(data);
       } else {
           Node tmp = root;
           while(true){ 
            if(data < tmp.data){
                if(tmp.left != null){
                    tmp = tmp.left;
                } else {
                    tmp.left = new Node(data);
                    break;
                }
            } else if(data > tmp.data){
                if(tmp.right != null){
                    tmp = tmp.right;
                } else {
                    tmp.right = new Node(data);
                    break;
                }
            } else {
                break;//Data has already exist
            }
        }
       }
    }
    
    public boolean find(int data){
        boolean hasil = false;
        Node tmp = root;
        while(tmp != null){
            if(tmp.data == data){
                hasil = true;
                break;
            } else if (data < tmp.data){
                tmp = tmp.left;
            } else {
                tmp = tmp.right;
            }
        }
        return hasil;
    }
    
    public void traversePreOrder(Node node){
        if(node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    public void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    public void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    
    public Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while(successorParent.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successorParent != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    public void delete(int data){
        if(isEmpty()){
            System.out.println("Tree masih kosong");
            return;
        }
        
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            } else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data > current.data){
                parent =  current;
                current = current.right;
                isLeftChild = false;
            }
        }
        
        if(current==null){
            System.out.println("Tidak dapat menemukan data!");
            return;
        } else{
            if(current.left==null && current.right==null){
                if(current==root){
                    root = null;
                } else {
                    if(isLeftChild){
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left == null){
                if(current == root){
                    root = current.right;
                } else {
                    if(isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null){
                if(current==root){
                    root = current.right;
                } else {
                    if(isLeftChild){
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if(current==root){
                    successor = root;
                } else {
                    if(isLeftChild){
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
        
        
    }
}