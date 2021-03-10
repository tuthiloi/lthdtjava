/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong05.logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Lợii
 */
public class TreeDemoModel implements TreeModel{
DefaultTreeModel tree;
DefaultMutableTreeNode rootNodel;
    
    public TreeDemoModel() {
        ////khoi tao cay
        rootNodel =buidTree("Car&Motor");
        tree=new DefaultTreeModel(rootNodel);
    }
private DefaultMutableTreeNode buildTree(String rootName){
    DefaultMutableTreeNode root=new DefaultMutableTreeNode(rootName);
    //Xay dung cac nut con cho nut root
    DefaultMutableTreeNode car=new DefaultMutableTreeNode("Car");
    DefaultMutableTreeNode Motor=new DefaultMutableTreeNode("Motor");
    //Dua vao nut root
    root.add(car);
    root.add(Motor);
    //xay dung cac nut con cho car
    DefaultMutableTreeNode honda=new DefaultMutableTreeNode("honda");
    DefaultMutableTreeNode Mazda=new DefaultMutableTreeNode("Mazda");
    DefaultMutableTreeNode toyota=new DefaultMutableTreeNode("toyota");
    car.add(honda);
    car.add(toyota);
    car.add(Mazda);
    //motor
     DefaultMutableTreeNode suzuki=new DefaultMutableTreeNode("suzuki");
    DefaultMutableTreeNode yamaha=new DefaultMutableTreeNode("yamaha");
    car.add(suzuki);
    car.add(yamaha);
    //tra ve nút goc cua cay
    return root;
}

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNodel() {
        return rootNodel;
    }

    public void setRootNodel(DefaultMutableTreeNode rootNodel) {
        this.rootNodel = rootNodel;
    }

    @Override
    public Object getRoot() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.rootNodel;    
    }

    @Override
    public Object getChild(Object parent, int index) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    tree.removeTreeModelListener(l);
    }

    private DefaultMutableTreeNode buidTree(String carMotor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
