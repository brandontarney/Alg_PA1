/** Abstract Tree that implements Tree interface
 * 
 * Modified and used by
 * @author Brandon Tarney 2/15/16
 * 
 * Original code was provided by "Introduction to Java Programming" 
 * 8th Edition by Y. Daniel Liang, pages 858 - 869
 *
 *  This code is used for educational purposes only
 *  in 605.421 Foundations of Algorithms. 
 *  
 * @version 2: Added Height(), postOrderTraversal(), getNumberOfLeaves(), getNumberofNonLeaves() methods
 */

package com.tarney.tree;

public abstract class AbstractTree<E extends Comparable<E>>
    implements Tree<E> {
	
  /** Inorder traversal from the root*/
  public void inorder() {
  }

  /** Postorder traversal from the root */
  public void postorder() {
  }

  /** Preorder traversal from the root */
  public void preorder() {
  }

  /** Return true if the tree is empty */
  public boolean isEmpty() {
    return getSize() == 0;
  }

  /** Return an iterator to traverse elements in the tree */
  public java.util.Iterator iterator() {
    return null;
  }
}
