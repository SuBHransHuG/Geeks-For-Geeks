class Solution{
Node* buildTreeUtil(int in[], int post[], int inStrt, int inEnd, int postStrt, int postEnd) {
    // Base case
    if (inStrt > inEnd)
        return NULL;

    // Pick current node from Postorder traversal using postIndex and decrement postIndex
    Node* node = (Node*)malloc(sizeof(Node));
    node->data = post[postEnd];
    node->left = NULL;
    node->right = NULL;

    // If this node has no children then return
    if (inStrt == inEnd)
        return node;

    // Find index of current node in Inorder traversal
    int iIndex;
    for (iIndex = inStrt; iIndex <= inEnd; iIndex++) {
        if (in[iIndex] == node->data)
            break;
    }

    // Using index in Inorder traversal, construct left and right subtrees
    node->left = buildTreeUtil(in, post, inStrt, iIndex - 1, postStrt, postStrt - inStrt + iIndex - 1);
    node->right = buildTreeUtil(in, post, iIndex + 1, inEnd, postEnd - inEnd + iIndex, postEnd - 1);

    return node;
}

Node* buildTree(int in[], int post[], int n) {
    return buildTreeUtil(in, post, 0, n - 1, 0, n - 1);
  }
};
