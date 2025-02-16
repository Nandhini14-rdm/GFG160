//   Day 94 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/serialize-and-deserialize-a-binary-tree

class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        serPre(root, list);
        return list;
    }
    
    public static void serPre(Node root, ArrayList<Integer> list){
        if(root==null){
            list.add(-1);
            return;
        }
        list.add(root.data);
        serPre(root.left, list);
        serPre(root.right, list);
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        int[] temp = {0};
        return deSerPre(temp, arr);
    }
    
    public static Node deSerPre(int[] temp, ArrayList<Integer> arr){
        if(arr.get(temp[0])==-1){
            temp[0]++;
            return null;
        }
        
        Node root = new Node(arr.get(temp[0]));
        temp[0]++;
        
        root.left = deSerPre(temp, arr);
        root.right = deSerPre(temp, arr);
        
        return root;
    }
};
