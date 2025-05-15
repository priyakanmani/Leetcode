/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root==null) return "null";

        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();

        q.offer(root);

        while(!q.isEmpty()){

            TreeNode node=q.poll();

            if(node==null){
                sb.append("null,");
                continue;
            }
            sb.append(node.val).append(",");
            q.offer(node.left);
            q.offer(node.right);
        }
        
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if(data.equals("null")) return null;

        String nodes[]=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(nodes[0]));

        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);
        int i=1;
        while(!q.isEmpty() && i<nodes.length){

            TreeNode node=q.poll();

            if(!nodes[i].equals("null")){
                node.left=new TreeNode(Integer.parseInt(nodes[i]));
                q.offer(node.left);
            }
            i++;

            if(!nodes[i].equals("null")){
                node.right=new TreeNode(Integer.parseInt(nodes[i]));
                q.offer(node.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));