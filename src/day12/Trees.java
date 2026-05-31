package day12;

 class Node {
    
        int data;
        Node left;
       Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public class Trees{
        int idx=-1;
        public Node buildtree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;

            }
            Node nn=new Node(nodes[idx]);
            nn.left=buildtree(nodes);
            nn.right=buildtree(nodes);
            return nn;

        }
    public static void main(String[] args) {
        int nodes[]={90,80,70,-1,-1,85,-1,-1,100,95,-1,-1,110,-1,-1};
        Trees tr=new Trees();
        Node root=tr.buildtree(nodes);
        System.out.println("Root node:"  +root.data);
      
    }
}
    

