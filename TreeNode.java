package milestone2;

public class TreeNode {
    char character; // Stores the character (A-Z)
    TreeNode left;  // Dot (.) goes to the left
    TreeNode right; // Dash (-) goes to the right

    public TreeNode() {
        this.character = '\0'; // Empty character by default
    }
}
