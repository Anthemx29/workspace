import com.cparris.TreeTraversal.BinarySearchTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBinarySearchTree {

    public BinarySearchTree binarySearchTree;

    @Before
    public void beforeClass(){
        binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertNode(6);
        binarySearchTree.insertNode(3);
        binarySearchTree.insertNode(8);
        binarySearchTree.insertNode(1);
        binarySearchTree.insertNode(10);
        binarySearchTree.insertNode(7);
        binarySearchTree.insertNode(2);
    }

    @Test
    public void testBinarySearchTree(){

      Assert.assertTrue(binarySearchTree.getRootNode().value == 6);

    }

    @Test
    public void testBinarySearchTree_Search(){

        Assert.assertTrue(binarySearchTree.containsNode(2));
        Assert.assertFalse(binarySearchTree.containsNode(25));
    }

    @Test
    public void testBinarySearchTree_TraverseInOrder_DepthFirst(){
        binarySearchTree.traverseTreeInOrder(binarySearchTree.getRootNode());
    }

    @Test
    public void testBinarySearchTree_PreorderSearch_DepthFirst(){
        binarySearchTree.preorderTraversal(binarySearchTree.getRootNode());
    }

    @Test
    public void testBinarySearchTree_PostOrderSearch_DepthFirst(){
        binarySearchTree.postOrderTraversal(binarySearchTree.getRootNode());
    }
}
